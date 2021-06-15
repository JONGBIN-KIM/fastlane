package com.fastlane.yeoshin.vo;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class ChangeMemberInfoVo extends MemberVo{

    @NonNull
    private String newpasswd;
}
