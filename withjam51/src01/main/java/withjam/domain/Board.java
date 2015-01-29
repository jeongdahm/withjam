package withjam.domain;

import java.io.Serializable;
import java.util.Date;

//BNO     INTEGER      NOT NULL COMMENT '음원번호', -- 음원번호
//UID     INTEGER      NOT NULL COMMENT '회원번호', -- 회원번호
//TITLE   VARCHAR(50)  NOT NULL COMMENT '제목', -- 제목
//CONTENT VARCHAR(255) NOT NULL COMMENT '내용', -- 내용
//BDATE   DATE         NOT NULL COMMENT '작성일', -- 작성일
//BF_NAME VARCHAR(50)  NULL     COMMENT '파일이름' -- 파일이름

public class Board implements Serializable{

	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	
	protected int bno;
	protected int uid;
	protected String title;
	protected String content;
	protected Date bdate;
	protected String bfName;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	public String getBfName() {
		return bfName;
	}
	public void setBfName(String bfName) {
		this.bfName = bfName;
	}
	
	

}
