<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    buffer="16kb"
    import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>move.jsp</title>
</head>
<body>
 <h1>페이지를 이동시키는 역할</h1>
 <%
   int su=100;//->a.jsp->데이터 공유
   System.out.println("su=>"+su);
   Date d=new Date();//->b.jsp에 데이터를 공유->전달
   //자바의 자료구조->HashMap->키,값저장
   //형식)request.setAttribute(키명,저장할값) ->한 페이지 공유할때 사용
   request.setAttribute("total",su);//int->Integer
   request.setAttribute("cal",d); //<->request.getAttribute("꺼내올 키명")
   //----------------------------------------------------------------------------
   String move=request.getParameter("move");//a.jsp or b.jsp
   System.out.println("move=>"+move);
   //존재->이동 or 존재X ->경고->다시 입력을 받을 수 있도록 설계
   if(move.equals("a.jsp")){
	   //response.sendRedirect("a.jsp");
 %>
 <jsp:forward page='a.jsp' /><br>
 <%}else if(move.equals("b.jsp")) { %>
 <jsp:forward page='b.jsp' /><br>
 <%}else {  %>
 <script>
       alert("당신이 요청하신 페이지는 없습니다\n확인 다시해보세요!")
       location.href="forward.jsp"
 </script>
<% } %>
</body>
</html>







