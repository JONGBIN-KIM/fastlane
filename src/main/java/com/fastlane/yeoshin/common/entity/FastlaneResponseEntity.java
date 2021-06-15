package com.fastlane.yeoshin.common.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
public class FastlaneResponseEntity {
    private String status;
    private String message;

    @Builder
    public FastlaneResponseEntity(String status, String message){
        this.status = status;
        this.message = message;
    }
}
