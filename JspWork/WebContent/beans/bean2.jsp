<%@ page  contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="test.BeanDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력받은 값을 저장,출력</title>
</head>
<body>
<%
          //한글처리
          request.setCharacterEncoding("utf-8");
          String str=request.getParameter("str");
          String addr=request.getParameter("addr");
          System.out.println("str=>"+str+",addr=>"+addr);
          //1.객체생성->데이터 저장하기위해서
          BeanDTO bd=new BeanDTO();
          //2.입력받은 갯수만큼 Setter Method 호출
          bd.setStr(str);//bd.setStr(request.getParameter("str"));
          bd.setAddr(addr);
          //3.Getter Method을 호출해서 ->테이블의 각 필드에 저장
          out.println("입력받은 이름은?"+bd.getStr()+"<br>");
          out.println("입력받은 주소은?"+bd.getAddr()+"<br>");
%>
<hr>
<b><%=bd.getStr() %></b>님! 잘 오셨습니다.<br>
<b>주소는 <%=bd.getAddr() %></b>입니다.
</body>
</html>





