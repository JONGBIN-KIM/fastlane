package com.fastlane.yeoshin.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="YS_MEMBER")
public class MemberEntity {

    @Id
    private String id;

    private String passwd;
}
//CREATE TABLE YS_MEMBER(ID VARCHAR(30) PRIMARY KEY, PASSWD VARCHAR(64) NOT NULL);