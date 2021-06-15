package com.fastlane.yeoshin.controller.member;

import com.fastlane.yeoshin.common.entity.FastlaneExceptionEntity;
import com.fastlane.yeoshin.common.entity.FastlaneResponseEntity;
import com.fastlane.yeoshin.common.enumtype.MemberConstants;
import com.fastlane.yeoshin.common.exception.FastlaneException;
import com.fastlane.yeoshin.service.MemberService;
import com.fastlane.yeoshin.vo.ChangeMemberInfoVo;
import com.fastlane.yeoshin.vo.MemberVo;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    MemberService memberService;

    private static final Gson gson = new Gson();

    @PostMapping("/signUp")
    public ResponseEntity signUp(MemberVo memVo) throws FastlaneException {
        memberService.signUp(memVo);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(FastlaneResponseEntity.builder()
                        .status(HttpStatus.OK.toString())
                        .message(MemberConstants.SUCCESS_MEMBER_SIGN_UP.getMessage())
                        .build());
    }

    @PutMapping("/changePasswd")
    public ResponseEntity changePasswd(ChangeMemberInfoVo chgMemInfoVo) throws FastlaneException {
        memberService.changePasswd(chgMemInfoVo);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(FastlaneResponseEntity.builder()
                        .status(HttpStatus.OK.toString())
                        .message(MemberConstants.SUCCESS_MEMBER_CHANGE_PASSWD.getMessage())
                        .build());
    }

    @DeleteMapping("/deleteMember")
    public ResponseEntity deleteMember(MemberVo memVo) throws FastlaneException {
        memberService.deleteMember(memVo);

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(FastlaneResponseEntity.builder()
                        .status(HttpStatus.OK.toString())
                        .message(MemberConstants.SUCCESS_DELETE_MEMBER.getMessage())
                        .build());
    }
}
