

--WITHJAM

--db생성

create schema WITHJAM default character set utf8;

--db 접속

use withjam;

--테이블 생성

-- 회원테이블
CREATE TABLE MEMBERS (
UID     INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
EMAIL   VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
PWD     VARCHAR(20)  NOT NULL COMMENT '비밀번호', -- 비밀번호
UNAME   VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
UPHOTO  VARCHAR(50)  NULL     COMMENT '회원사진', -- 회원사진
COMMENT VARCHAR(255) NULL     COMMENT '코멘트', -- 코멘트
USCORE  INTEGER      NOT NULL COMMENT '인기도', -- 인기도
MDATE   DATE         NOT NULL COMMENT '가입일' -- 가입일
)
COMMENT '회원테이블';

-- 회원테이블
ALTER TABLE MEMBERS
ADD CONSTRAINT PK_MEMBERS -- 회원테이블 기본키
PRIMARY KEY (
UID -- 회원번호
);
        

-- 회원테이블 유니크 인덱스
CREATE UNIQUE INDEX UIX_MEMBERS
ON MEMBERS ( -- 회원테이블
EMAIL ASC -- 이메일
);


ALTER TABLE MEMBERS
MODIFY COLUMN UID INTEGER NOT NULL AUTO_INCREMENT COMMENT '회원번호’;