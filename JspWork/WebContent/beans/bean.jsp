<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈즈가 나온 배경설정</title>
</head>
<body>
 <%!
   //입력->매개변수를 전달->저장(필드별로 입력)--->테이블에 저장(필드별로)
   String str="선언문";//웹상에서 입력받을 값->자바빈즈
   String addr="";
   
   public void setStr(String s){  //수정->저장
	   str=s;
       System.out.println("setStr()호출됨!");
   }
   
   public void setAddr(String addr){
	   this.addr=addr;
   }
   
   public String getStr() {return str;}
   public String getAddr() { return addr; }
 %>
 메서드 호출(Setter Method) : <% setStr("자바빈즈");  %>
 <p>
 저장된 값 출력(Getter Method) : <h1><%=getStr() %></h1>
</body>
</html>



