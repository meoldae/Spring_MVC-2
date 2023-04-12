package hello.login.domain.member;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class Member {
    private Long id; // DB에 저장되고 관리하는 ID

    @NotEmpty
    private String loginId; // 사용자가 입력하는 ID

    @NotEmpty
    private String name;

    @NotEmpty
    private String password;


}
