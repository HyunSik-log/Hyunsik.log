<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.DriverManager" %>

<!DOCTYPE html><html><head><meta charset="UTF-8"><title>Insert2 </title></head>
<body>

<jsp:useBean id ="stu" class ="com.test.ex.StudentDAO"/>

<%
try{	
	String no =request.getParameter("no");
	String pw =request.getParameter("pw");
	String name =request.getParameter("name");
	String hp =request.getParameter("hp");
	out.println(no+","+pw+","+name+","+hp+"<br>");
	
	int result =stu.insertStudent(no,pw,name,hp);
	    
   if(result > 0)
	   out.println("입력성공<br>");
   else
	   out.println("입력실패<br>");
   
}catch(Exception e){}
finally{	
		
}
%>
<h3>회원 가입 성공</h3>
	<a href="list.jsp"> 회원 전체 목록 보기 </a> }
</body>
</html>