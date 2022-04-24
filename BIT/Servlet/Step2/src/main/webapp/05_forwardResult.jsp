<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String age=request.getParameter("age");
String name=(String)request.getAttribute("name");
String addr =(String)request.getAttribute("addr");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor=pink>
forward 방식으로 이동된 페이지 <br><br>
나이 : <%=age %><br>
이름 : <%=name %><br>
주소: <%=addr %><br>
</body>
</html>