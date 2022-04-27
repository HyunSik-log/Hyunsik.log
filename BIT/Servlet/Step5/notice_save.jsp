<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- save 처리과정 -->
<%
/*
1. 사용자가 입력한 글제목, 내용, 파일명을 얻어오는 과정
2. 파일명과 FileWriter와 스트림 연결
3. 스트림을 통해서 글제목과 내용을 파일에 쓴다.
4. 스트림 닫기
5. 파일에 쓰기가 완료 되었으면 메시지 띄우기
*/
request.setCharacterEncoding("utf-8");
String title = request.getParameter("title");
String content = request.getParameter("info");
String filename = request.getParameter("filename");

if(filename == null ||filename.trim().equals("")){
	response.sendRedirect("notice_write.jsp");
	return;
}
if(title==null || content==null || title.trim().equals("")||content.trim().equals("")){
	out.println("공지 내용과 제목을 입력>>!!!");
	out.println("<a href=notice_write.jsp>돌아가기</a>");
	return;
}

// 파일 절대 경로 구하기
//request 객체에 getRealPath("/notice");
// config 내장 객체에 getServletContext() 메소드 
// ServletContext ctx = config.getServletContext();

ServletContext ctx = config.getServletContext();
String path = ctx.getRealPath("/notice");

//String allPath = request.getRealPath("/notice");

out.println("공지사항 저장될 경로 :"+path);

String filefullname = path+"/"+filename;

FileWriter fw = null;
PrintWriter pw = null;

try{
	fw = new FileWriter(filefullname);
	pw = new PrintWriter(fw, true);
	pw.println("<body>");
	pw.println("<b>"+title+"</b><br/>");
	pw.println(content);
	pw.println("</body>");
	
	pw.close();
	fw.close();	
	
}catch(IOException e){
	out.println("입출력 오류: "+e.getMessage());
	return;
}
%>
<script type="text/javascript">
	alert("<%=filefullname%> 파일쓰기작업 완료!!!");
	location.href="<%=request.getContextPath()%>/notice_main.jsp";
</script>
</head>
<body>

</body>
</html>