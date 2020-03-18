package com.nwnu.user;

public class Teacher {
	private Integer id;
	private String teno;      //老师教职工号
	private String teaname;  //老师姓名
	private String college;  //老师所在学院
	
	private String time;        //提交时间
	private String isinwh;     //是否在武汉
	private String isinhb;     //是否在湖北
	private String islike;     //是否疑似
	private String isconfirm;   //是否确诊
	
	
	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Teacher(String teno, String teaname, String college, String time, String isinwh,
			String isinhb, String islike, String isconfirm) {
		super();
		this.teno = teno;
		this.teaname = teaname;
		this.college = college;
		
		this.time = time;
		this.isinwh = isinwh;
		this.isinhb = isinhb;
		this.islike = islike;
		this.isconfirm = isconfirm;
	}



	public Teacher(Integer id, String teno, String teaname, String college, String time, String isinwh,
			String isinhb, String islike, String isconfirm) {
		super();
		this.id = id;
		this.teno = teno;
		this.teaname = teaname;
		this.college = college;
		
		this.time = time;
		this.isinwh = isinwh;
		this.isinhb = isinhb;
		this.islike = islike;
		this.isconfirm = isconfirm;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTeno() {
		return teno;
	}
	public void setTeno(String teno) {
		this.teno = teno;
	}
	public String getTeaname() {
		return teaname;
	}
	public void setTeaname(String teaname) {
		this.teaname = teaname;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIsinwh() {
		return isinwh;
	}
	public void setIsinwh(String isinwh) {
		this.isinwh = isinwh;
	}
	public String getIsinhb() {
		return isinhb;
	}
	public void setIsinhb(String isinhb) {
		this.isinhb = isinhb;
	}
	public String getIslike() {
		return islike;
	}
	public void setIslike(String islike) {
		this.islike = islike;
	}
	public String getIsconfirm() {
		return isconfirm;
	}
	public void setIsconfirm(String isconfirm) {
		this.isconfirm = isconfirm;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", teno=" + teno + ", teaname=" + teaname + ", college=" + college + ", time=" + time + ", isinwh=" + isinwh + ", isinhb=" + isinhb + ", islike=" + islike
				+ ", isconfirm=" + isconfirm + "]";
	}
	
	
	
}
