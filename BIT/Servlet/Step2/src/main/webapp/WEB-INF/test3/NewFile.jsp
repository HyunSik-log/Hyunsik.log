<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
background:skyblue;
font-family:굴림
}</style>
</head>
<body>

</head>
<body>
<%! 
public int abs(int n){
   if(n < 0){
     n=-n;
   }
   return n;
}
int countg = 1;
%> 
<%
int countl =1;
out.println("<br>전역countg:"+ ++countg);
out.println("<br>지역countl:"+ ++countl);
out.println("<br>abs(-5):"+abs(-5));
%>
<%@include file="footer.jsp" %>	
</body>
</html>