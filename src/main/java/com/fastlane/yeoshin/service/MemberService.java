package com.fastlane.yeoshin.service;

import com.fastlane.yeoshin.common.exception.FastlaneException;
import com.fastlane.yeoshin.vo.ChangeMemberInfoVo;
import com.fastlane.yeoshin.vo.MemberVo;

public interface MemberService {
    void  signUp(MemberVo memberVo) throws FastlaneException;
    void  changePasswd(ChangeMemberInfoVo chgMemInfoVo) throws FastlaneException;
    void  deleteMember(MemberVo memberVo) throws FastlaneException;
}

