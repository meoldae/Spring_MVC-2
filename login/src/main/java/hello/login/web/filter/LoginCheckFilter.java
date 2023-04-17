package hello.login.web.filter;

import hello.login.web.SessionConst;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.PatternMatchUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Slf4j
public class LoginCheckFilter implements Filter {

    private static final String[] whiteList = {"/", "/members/add", "/login", "/css/*"};

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();

        HttpServletResponse httpResponse = (HttpServletResponse) response;

        try {
            log.info("Login 인증 필터 시작 {}", requestURI);
            if (isLoginCheckPath(requestURI)) {
                log.info("Login 인증 로직 실행 {}", requestURI);
                HttpSession session = httpRequest.getSession(false);
                if (session == null || session.getAttribute(SessionConst.LOGIN_MEMBER) == null) {
                    log.info("인증이 필요한 사용자 요청 {}", requestURI);
                    // Login Page 로 리다이렉트하되, 로그인 성공하면 원래 페이지로 돌아오게 함!
                    httpResponse.sendRedirect("/login?redirectURL=" + requestURI);
                    return;
                }
            }
            chain.doFilter(request, response);
        } catch (Exception e) {
            /*
            WAS까지 예외를 올려보내야 함
            여기서 예외처리를 해버리면 정상 동작처럼 보임
             */
            throw e;
        } finally {
            log.info("Login 인증 필터 종료 {}", requestURI);
        }
    }

    /**
     * White List 에 속하지 않으면 로그인 체크
     */
    private boolean isLoginCheckPath(String requestURI) {
        return !PatternMatchUtils.simpleMatch(whiteList, requestURI);
    }
}
