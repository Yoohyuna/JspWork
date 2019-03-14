<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장객체의 개요및 사용법</title>
</head>
<%!
     String name="홍길동";
%>
<body>
<h2>
    <!-- //request->사용자로부터 요청을 받을때 사용되는 내장객체 -->
     1.서버의 도메인이름:<%=request.getServerName() %><br>
     2.서버의 포트번호:<%=request.getServerPort() %><br>
     **3.요청된 URL에서의 경로:<%=request.getRequestURL() %><br>
     **4.요청된 URI에서의 경로:<%=request.getRequestURI() %><br>
     **5.원격 주소ip주소:<%=request.getRemoteAddr() %><br>
     6.클라이언트가 요청한 프로토콜:<%=request.getProtocol() %><br>
     **7.요청방식(Get,Post):<%=request.getMethod() %><br>
    
</h2>
</body>
</html>











