package com.test.ex;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class StudentDAO {
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	String url ="jdbc:oracle:thin:@localhost:1521:XE";
	String uid ="system";
	String pwd = "1234";	
	
	public StudentDAO(){//생성자
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,uid,pwd);
			System.out.println("데이터베이스 연결!!");
		} catch (Exception e) {			
			e.printStackTrace();
		}		
	}// 생성자
	public int insertStudent(StudentDTO sdto) throws SQLException{
		String no = sdto.getNo();
		String pw = sdto.getPw();
		String name = sdto.getName();
		String hp = sdto.getHp();
		int n = insertStudent(no, pw, name, hp);
		return n;
	}	
	public int insertStudent(String no,String pw,String name,String hp) throws SQLException{
		try{
			String sql="insert into student values(?,?,?,?)";			
			ps=conn.prepareStatement(sql);
			ps.setString(1, no);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, hp);			
			int n = ps.executeUpdate();
			return n;
		}finally{
			if(ps !=null) ps.close();
			if(conn !=null) conn.close();
		}		
	}//insert
	public StudentDTO[] findst(String name) throws SQLException{
		StudentDTO[] dtos=null;
		try {
			String sql ="select * from student where name =?";
			ps=conn.prepareStatement(sql);
			ps.setString(1,name);
			rs =ps.executeQuery();
		    dtos =createVector(rs);
			
		}catch(Exception e) {}
		finally {
			rs.close();
			ps.close();
			conn.close();
		}
		return dtos;		
		
	}//findst
	public StudentDTO[] createVector(ResultSet rs) throws SQLException{
		Vector<StudentDTO> v =new Vector<StudentDTO>();
		while(rs.next()){
			String no =rs.getString(1);
			String pw =rs.getString(2);
			String name = rs.getString(3);
			String hp = rs.getString(4);
			
			StudentDTO sdto =new StudentDTO(no, pw, name,hp);
			v.add(sdto);
		}//while
		int vsize =v.size();
		StudentDTO[]  dtos=new StudentDTO[vsize];
		v.copyInto(dtos);//배엵객체에 저장복사
		return dtos;
	   }	
}//class
