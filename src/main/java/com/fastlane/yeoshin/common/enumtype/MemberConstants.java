package com.fastlane.yeoshin.common.enumtype;

import lombok.Getter;

@Getter
public enum MemberConstants {
    SUCCESS_MEMBER_SIGN_UP("회원가입 성공"),
    SUCCESS_MEMBER_CHANGE_PASSWD("비밀번호 변경 성공"),
    SUCCESS_DELETE_MEMBER("회원삭제 성공");

    private String message;

    MemberConstants(String message) {
        this.message = message;
    }
    public String getErrorMessage() {
        return message;
    }
}
