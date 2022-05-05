<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="com.test.ex.StudentDTO" %>
<!DOCTYPE html>
<html>
<head><meta charset="UTF-8"><title>Insert title here</title></head>
<body>
<jsp:useBean id="stu" class="com.test.ex.StudentDAO"/>
<% 
    String name =request.getParameter("name");
    if(name ==null || name.trim().equals("")){
    	response.sendRedirect("student_2.jsp");
   	return;
  }//유효성
    StudentDTO[] arr =stu.findst(name.trim());	
    if(arr==null){
    	out.println(name+" 님은 존재하지않습니다.");
    }   
%>
 
 <%
      for(StudentDTO sdto:arr){
 %>
 <tr>
    <td><%=sdto.getNo() %></td>
     <td><%=sdto.getPw() %></td>
      <td><%=sdto.getName() %></td>
       <td><%=sdto.getHp() %></td>
 </tr>
 <%
 }
 %>
<a href="list.jsp">회원목록보기</a>/<a href="student_2.jsp">검색화면</a> 
<h3>검색 성공</h3>

</body>
</html>