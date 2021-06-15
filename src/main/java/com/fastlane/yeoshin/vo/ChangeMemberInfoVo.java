package com.fastlane.yeoshin.vo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class ChangeMemberInfoVo extends MemberVo{

    @NotEmpty(message = "변경할 비밀번호를 입력해주세요.")
    private String newpasswd;
}
