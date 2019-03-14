<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>응답객체(=response)</title>
</head>
<body>
<%
   //response.setContentType("text/html; charset=UTF-8");
   //response.sendRedirect("http://www.daum.net");//외부의 사이트로 이동
  // response.sendRedirect("../bottom/bottom.html");//내부의 특정위치로 이동
%>
<script>
    //location.href="http://www.naver.com";
    location.replace("http://www.empas.com");
</script>
</body>
</html>