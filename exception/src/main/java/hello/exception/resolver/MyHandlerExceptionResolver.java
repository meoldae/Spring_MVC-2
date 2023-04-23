package hello.exception.resolver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        try {
            // 에러 여기서 먹어버림
            if (ex instanceof IllegalArgumentException) {
                log.info("IllegalArgumentException Resolver");
                response.sendError(HttpServletResponse.SC_BAD_REQUEST);
                /*
                 * 새 응답 만들어서 반환 => 정상 처리
                 * ModelAndView 가 비어있으므로 렌더링 X
                 * Exception을 SendError로 바꿔치기 함
                 * sendError가 발생했으므로 WAS는 오류 페이지를 찾으러 감
                 */
                return new ModelAndView();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}