# fastlane
패스트레인 여신티켓 사전과제 입니다.

지원자 명 : 김종빈 // 
지원자 이메일 : kjb7752@gmail.com // 
지원자 연락처 : 010-4102-7471



1.테이블 생성 쿼리
CREATE TABLE YS_MEMBER
(ID VARCHAR(30) PRIMARY KEY, PASSWD VARCHAR(64) NOT NULL)


간단한 호출 명세는 다음과 같습니다.

2-1. 회원가입       
메소드 : POST
호출 URL : localhost:8081/member/signUp
필요 파라미터 : id, passwd

2-1. 비밀번호 변경       
메소드 : PUT
호출 URL : localhost:8081/member/changePasswd
필요 파라미터 : id, passwd, newpasswd

2-1. 회원삭제        
메소드 : DELETE
호출 URL : localhost:8081/member/deleteMember
필요 파라미터 : id, passwd


