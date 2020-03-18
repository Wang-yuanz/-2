package com.nwnu.user;

public class Stu {
	private Integer id;
	private String sno;      //学生学号
	private String stuname;  //学生姓名
	private String college;  //学生所在学院
	private String stuclass; //学生班级
	private String time;        //提交时间
	private String isinwh;     //是否在武汉
	private String isinhb;     //是否在湖北
	private String islike;     //是否疑似
	private String isconfirm;   //是否确诊
	
	
	public Stu() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Stu(String sno, String stuname, String college, String stuclass, String time, String isInWh, String isInHb,
			String isLike, String isConfirm) {
		super();
		this.sno = sno;
		this.stuname = stuname;
		this.college = college;
		this.stuclass = stuclass;
		this.time = time;
		this.isinwh = isInWh;
		this.isinhb = isInHb;
		this.islike = isLike;
		this.isconfirm = isConfirm;
	}



	public Stu(Integer id, String sno, String stuname, String college, String stuclass, String time, String isInWh,
			String isInHb, String isLike, String isConfirm) {
		super();
		this.id = id;
		this.sno = sno;
		this.stuname = stuname;
		this.college = college;
		this.stuclass = stuclass;
		this.time = time;
		this.isinwh = isInWh;
		this.isinhb = isInHb;
		this.islike = isLike;
		this.isconfirm = isConfirm;
	}



	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getStuclass() {
		return stuclass;
	}
	public void setStuclass(String stuclass) {
		this.stuclass = stuclass;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getIsInWh() {
		return isinwh;
	}
	public void setIsInWh(String isInWh) {
		this.isinwh = isInWh;
	}
	public String getIsInHb() {
		return isinhb;
	}
	public void setIsInHb(String isInHb) {
		this.isinhb = isInHb;
	}
	public String getIsLike() {
		return islike;
	}
	public void setIsLike(String isLike) {
		this.islike = isLike;
	}
	public String getIsConfirm() {
		return isconfirm;
	}
	public void setIsConfirm(String isConfirm) {
		this.isconfirm = isConfirm;
	}
	
	@Override
	public String toString() {
		return "Stu [id=" + id + ", sno=" + sno + ", stuname=" + stuname + ", college=" + college + ", stuclass="
				+ stuclass + ", time=" + time + ", isInWh=" + isinwh + ", isInHb=" + isinhb + ", isLike=" + islike
				+ ", isConfirm=" + isconfirm + "]";
	}
	
}
