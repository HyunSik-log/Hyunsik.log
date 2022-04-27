<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html><html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function readNotice(){
		window.open("notice_read.jsp", "notice","width=250,height=300");
	}
</script>
</head>
<body>
<a href="javascript:readNotice()">공지 읽기1</a>
<a href="notice_read.jsp">공지 읽기2</a>
<a href="notice_write.jsp">공지 쓰기</a>

</body>
</html>