<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러발생</title>
</head><!--null (NullPointerException)  -->
<body>
<%=request.getParameter("name").toUpperCase() %>
</body>
</html>