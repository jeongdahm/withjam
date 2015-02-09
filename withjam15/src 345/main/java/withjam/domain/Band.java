package withjam.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Band implements Serializable{

	/**
	 * 
	 */
	
//	<result column="BAND_NO" property="bandNo" />
//	<result column="UID" property="uid" />
//	<result column="BLEVEL" property="bLevel" />
//	<result column="BJOINDATE" property="bJoinDate" />
//	<result column="BAND_NAME" property="bandName" />
//	<result column="BAND_COMMENT" property="bandComment" />
//	<result column="BANDDATE" property="bandDate" />
//	<result column="BPHOTO" property="bPhoto" />
	
//	<result column="UNAME" property="uname" />
//	<result column="UPHOTO" property="uphoto" />
//	<result column="COMMENT" property="comment" />
	
	private static final long serialVersionUID = 1L;
	
	protected int bandNo;
	protected int uid;
	protected int bLevel;
	protected Date bJoinDate;
	
	protected String bandName;
	protected String bandComment;
	protected Date bandDate;
	protected String bPhoto;
	
	protected String uname;
	protected String uphoto;
	protected String comment;
	
	protected int genreNo;
	protected int instNo;
	
	protected MultipartFile testFile;
	protected String fileTest;
	protected String testUrl;
	
	
	
	public String getTestUrl() {
		return testUrl;
	}
	public void setTestUrl(String testUrl) {
		this.testUrl = testUrl;
	}
	public String getFileTest() {
		return fileTest;
	}
	public void setFileTest(String fileTest) {
		this.fileTest = fileTest;
	}
	public MultipartFile getTestFile() {
		return testFile;
	}
	public void setTestFile(MultipartFile testFile) {
		this.testFile = testFile;
	}
	public int getGenreNo() {
		return genreNo;
	}
	public void setGenreNo(int genreNo) {
		this.genreNo = genreNo;
	}
	public int getInstNo() {
		return instNo;
	}
	public void setInstNo(int instNo) {
		this.instNo = instNo;
	}
	public int getBandNo() {
		return bandNo;
	}
	public void setBandNo(int bandNo) {
		this.bandNo = bandNo;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getbLevel() {
		return bLevel;
	}
	public void setbLevel(int bLevel) {
		this.bLevel = bLevel;
	}
	public Date getbJoinDate() {
		return bJoinDate;
	}
	public void setbJoinDate(Date bJoinDate) {
		this.bJoinDate = bJoinDate;
	}
	public String getBandName() {
		return bandName;
	}
	public void setBandName(String bandName) {
		this.bandName = bandName;
	}
	public String getBandComment() {
		return bandComment;
	}
	public void setBandComment(String bandComment) {
		this.bandComment = bandComment;
	}
	public Date getBandDate() {
		return bandDate;
	}
	public void setBandDate(Date bandDate) {
		this.bandDate = bandDate;
	}
	public String getbPhoto() {
		return bPhoto;
	}
	public void setbPhoto(String bPhoto) {
		this.bPhoto = bPhoto;
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
	
	
	
	
}
