package com.fastlane.yeoshin.common.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class FastlaneExceptionEntity {
    private String status;
    private String message;

    @Builder
    public FastlaneExceptionEntity(String errorCode, String errorMsg){
        this.status = errorCode;
        this.message = errorMsg;
    }
}
