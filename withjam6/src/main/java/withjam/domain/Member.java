/* Value Object
 * => Class 문법을 사용하여 사용자 정의 데이터 타입 만들기
 * 
 * 1) Serializable 인터페이스 구현
 *    => SerialVersionUID 스태틱 변수 선언
 * 
 * 2) 인스턴스 변수 선언
 * 
 * 3) setter/getter 생성
 * 
 * 4) 기본 생성자와 파라미터 값을 받는 생성자 선언
 * 
 * 5) equals()/hashCode() 메서드 오버라이딩
 * 
 * 6) toString() 오버라이딩
 */
package withjam.domain;

import java.io.Serializable;
import java.util.Date;

//UID     INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
//EMAIL   VARCHAR(40)  NOT NULL COMMENT '이메일', -- 이메일
//PWD     VARCHAR(20)  NOT NULL COMMENT '비밀번호', -- 비밀번호
//UNAME   VARCHAR(50)  NOT NULL COMMENT '이름', -- 이름
//UPHOTO  VARCHAR(50)  NULL     COMMENT '회원사진', -- 회원사진
//COMMENT VARCHAR(255) NULL     COMMENT '코멘트', -- 코멘트
//USCORE  INTEGER      NOT NULL COMMENT '인기도', -- 인기도
//MDATE   DATE         NOT NULL COMMENT '가입일' -- 가입일

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	protected int uid;
	protected String email;
	protected String pwd;
	protected String uname;
	protected String uphoto;
	protected String comment;
	protected int uscore;
	protected Date mdate;
	protected String test01;
	
	@Override
	public String toString() {
		return "Member [uid=" + uid + ", email=" + email + ", pwd=" + pwd
				+ ", uname=" + uname + ", uphoto=" + uphoto + ", comment="
				+ comment + ", uscore=" + uscore + ", mdate=" + mdate + "]";
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUphoto() {
		return uphoto;
	}
	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getUscore() {
		return uscore;
	}
	public void setUscore(int uscore) {
		this.uscore = uscore;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	
	
	

}
