<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String job = request.getParameter("job");
String interests[] = request.getParameterValues("interest");
out.println("당신이 선택한 직업:"+job);
for(String s: interests)
	out.println("<br>관심분야는 :"+s);
for (int i = 0;i<interests.length; i++)
	out.println(interests[i]+" ");
%>
</body>
</html>