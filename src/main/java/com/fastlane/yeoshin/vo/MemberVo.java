package com.fastlane.yeoshin.vo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Getter
@Setter
public class MemberVo implements Serializable {

    @NotEmpty(message = "ID를 입력해주세요.")
    private String id;

    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String passwd;
}
