<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html><html><head>
<meta charset="UTF-8"><title>Insert title here</title></head><body>
<%
  String driver="oracle.jdbc.driver.OracleDriver";
  Class.forName(driver);
  Connection dbconn;
  Statement statement;
  ResultSet rs;
  String url="jdbc:oracle:thin:@localhost:1521:xe";
  String uid ="system";
  String upw ="1234";
  String sql="select * from student";
  
  dbconn=DriverManager.getConnection(url,uid,upw);
  out.println("DB연동성공<br>");
  statement =dbconn.createStatement();
  rs =statement.executeQuery(sql);
  while(rs.next()){
	 String no =request.getParameter("no");
	 String pw =rs.getString("pw");
	 String name =rs.getString("name");
	 String hp =rs.getString("pw");
	 out.println("학번:"+no+" pw:"+pw+" name:"+name+" hp:"+hp+"<br>");
 }
  rs.close();
  statement.close();
  dbconn.close();
%>

</body>
</html>