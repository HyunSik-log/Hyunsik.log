<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.net.URLEncoder"%>
 <%
    request.setCharacterEncoding("UTF-8");
String userID=request.getParameter("userID");
String userPwd=request.getParameter("userPwd");
String loginCheck=request.getParameter("loginCheck");
if(loginCheck.equals("user")){
%>
<jsp:forward page="49_userMain.jsp">
	<jsp:param value='<%=URLEncoder.encode("사랑하는 고객 ","UTF-8")%>' name="userName"/>
</jsp:forward>
<%}else{ %>
<jsp:forward page="49_managerMain.jsp">
<jsp:param value='<%=URLEncoder.encode(" 님 로그인 성공 ", "UTF-8")%>'
name="userName"/>
</jsp:forward>
<%} %>