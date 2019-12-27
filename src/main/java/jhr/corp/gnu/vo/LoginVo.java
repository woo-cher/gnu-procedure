package jhr.corp.gnu.vo;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class LoginVo {
    private String classof;
    private String code;
    private String password;
    private String host;
    private String group;
    private String O_LOGIN_PASS_YN;
    private String O_RSLT_CODE;
    private Integer O_WRONG_CNT;
    private String O_MSG;
}
