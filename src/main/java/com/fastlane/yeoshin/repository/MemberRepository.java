package com.fastlane.yeoshin.repository;

import com.fastlane.yeoshin.entity.MemberEntity;
import com.fastlane.yeoshin.vo.MemberVo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<MemberEntity, String> {

    Optional<MemberEntity> findByIdAndPasswdEquals(String id, String passwd);
}
