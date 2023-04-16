package hello.login.web.session;

import hello.login.domain.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import static org.assertj.core.api.Assertions.*;

class SessionManagerTest {

    SessionManager sessionManager = new SessionManager();

    @Test
    void SessionTest(){

        // 서버에서 쿠키 생성해서 Response 에 담아 반환
        MockHttpServletResponse response = new MockHttpServletResponse();
        Member member = new Member();
        sessionManager.createSession(member, response);

        // 쿠키로 세션 조회
        MockHttpServletRequest request = new MockHttpServletRequest();
        request.setCookies(response.getCookies());
        Object sessionMember = sessionManager.getSession(request);
        assertThat(member).isEqualTo(sessionMember);

        // 세션 삭제 확인
        sessionManager.expire(request);
        Object expired = sessionManager.getSession(request);
        assertThat(expired).isNull();
    }
}