/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.37
 * Generated at: 2019-02-15 03:47:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.inobject;

//기본 서블릿,응용 서블릿(기본 서블릿에서 내용이 추가(jsp)된 경우)

import javax.servlet.*;
import javax.servlet.http.*;
//추가1(jsp내용)
import javax.servlet.jsp.*;

//추가2 HttpServlet 상속->HttpJspBase

public final class req_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


     String name="홍길동"; //<%! ~%> 멤버변수로 선언

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {  //추가 3  init()->_jspInit()로 변경
  }

  public void _jspDestroy() {//추가 4 destory()->_jspDestory()로 변경
  }
  //추가 5 ->웹상에서 요청할때 처리해주는 메서드  service()->_jspService()
  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

     //내장객체 선언문(8개)+매개변수 형태로 2개 받아옴(request,response)
    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      //내장객체 생성하는 구문
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>�궡�옣媛앹껜�쓽 媛쒖슂諛� �궗�슜踰�</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<h2>\r\n");
      out.write("    <!-- //request->�궗�슜�옄濡쒕��꽣 �슂泥��쓣 諛쏆쓣�븣 �궗�슜�릺�뒗 �궡�옣媛앹껜 -->\r\n");
      out.write("     1.�꽌踰꾩쓽 �룄硫붿씤�씠由�:");
      out.print(request.getServerName() );
      out.write("<br>\r\n");
      out.write("     2.�꽌踰꾩쓽 �룷�듃踰덊샇:");
      out.print(request.getServerPort() );
      out.write("<br>\r\n");
      out.write("     **3.�슂泥��맂 URL�뿉�꽌�쓽 寃쎈줈:");
      out.print(request.getRequestURL() );
      out.write("<br>\r\n");
      out.write("     **4.�슂泥��맂 URI�뿉�꽌�쓽 寃쎈줈:");
      out.print(request.getRequestURI() );
      out.write("<br>\r\n");
      out.write("     **5.�썝寃� 二쇱냼ip二쇱냼:");
      out.print(request.getRemoteAddr() );
      out.write("<br>\r\n");
      out.write("     6.�겢�씪�씠�뼵�듃媛� �슂泥��븳 �봽濡쒗넗肄�:");
      out.print(request.getProtocol() );
      out.write("<br>\r\n");
      out.write("     **7.�슂泥�諛⑹떇(Get,Post):");
      out.print(request.getMethod() );
      out.write("<br>\r\n");
      out.write("    \r\n");
      out.write("</h2>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
