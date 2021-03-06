package com.test.ex;
import java.sql.*;
import java.util.Vector;

public class StudentDAO {
//멤버변수
	Connection conn;
	PreparedStatement ps;
	ResultSet rs;
	String url ="jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "system";
	String upw ="manager";
	
	public StudentDAO() {
		super();
		try {
			//1.드라이버 찾아오고 연결하고 
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn =DriverManager.getConnection(url, uid,upw);
			System.out.println("데이터연결 성공....<br>");
		}catch(Exception e) {}
	}//생성자 
	public int insertStudent(StudentDTO sdto) throws SQLException{
		String no = sdto.getNo();
		String pw =sdto.getPw();
		String name = sdto.getName();
		String hp = sdto.getHp();
		int n =insertStudent(no, pw, name, hp);
		
		return n;
	}//insertStudent() 
	public int insertStudent(String no,String pw,String name,String hp) throws SQLException{
	    String sql ="insert into student values(?,?,?,?)";
	    ps =conn.prepareStatement(sql);
	    ps.setString(1,no);
	    ps.setString(2,pw);
	    ps.setString(3,name);
	    ps.setString(4,hp);
	    int n =ps.executeUpdate();
	    ps.close();
	    conn.close();
	 return n;
	}//insertStudent(,,,)
	public int insert(StudentDTO sdto) throws SQLException{
		String sql ="insert into student values(?,?,?,?)";
		    ps =conn.prepareStatement(sql);
		    ps.setString(1,sdto.getNo());
		    ps.setString(2,sdto.getPw());
		    ps.setString(3,sdto.getName());
		    ps.setString(4,sdto.getHp());
		    int n =ps.executeUpdate();
		    ps.close();
		    conn.close();	
		return n;
	}//합한 insert
	public StudentDTO[] find(String name) throws SQLException{
		StudentDTO[]  dtos =null;
	    String sql ="select * from student where name = ?";
	    ps =conn.prepareStatement(sql);
	    ps.setString(1, name);
	    rs =ps.executeQuery();
	    
	    Vector<StudentDTO> v= new Vector<StudentDTO>();
	    while(rs.next()) {
	    	String no =rs.getString(1);
	    	String pw =rs.getString(2);
	    	String name1 =rs.getString(3);
	    	String hp =rs.getString(4);
	    	StudentDTO dto=new StudentDTO(no,pw,name1,hp);
	    	v.add(dto);
	    }//while
	    //출력하기 
	    int vsize = v.size();//찾은 레코드수많큼 vsize가 정해진다.
	    dtos=new StudentDTO[vsize]; 
	    v.copyInto(dtos);
	    
		return dtos;
	}//find 
	public int deleteStudent(String name) throws SQLException{		
		String sql ="delete from student where name = ?";	
		ps=conn.prepareStatement(sql);
		ps.setString(1, name);
		int n=ps.executeUpdate();	
		if(n>0)
			System.out.println("삭제성공");
		else
			System.out.println("삭제실패");
		return n;
	}
	
}
















