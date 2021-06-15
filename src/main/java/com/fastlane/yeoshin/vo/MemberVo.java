package com.fastlane.yeoshin.vo;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MemberVo implements Serializable {

    private String id;

    private String passwd;
}
