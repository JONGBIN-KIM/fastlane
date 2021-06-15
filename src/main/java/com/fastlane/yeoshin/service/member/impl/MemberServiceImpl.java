package com.fastlane.yeoshin.service.member.impl;

import com.fastlane.yeoshin.common.enumtype.MemberError;
import com.fastlane.yeoshin.entity.MemberEntity;
import com.fastlane.yeoshin.common.exception.FastlaneException;
import com.fastlane.yeoshin.repository.MemberRepository;
import com.fastlane.yeoshin.service.MemberService;
import com.fastlane.yeoshin.vo.ChangeMemberInfoVo;
import com.fastlane.yeoshin.vo.MemberVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    MemberRepository memberRepository;

    public void signUp(MemberVo memberVo) throws FastlaneException{
        if(memberRepository.findById(memberVo.getId()).isPresent()){
            throw new FastlaneException(MemberError.EXIST_ID_ERROR.getErrorMessage());
        }

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberVo.getId());
        memberEntity.setPasswd(encryptPasswd(memberVo.getPasswd()));
        memberRepository.save(memberEntity);
    }

    public void changePasswd(ChangeMemberInfoVo chgMemInfoVo) throws FastlaneException{
        if(!memberRepository.findByIdAndPasswdEquals(chgMemInfoVo.getId(),chgMemInfoVo.getPasswd()).isPresent()){
            throw new FastlaneException(MemberError.PASSWD_NOT_MATCH_ERROR.getErrorMessage());
        }

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(chgMemInfoVo.getId());
        memberEntity.setPasswd(encryptPasswd(chgMemInfoVo.getNewpasswd()));
        memberRepository.save(memberEntity);
    }

    public void deleteMember(MemberVo memberVo) throws FastlaneException{
        if(!memberRepository.findByIdAndPasswdEquals(memberVo.getId(),memberVo.getPasswd()).isPresent()){
            throw new FastlaneException(MemberError.PASSWD_NOT_MATCH_ERROR.getErrorMessage());
        }

        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberVo.getId());
        memberEntity.setPasswd(encryptPasswd(memberVo.getPasswd()));
        memberRepository.delete(memberEntity);
    }

    private String encryptPasswd(String passWd) {
        return passWd; // Todo : Sha256
    }
}
