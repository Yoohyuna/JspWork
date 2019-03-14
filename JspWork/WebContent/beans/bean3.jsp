<%@ page  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.BeanDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bean3.jsp</title>
</head>
<body>

<%--   액션태그의 주석은 안보이는 주석으로 해야 된다.
<jsp:useBean id="bd" class="test.BeanDTO" scope="page" />
<jsp:setProperty name="bd" property="str" value="<%=str%>" /> 
--%>
<%
          //한글처리
          request.setCharacterEncoding("utf-8");
          String str=request.getParameter("str");
          String addr=request.getParameter("addr");
          System.out.println("str=>"+str+",addr=>"+addr);
          //1.객체생성->데이터 저장하기위해서
          //BeanDTO bd=new BeanDTO();
          
          //2.입력받은 갯수만큼 Setter Method 호출
          //bd.setStr(str);//bd.setStr(request.getParameter("str"));
          //bd.setAddr(addr);
          //3.Getter Method을 호출해서 ->테이블의 각 필드에 저장
          //out.println("입력받은 이름은?"+bd.getStr()+"<br>");
          //out.println("입력받은 주소은?"+bd.getAddr()+"<br>");
%>
<jsp:useBean id="bd" class="test.BeanDTO" scope="page" />
<%-- 
<jsp:setProperty name="bd"  property="str" value="<%=str%>" />
<jsp:setProperty name="bd"  property="addr" value="<%=addr%>" />
,,,,
 --%>
<jsp:setProperty name="bd"  property="*" />

<hr>
액션태그를 통한 Getter Method를 호출하는 경우
<jsp:getProperty name="bd"  property="str" />
<jsp:getProperty name="bd"  property="addr" />
 <hr>
<b><%=bd.getStr() %></b>님! 잘 오셨습니다.<br>
<b>주소는 <%=bd.getAddr() %></b>입니다.
</body>
</html>




