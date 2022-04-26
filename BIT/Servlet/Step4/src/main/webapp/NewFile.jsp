<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function check() {
	if (document.frm.id.value == "") {
		alert("아이디를 입력해주세요.");
		document.frm.id.focus();
		return false;
	} else if (document.frm.age.value == "") {
		alert("나이를 입력해주세요.");
		document.frm.age.focus();
		return false;
	} else if (isNaN(document.frm.age.value)) {
		alert("숫자로 입력해주세요.");
		document.frm.age.focus();
		return false;
	} else {
		return true;
	}
}
</script>
</head>
<body>
<body>
	<form name  ="frm" method="get" action="loginres.jsp">
		 아이디 : <input type="text" name="id"><br>
		 암 &nbsp;호 : <input type="password" name="pwd" ><br>
		<input type="submit" value="로그인" onclick="check">
	</form>
</body>
</html>