<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html><html><head><meta charset="UTF-8"><title>Insert title here</title>
 <style>
    *{
       text-align:center
    }
    span{
       width:500px;
       padding:14px;
       background-color:yellow;
    }
 </style>
</head>
<body>
 <hr width =500>
 <h3><span>학생등록하기 </span></h3>
  <hr width =500>
  <form action = "insert22.jsp">
    학번:<input type="text" name = "no"/><br>
    비밀번호:<input type="text" name = "pw"/><br>
    이름:<input type="text" name = "name"/><br>
    전화번호:<input type="text" name = "hp"/><br>
     <input type ="submit" value ="등록"/>
     <input type ="reset" value ="취소"/>
<a href="list.jsp">목록보기</a></form>
</body>
</html>