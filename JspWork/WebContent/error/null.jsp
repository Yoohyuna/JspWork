<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러를 처리해주는 페이지</title>
</head>
<body>
<%
    //에러메세지를 처리해주겠다는 옵션->옵션X 브라우저 자체에서 에러
    //                                                            메세지를 출력시켜준다.
   response.setStatus(HttpServletResponse.SC_OK);
%>
<h1><font color="red">
  사용하시는데 불편을 드려서 죄송합니다. 빠른시간내에
  복구하겠습니다.
</font></h1>
</body>
</html>