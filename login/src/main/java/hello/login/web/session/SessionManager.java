package hello.login.web.session;

import org.springframework.stereotype.Component;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class SessionManager {
    private static final String COOKIE_SESSION_NAME = "mySessionId";

    private static final Map<String, Object> sessionStore = new ConcurrentHashMap<>();

    public void createSession(Object value, HttpServletResponse response) {

        String sessionId = UUID.randomUUID().toString();

        sessionStore.put(sessionId, value);

        Cookie cookie = new Cookie(COOKIE_SESSION_NAME, sessionId);
        response.addCookie(cookie);
    }

    public Object getSession(HttpServletRequest request){
        Cookie cookie = getCookieByName(request, COOKIE_SESSION_NAME);
        if (cookie != null) {
            return sessionStore.get(cookie.getValue());
        }
        return null;
    }

    public void expire(HttpServletRequest request) {
        Cookie cookie = getCookieByName(request, COOKIE_SESSION_NAME);
        if (cookie != null) {
            sessionStore.remove(cookie.getValue());
        }
    }

    public Cookie getCookieByName(HttpServletRequest request, String cookieSessionName) {
        if (request.getCookies() == null) return null;

        return Arrays.stream(request.getCookies())
                .filter(cookie -> cookieSessionName.equals(cookie.getName()))
                .findAny()
                .orElse(null);
    }
}
