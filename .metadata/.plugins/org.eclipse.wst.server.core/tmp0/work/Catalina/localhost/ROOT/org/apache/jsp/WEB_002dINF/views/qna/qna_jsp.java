/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-07-28 01:21:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.qna;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class qna_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

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

  public void _jspInit() {
  }

  public void _jspDestroy() {
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"/resources/css/qna.css\">\r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("    href=\"https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0\" />\r\n");
      out.write("<title>community</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("        <!-- 좌측/ 전체 동일한 메뉴바 부분 -->\r\n");
      out.write("        <div class=\"left\">\r\n");
      out.write("            <img src=\"/resources/img/logo.png\" class=\"logo\" alt=\"\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"menu_bar\">\r\n");
      out.write("                <button><a href=\"/menu/home\"> 🏠<span> Home</span></a></button><br>\r\n");
      out.write("                <button><a href=\"/menu/subject\">📝<span> Subject</span></a></button><br>\r\n");
      out.write("                <button><a href=\"/menu/community\">📖<span> Community</span></a></button><br>\r\n");
      out.write("                <button><a href=\"/menu/qna\">📁<span class=\"not\"> Q&A</span></a></button><br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"sebu\">\r\n");
      out.write("                <button><a href=\"\">⚙ Setting</a></button><br>\r\n");
      out.write("                <button><a href=\"/member/logout\">🗑 Log out</a></button><br>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 우측/ Community 부분 -->\r\n");
      out.write("	<div class=\"right\">\r\n");
      out.write("      <div class=\"inbox_msg\">\r\n");
      out.write("        <!-- 채팅 창 -->\r\n");
      out.write("        <div class=\"mesgs\">\r\n");
      out.write("          <div id=\"msg_history\" class=\"msg_history\">\r\n");
      out.write("            <div class=\"incoming_msg\">\r\n");
      out.write("              <div class=\"incoming_msg_img\"> <img src=\"https://cdn-icons-png.flaticon.com/256/8955/8955051.png\" alt=\"sunil\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"received_msg\">\r\n");
      out.write("                <div class=\"received_withd_msg\">\r\n");
      out.write("                  <p>안녕하세요. ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.nickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("님 무엇을 도와드릴까요?</p>\r\n");
      out.write("                  <span class=\"time_date\"> 11:01 AM | June 9</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"outgoing_msg\">\r\n");
      out.write("              <div class=\"sent_msg\">\r\n");
      out.write("                <p>Test which is a new approach to have all\r\n");
      out.write("                  solutions</p>\r\n");
      out.write("                <span class=\"time_date\"> 11:01 AM | June 9</span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"incoming_msg\">\r\n");
      out.write("              <div class=\"incoming_msg_img\"> <img src=\"https://ptetutorials.com/images/user-profile.png\" alt=\"sunil\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"received_msg\">\r\n");
      out.write("                <div class=\"received_withd_msg\">\r\n");
      out.write("                  <p>Test, which is a new approach to have</p>\r\n");
      out.write("                  <span class=\"time_date\"> 11:01 AM | Yesterday</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"outgoing_msg\">\r\n");
      out.write("              <div class=\"sent_msg\">\r\n");
      out.write("                <p>Apollo University, Delhi, India Test</p>\r\n");
      out.write("                <span class=\"time_date\"> 11:01 AM | Today</span>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"incoming_msg\">\r\n");
      out.write("              <div class=\"incoming_msg_img\"> <img src=\"https://ptetutorials.com/images/user-profile.png\" alt=\"sunil\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"received_msg\">\r\n");
      out.write("                <div class=\"received_withd_msg\">\r\n");
      out.write("                  <p>We work directly with our designers and suppliers,\r\n");
      out.write("                    and sell direct to you, which means quality, exclusive\r\n");
      out.write("                    products, at a price anyone can afford.</p>\r\n");
      out.write("                  <span class=\"time_date\"> 11:01 AM | Today</span>\r\n");
      out.write("                </div>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"type_msg\">\r\n");
      out.write("            <div class=\"input_msg_write\">\r\n");
      out.write("              <input type=\"text\" id=\"write_msg\" class=\"write_msg\" placeholder=\"Type a message\" onkeypress=\"enterkey(event)\"/>\r\n");
      out.write("              <button id=\"msg_send_btn\" class=\"msg_send_btn\" type=\"button\"><span class=\"material-symbols-outlined\">\r\n");
      out.write("                send\r\n");
      out.write("                </span></button>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div id=\"chatBotContainer\" class=\"bottom\">\r\n");
      out.write("     \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("  <script type=\"text/javascript\" src=\"/resources/js/qna.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		const userId = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("		const nickname=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ses.nickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("		getMsgList(userId);\r\n");
      out.write("/* 		scrollBottom(); */\r\n");
      out.write("		printChatBotList();\r\n");
      out.write("	</script>\r\n");
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
}
