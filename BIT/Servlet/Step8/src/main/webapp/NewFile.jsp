<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.sql.DriverManager" %>
<%@ page import ="java.sql.Connection" %>
<%@ page import ="java.sql.ResultSet" %>
<%@ page import ="java.sql.Statement" %>
<%@ page import ="java.sql.PreparedStatement" %>
<!DOCTYPE html><html><head><meta charset="UTF-8"><title>Insert title here</title>
</head>
<body><b>
<ol>데이터베이스 연동순서
<li>JDBC드라이버 로딩 :<br>
Class.forName("orcle.jdbc.driver.OracleDriver");</li>
<li>데이터베이스 연결Connection 객체생성:<br>
DriverManager.getConnction() </ll>
<li>SQL문 실행<br>
(Statement객체 생성):connection.createStatement();<br>
excuteQuery():select문 <br>
-----ResultSet객체로 부터 데이터 추출<br>
-------next(),previous(),first(),last(),getString(),getInt()
excuteUpdate():insert, update, delete문
</li>
<li>데이터베이스 연결해제<br>ResultSet Close</li>
</ol>
<hr>
<%!
   Connection conn;
   Statement statement;
   ResultSet rs;
   String driver ="orcle.jdbc.driver.OracleDriver";
  
   String url ="jdbc:oracle:thin:@localhost:1521:xe";
   String uid="system";
   String upw ="1234";
   String sql ="select * from student";
   %>
   <%
   try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
    conn  =DriverManager.getConnection(url,uid,upw);
    statement =conn.createStatement();
    rs=statement.executeQuery(sql);  
    while(rs.next()){
    	String no=rs.getString("no");
    	String pw=rs.getString("pw");
    	String name =rs.getString("name");
    	String hp =rs.getString("hp");
    	out.println("학번:"+no+", pw:"+pw+", name:"+name+",hp:"+hp+"<br>" );
    }
   }catch(Exception e){}
   finally{
	   rs.close();
	   conn.close();
	   statement.close();
   }
%>
</b>
</body>
</html>