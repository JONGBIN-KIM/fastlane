package com.fastlane.yeoshin.common.exception;

import com.fastlane.yeoshin.common.enumtype.MemberError;

public class FastlaneException extends Exception {

    String errorMsg;

    public FastlaneException(String errorMsg) {
        super(errorMsg);
        this.errorMsg = errorMsg;
    }
}
