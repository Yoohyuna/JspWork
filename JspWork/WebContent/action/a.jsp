<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a.jsp</title>
</head>
<body bgcolor="yellow">
 <h1>a.jsp로 오신것을 환영합니다.</h1>
 <%
     int su=200;//자기것
 %>
 자기 페이지에서 선언된 변수 su:<%=su %>
 <hr>
 move.jsp에서 공유한 su의 값은?<%=request.getAttribute("total") %>
</body>
</html>