package com.fastlane.yeoshin.common.enumtype;

import lombok.Getter;

@Getter
public enum MemberError {
    PASSWD_NOT_MATCH_ERROR("정보가 존재하지 않거나 비밀번호가 일치하지 않습니다."),
    EXIST_ID_ERROR("이미 존재하는 ID 입니다.");

    private String errorMsg;

    MemberError(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    public String getErrorMessage() {
        return errorMsg;
    }
}
