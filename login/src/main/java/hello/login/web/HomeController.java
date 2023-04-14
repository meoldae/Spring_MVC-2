package hello.login.web;

import hello.login.domain.member.Member;
import hello.login.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HomeController {

    @Autowired
    private final MemberRepository memberRepository;

    // @GetMapping("/")
    public String home() {
        return "home";
    }

    // 로그인 처리가 되는 Form 화면
    @GetMapping("/")
    public String homeLogin(@CookieValue(name = "memberId", required = false) Long memberId, Model model) {
        if (memberId == null) return "home";

        Member loginMember = memberRepository.findById(memberId);
        if (loginMember == null) return "home";

        model.addAttribute("member", loginMember);
        return "loginHome";
    }
}