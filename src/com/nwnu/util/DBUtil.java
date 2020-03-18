package com.nwnu.util;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JFrame;

import com.nwnu.user.Stu;
import com.nwnu.user.Teacher;

public class DBUtil {
	private static String url="jdbc:mysql://localhost:3306/db_num.sql";
	private static String user="root";
	private static String password = "root";
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
    
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
		
	}
	
	public static void free(ResultSet rs, Statement stmt, Connection conn) {
		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception e2) {
			} finally {
				try {
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	public static void selectStuByIdAndTime() throws SQLException {
		String sql = "select * from tb_stu where sno=?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生学号和学生的报告提交时间：");
		String sno1 = scanner.next();
		String time1 = scanner.next();
		ps.setString(1, sno1);
		ps.setString(2, time1);;
		List<Stu> res = new ArrayList<Stu>();

		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String sno = rs.getString("sno");
			String stuname = rs.getString("stuname");			
			String college = rs.getString("college");
			String stuclass = rs.getString("stuclass");
			String time = rs.getString("time");
			String isinwh = rs.getString("isinwh");
			String isinhb = rs.getString("isinhb");
			String islike = rs.getString("islike");
			String isconfirm = rs.getString("isconfirm");
			
			Stu stu = new Stu(id, sno, stuname, college, stuclass, time, isinwh, isinhb, islike, isconfirm);
			res.add(stu);
			System.out.println(stu);
			
		}
		System.out.println(res.size());		
		DBUtil.free(null, ps, conn);
	}
	
	public static void picture() throws SQLException {
		JFrame frame = new JFrame("疫情情况统计表");
		frame.setLayout(new GridLayout(2, 2, 10, 10));
		frame.add(new picture().getChartPanel()); // 添加柱形图
		frame.setBounds(0, 0, 900, 800);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println("欢迎来到学生疫情管理系统");
		String chose = null;
		while(chose != "3") {
			System.out.println("1、根据学号和日期查询学生的健康信息");
			System.out.println("2、根据学号和日期查询老师的健康信息");
			System.out.println("3、生成感染情况柱状图");	
			System.out.println("4、退出系统");
			System.out.println("请输入您想要的服务编号：");
			Scanner scanner = new Scanner(System.in);
			chose = scanner.next();
			switch(chose) {
			case "1":
				selectStuByIdAndTime();
				break;
			case "2":
				selectTeaByIdAndTime();
				break;
			case "3":
				picture();
				break;
			case "5":
				insertStu();
			case "4":
				System.out.println("谢谢您的使用");
				System.exit(0);
				break;
			}
		}
	}

	private static void insertStu() {
		// TODO Auto-generated method stub
		
	}

	private static void selectTeaByIdAndTime() throws SQLException {
		String sql = "select * from tb_teacher where teno=? and time=?";
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入老师的教工号和老师的报告提交时间：");
		String teno1 = scanner.next();
		String time1 = scanner.next();
		ps.setString(1, teno1);
		ps.setString(2, time1);;
		List<Teacher> res = new ArrayList<Teacher>();

		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			int id = rs.getInt("id");
			String teno = rs.getString("teno");
			String teaname = rs.getString("teaname");			
			String college = rs.getString("college");
			
			String time = rs.getString("time");
			String isinwh = rs.getString("isinwh");
			String isinhb = rs.getString("isinhb");
			String islike = rs.getString("islike");
			String isconfirm = rs.getString("isconfirm");
			
			Teacher teacher = new Teacher(id, teno, teaname, college, time, isinwh, isinhb, islike, isconfirm);
			res.add(teacher);
			System.out.println(teacher);
			
		}
			
		DBUtil.free(null, ps, conn);
		
	}
}
