<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<jsp:useBean id="stuDTO" class="com.test.ex.StudentDTO"/>
<jsp:setProperty property="no" name="stuDTO"/>
<jsp:setProperty property="pw" name="stuDTO"/>
<jsp:setProperty property="name" name="stuDTO"/>
<jsp:setProperty property="hp" name="stuDTO"/>

<jsp:useBean id="stu" class="com.test.ex.StudentDAO"/>
<%
	int res = stu.insertStudent(stuDTO);
	if(res > 0) 
		out.println("등록 처리되었습니다!!!");
	else 
		out.println("등록 실패!!!!");
%>
