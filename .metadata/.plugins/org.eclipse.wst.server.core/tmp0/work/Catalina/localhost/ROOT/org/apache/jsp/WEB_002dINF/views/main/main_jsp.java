/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
<<<<<<< HEAD
 * Generated at: 2023-07-18 01:13:11 UTC
=======
 * Generated at: 2023-07-11 02:10:36 UTC
>>>>>>> 2584c0c985f792a78db57c7e936ac034698a1193
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1688689545599L));
    _jspx_dependants.put("jar:file:/D:/_spring_workspace/bewithme_team/bewithme/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/bewithme/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;

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

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
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
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/css/main.css\">\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("        href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"left\">\r\n");
      out.write("            <img src=\"/resources/img/logo.png\" class=\"logo\" alt=\"\">\r\n");
      out.write("            <div class=\"menu_bar\">\r\n");
<<<<<<< HEAD
      out.write("                <button><a href=\"/menu/home\"> 🏠<span class=\"not\"> Home</span></a></button><br>\r\n");
      out.write("                <button><a href=\"/menu/subject\">📝<span> Subject</span></a></button><br>\r\n");
      out.write("                <button><a href=\"/menu/community\">📖<span> Community</span></a></button><br>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
=======
      out.write("                <button><a href=\"\"> 🏠<span class=\"not\"> Home</span></a></button><br>\r\n");
      out.write("                <button><a href=\"\">📝<span> Subject</span></a></button><br>\r\n");
      out.write("                <button><a href=\"/community/communitypage\">📖<span> Community</span></a></button><br>\r\n");
      out.write("                <button><a href=\"\">📁<span> Q&A</span></a></button><br>\r\n");
>>>>>>> 2584c0c985f792a78db57c7e936ac034698a1193
      out.write("            </div>\r\n");
      out.write("            <div class=\"sebu\">\r\n");
      out.write("                <button><a href=\"\">⚙ Setting</a></button><br>\r\n");
      out.write("                <button><a href=\"/member/logout\">🗑 Log out</a></button><br>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"center\">\r\n");
      out.write("            <h2>Hello, User1</h2>\r\n");
      out.write("            <p>Let's study with 'Be with Me'!</p>\r\n");
      out.write("            <div class=\"center-body\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"subject\">\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <span class=\"material-symbols-outlined\">\r\n");
      out.write("                            arrow_back_ios\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <div class=\"subject-content\">\r\n");
      out.write("                        <div class=\"subject-header\">\r\n");
      out.write("                            <h2>HTML · CSS</h2>\r\n");
      out.write("                            <div class=\"subject-image\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"13\" fill=\"currentColor\" class=\"bi bi-hourglass-split\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                            <path d=\"M2.5 15a.5.5 0 1 1 0-1h1v-1a4.5 4.5 0 0 1 2.557-4.06c.29-.139.443-.377.443-.59v-.7c0-.213-.154-.451-.443-.59A4.5 4.5 0 0 1 3.5 3V2h-1a.5.5 0 0 1 0-1h11a.5.5 0 0 1 0 1h-1v1a4.5 4.5 0 0 1-2.557 4.06c-.29.139-.443.377-.443.59v.7c0 .213.154.451.443.59A4.5 4.5 0 0 1 12.5 13v1h1a.5.5 0 0 1 0 1h-11zm2-13v1c0 .537.12 1.045.337 1.5h6.326c.216-.455.337-.963.337-1.5V2h-7zm3 6.35c0 .701-.478 1.236-1.011 1.492A3.5 3.5 0 0 0 4.5 13s.866-1.299 3-1.48V8.35zm1 0v3.17c2.134.181 3 1.48 3 1.48a3.5 3.5 0 0 0-1.989-3.158C8.978 9.586 8.5 9.052 8.5 8.351z\"/>\r\n");
      out.write("                          </svg>&nbsp;강의 수: 16강</p>\r\n");
      out.write("        \r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"subject-content\">\r\n");
      out.write("                        <div class=\"subject-header\">\r\n");
      out.write("                            <h2>JAVA (Basic)</h2>\r\n");
      out.write("                            <div class=\"subject-image\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"13\" fill=\"currentColor\" class=\"bi bi-hourglass-split\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                            <path d=\"M2.5 15a.5.5 0 1 1 0-1h1v-1a4.5 4.5 0 0 1 2.557-4.06c.29-.139.443-.377.443-.59v-.7c0-.213-.154-.451-.443-.59A4.5 4.5 0 0 1 3.5 3V2h-1a.5.5 0 0 1 0-1h11a.5.5 0 0 1 0 1h-1v1a4.5 4.5 0 0 1-2.557 4.06c-.29.139-.443.377-.443.59v.7c0 .213.154.451.443.59A4.5 4.5 0 0 1 12.5 13v1h1a.5.5 0 0 1 0 1h-11zm2-13v1c0 .537.12 1.045.337 1.5h6.326c.216-.455.337-.963.337-1.5V2h-7zm3 6.35c0 .701-.478 1.236-1.011 1.492A3.5 3.5 0 0 0 4.5 13s.866-1.299 3-1.48V8.35zm1 0v3.17c2.134.181 3 1.48 3 1.48a3.5 3.5 0 0 0-1.989-3.158C8.978 9.586 8.5 9.052 8.5 8.351z\"/>\r\n");
      out.write("                          </svg>&nbsp;강의 수: 16강</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"subject-content\">\r\n");
      out.write("                        <div class=\"subject-header\">\r\n");
      out.write("                            <h2>SPRING</h2>\r\n");
      out.write("                            <div class=\"subject-image\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <p><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"13\" fill=\"currentColor\" class=\"bi bi-hourglass-split\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                            <path d=\"M2.5 15a.5.5 0 1 1 0-1h1v-1a4.5 4.5 0 0 1 2.557-4.06c.29-.139.443-.377.443-.59v-.7c0-.213-.154-.451-.443-.59A4.5 4.5 0 0 1 3.5 3V2h-1a.5.5 0 0 1 0-1h11a.5.5 0 0 1 0 1h-1v1a4.5 4.5 0 0 1-2.557 4.06c-.29.139-.443.377-.443.59v.7c0 .213.154.451.443.59A4.5 4.5 0 0 1 12.5 13v1h1a.5.5 0 0 1 0 1h-11zm2-13v1c0 .537.12 1.045.337 1.5h6.326c.216-.455.337-.963.337-1.5V2h-7zm3 6.35c0 .701-.478 1.236-1.011 1.492A3.5 3.5 0 0 0 4.5 13s.866-1.299 3-1.48V8.35zm1 0v3.17c2.134.181 3 1.48 3 1.48a3.5 3.5 0 0 0-1.989-3.158C8.978 9.586 8.5 9.052 8.5 8.351z\"/>\r\n");
      out.write("                          </svg>&nbsp;강의 수: 16강</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a href=\"#\">\r\n");
      out.write("                        <span class=\"material-symbols-outlined\">\r\n");
      out.write("                            arrow_forward_ios\r\n");
      out.write("                        </span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"content\">\r\n");
      out.write("                    <div class=\"like\">\r\n");
      out.write("                        <div class=\"like-header\">\r\n");
      out.write("                            <h3>Like List</h3>\r\n");
      out.write("                            <button type=\"button\" onclick=\"location.href='/main/likeList'\">더보기 +</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"like-container\">\r\n");
      out.write("                            <div class=\"like-content\">\r\n");
      out.write("                                <h4>1강. hello world</h4>\r\n");
      out.write("                                <p>2day ago</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"like-content\">\r\n");
      out.write("                                <h4>2강. hello world</h4>\r\n");
      out.write("                                <p>2day ago</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"like-content\">\r\n");
      out.write("                                <h4>3강. hello world</h4>\r\n");
      out.write("                                <p>2day ago</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"like-content\">\r\n");
      out.write("                                <h4>3강. hello world</h4>\r\n");
      out.write("                                <p>2day ago</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"content-right\">\r\n");
      out.write("                        <div class=\"qna\">\r\n");
      out.write("                            <div class=\"qna-header\">\r\n");
      out.write("                                <h3>Community</h3>\r\n");
      out.write("                                <button type=\"button\" onclick=\"location.href='/main/community'\">더보기 +</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"qna-content\">\r\n");
      out.write("                                <h4>개발</h4>\r\n");
      out.write("                                <p>스프링 get과 post의 차이점이 뭔디?</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"todo\">\r\n");
      out.write("                            <div class=\"todo-header\">\r\n");
      out.write("                                <h3 id=\"todoTitle\">ToDo</h3>\r\n");
      out.write("                                <input id=\"todo-content\" type=\"text\">\r\n");
      out.write("                                <button id=\"todoBtn\"><span class=\"material-symbols-outlined\">\r\n");
      out.write("                                        add\r\n");
      out.write("                                    </span></button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div id=\"todo-container\" class=\"todo-container\">\r\n");
      out.write("                                <div class=\"todo-content\">\r\n");
      out.write("                                    <p><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\"\r\n");
      out.write("                                            fill=\"currentColor\" class=\"bi bi-check2-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("                                                d=\"M2.5 8a5.5 5.5 0 0 1 8.25-4.764.5.5 0 0 0 .5-.866A6.5 6.5 0 1 0 14.5 8a.5.5 0 0 0-1 0 5.5 5.5 0 1 1-11 0z\" />\r\n");
      out.write("                                            <path\r\n");
      out.write("                                                d=\"M15.354 3.354a.5.5 0 0 0-.708-.708L8 9.293 5.354 6.646a.5.5 0 1 0-.708.708l3 3a.5.5 0 0 0 .708 0l7-7z\" />\r\n");
      out.write("                                        </svg>&nbsp; 스프링 get과 post의 차이점이 뭔디?</p>\r\n");
      out.write("                                    <a href=\"#\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\"\r\n");
      out.write("                                            fill=\"currentColor\" class=\"bi bi-trash3\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("                                                d=\"M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z\" />\r\n");
      out.write("                                        </svg></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"todo-content\">\r\n");
      out.write("                                    <p><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\"\r\n");
      out.write("                                            fill=\"currentColor\" class=\"bi bi-check2-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("                                                d=\"M2.5 8a5.5 5.5 0 0 1 8.25-4.764.5.5 0 0 0 .5-.866A6.5 6.5 0 1 0 14.5 8a.5.5 0 0 0-1 0 5.5 5.5 0 1 1-11 0z\" />\r\n");
      out.write("                                            <path\r\n");
      out.write("                                                d=\"M15.354 3.354a.5.5 0 0 0-.708-.708L8 9.293 5.354 6.646a.5.5 0 1 0-.708.708l3 3a.5.5 0 0 0 .708 0l7-7z\" />\r\n");
      out.write("                                        </svg>&nbsp; 스프링 get과 post의 차이점이 뭔디?</p>\r\n");
      out.write("                                    <a href=\"#\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\"\r\n");
      out.write("                                            fill=\"currentColor\" class=\"bi bi-trash3\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("                                                d=\"M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z\" />\r\n");
      out.write("                                        </svg></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"todo-content\">\r\n");
      out.write("                                    <p><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\"\r\n");
      out.write("                                            fill=\"currentColor\" class=\"bi bi-check2-circle\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("                                                d=\"M2.5 8a5.5 5.5 0 0 1 8.25-4.764.5.5 0 0 0 .5-.866A6.5 6.5 0 1 0 14.5 8a.5.5 0 0 0-1 0 5.5 5.5 0 1 1-11 0z\" />\r\n");
      out.write("                                            <path\r\n");
      out.write("                                                d=\"M15.354 3.354a.5.5 0 0 0-.708-.708L8 9.293 5.354 6.646a.5.5 0 1 0-.708.708l3 3a.5.5 0 0 0 .708 0l7-7z\" />\r\n");
      out.write("                                        </svg>&nbsp; 스프링 get과 post의 차이점이 뭔디?</p>\r\n");
      out.write("                                    <a href=\"#\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\"\r\n");
      out.write("                                            fill=\"currentColor\" class=\"bi bi-trash3\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                            <path\r\n");
      out.write("                                                d=\"M6.5 1h3a.5.5 0 0 1 .5.5v1H6v-1a.5.5 0 0 1 .5-.5ZM11 2.5v-1A1.5 1.5 0 0 0 9.5 0h-3A1.5 1.5 0 0 0 5 1.5v1H2.506a.58.58 0 0 0-.01 0H1.5a.5.5 0 0 0 0 1h.538l.853 10.66A2 2 0 0 0 4.885 16h6.23a2 2 0 0 0 1.994-1.84l.853-10.66h.538a.5.5 0 0 0 0-1h-.995a.59.59 0 0 0-.01 0H11Zm1.958 1-.846 10.58a1 1 0 0 1-.997.92h-6.23a1 1 0 0 1-.997-.92L3.042 3.5h9.916Zm-7.487 1a.5.5 0 0 1 .528.47l.5 8.5a.5.5 0 0 1-.998.06L5 5.03a.5.5 0 0 1 .47-.53Zm5.058 0a.5.5 0 0 1 .47.53l-.5 8.5a.5.5 0 1 1-.998-.06l.5-8.5a.5.5 0 0 1 .528-.47ZM8 4.5a.5.5 0 0 1 .5.5v8.5a.5.5 0 0 1-1 0V5a.5.5 0 0 1 .5-.5Z\" />\r\n");
      out.write("                                        </svg></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"right\">\r\n");
      out.write("            <div>\r\n");
      out.write("                <table class=\"Calendar\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td onClick=\"prevCalendar();\" style=\"cursor:pointer;\">&#60;</td>\r\n");
      out.write("                            <td colspan=\"5\">\r\n");
      out.write("                                <span id=\"calYear\"></span>년\r\n");
      out.write("                                <span id=\"calMonth\"></span>월\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <td onClick=\"nextCalendar();\" style=\"cursor:pointer;\">&#62;</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>일</td>\r\n");
      out.write("                            <td>월</td>\r\n");
      out.write("                            <td>화</td>\r\n");
      out.write("                            <td>수</td>\r\n");
      out.write("                            <td>목</td>\r\n");
      out.write("                            <td>금</td>\r\n");
      out.write("                            <td>토</td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("             <div class=\"schedule-add\">\r\n");
      out.write("                <button id=\"scheduleAddBtn\">\r\n");
      out.write("                    <span class=\"material-symbols-outlined\">\r\n");
      out.write("                        add_circle\r\n");
      out.write("                        </span>\r\n");
      out.write("                </button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"schedule-container\" class=\"schedule-container\">\r\n");
      out.write("            <div class=\"schedule\">\r\n");
      out.write("                <h4>7월</h4>\r\n");
      out.write("                <p>8일 | 정보처리기사 필기시험</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"schedule\">\r\n");
      out.write("                <h4>9월</h4>\r\n");
      out.write("                <p>9일 | SQLD 시험</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<!-- 스케줄 추가 모달 -->\r\n");
      out.write("    <div class=\"modal-overlay\">\r\n");
      out.write("        <div class=\"modal\">\r\n");
      out.write("            <h2>일정 추가</h2>\r\n");
      out.write("            <label for=\"date\">날짜:</label>\r\n");
      out.write("            <input type=\"date\" id=\"date\" required><br><br>\r\n");
      out.write("            <label for=\"url\">url:</label>\r\n");
      out.write("            <input type=\"text\" id=\"url\" required><br><br>\r\n");
      out.write("            <label for=\"description\">내용:</label>\r\n");
      out.write("            <textarea id=\"description\" required></textarea><br><br>\r\n");
      out.write("            <button id=\"scheduleRegisterBtn\">일정 추가</button>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- todo list 모달 -->\r\n");
      out.write("	<div id=\"todoModal\" class=\"todo-modal\">\r\n");
      out.write("	    <div class=\"todo-modal-content\">\r\n");
      out.write("	      <div class=\"todo-modal-title\">TODO LIST</div>\r\n");
      out.write("	      <input type=\"text\" class=\"todo-modal-input\" id=\"todoModalInput\" placeholder=\"정보를 입력하세요\">\r\n");
      out.write("	      <button class=\"todo-modal-button\" id=\"todoModalAddButton\">ADD</button>\r\n");
      out.write("	      <div class=\"todo-modal-list\" id=\"todoModalList\">\r\n");
      out.write("	      	<!-- todo list 출력되는 부분 -->\r\n");
      out.write("	      </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("  	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("    <script src=\"/resources/js/main.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    	schedulePrint();\r\n");
      out.write("    	todoPrint();\r\n");
      out.write("    	const id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                	");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("                	");
          if (_jspx_meth_c_005fotherwise_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/views/main/main.jsp(24,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.id eq 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                		<button><a href=\"/menu/qna_admin\">📁<span> Q&A</span></a></button><br>            	\r\n");
          out.write("                	");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    boolean _jspx_th_c_005fotherwise_005f0_reused = false;
    try {
      _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
      if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                		<button><a href=\"/menu/qna\">📁<span> Q&A</span></a></button><br>            	\r\n");
          out.write("                	");
          int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
      _jspx_th_c_005fotherwise_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fotherwise_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fotherwise_005f0_reused);
    }
    return false;
  }
}
