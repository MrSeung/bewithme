/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-07-28 01:22:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.subject;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class course_005freg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta  http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
      out.write("<!-- include libraries(jQuery, bootstrap) -->\r\n");
      out.write("<link href=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js\"></script> \r\n");
      out.write("<script src=\"http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js\"></script> \r\n");
      out.write("<!-- include summernote css/js-->\r\n");
      out.write("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote-bs4.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/summernote/0.8.11/summernote-bs4.js\"></script>\r\n");
      out.write("<!-- include summernote-ko-KR -->\r\n");
      out.write("<script src=\"/resources/js/summernote-ko-KR.js\"></script>\r\n");
      out.write("<link href=\"/resources/css/register2.css\" rel=\"stylesheet\">\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("     $('#summernote').summernote({\r\n");
      out.write("           placeholder: 'content',\r\n");
      out.write("           minHeight: 370,\r\n");
      out.write("           maxHeight: null,\r\n");
      out.write("           focus: true, \r\n");
      out.write("           lang : 'ko-KR'\r\n");
      out.write("     });\r\n");
      out.write("   });\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("function goWrite(frm) {\r\n");
      out.write("	var title = frm.title.value;\r\n");
      out.write("	var writer = frm.writer.value;\r\n");
      out.write("	var content = frm.content.value;\r\n");
      out.write("	\r\n");
      out.write("	if (title.trim() == ''){\r\n");
      out.write("		alert(\"제목을 입력해주세요\");\r\n");
      out.write("		return false;\r\n");
      out.write("	}\r\n");
      out.write("	if (writer.trim() == ''){\r\n");
      out.write("		alert(\"작성자를 입력해주세요\");\r\n");
      out.write("		return false;\r\n");
      out.write("	}\r\n");
      out.write("	if (content.trim() == ''){\r\n");
      out.write("		alert(\"내용을 입력해주세요\");\r\n");
      out.write("		return false;\r\n");
      out.write("	}\r\n");
      out.write("	frm.submit();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<title>register</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("        \r\n");
      out.write("        <!-- 좌측/ 전체 동일한 메뉴바 부분 -->\r\n");
      out.write("       <div class=\"left\">\r\n");
      out.write("           <img src=\"/resources/img/logo.png\" class=\"logo\" alt=\"\">\r\n");
      out.write("           <div class=\"menu_bar\">\r\n");
      out.write("               <button><a href=\"\"> 🏠<span> Home</span></a></button><br>\r\n");
      out.write("               <button><a href=\"\">📝<span> Subject</span></a></button><br>\r\n");
      out.write("               <button><a href=\"\">📖<span class=\"not\"> Community</span></a></button><br>\r\n");
      out.write("               <button><a href=\"\">📁<span> Q&A</span></a></button><br>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"sebu\">\r\n");
      out.write("                <button><a href=\"\">⚙ Setting</a></button><br>\r\n");
      out.write("                <button><a href=\"\">🗑 Log out</a></button><br>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <form method=\"post\" action=\"/co/write\"> \r\n");
      out.write("        <!-- 우측/ Comment 부분 -->\r\n");
      out.write("        <div class=\"right\">\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("           <div class=\"wcontent\">\r\n");
      out.write("                 \r\n");
      out.write("            <div class=\"wleft\">\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"head\">\r\n");
      out.write("                  <a>\r\n");
      out.write("                     <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" color=\"white\" fill=\"currentColor\" class=\"bi bi-chevron-left\" viewBox=\"0 0 16 16\">\r\n");
      out.write("                                <path fill-rule=\"evenodd\" d=\"M11.354 1.646a.5.5 0 0 1 0 .708L5.707 8l5.647 5.646a.5.5 0 0 1-.708.708l-6-6a.5.5 0 0 1 0-.708l6-6a.5.5 0 0 1 .708 0z\"/>\r\n");
      out.write("                              </svg>\r\n");
      out.write("                  </a>\r\n");
      out.write("                  <h4>게시글 작성</h4>\r\n");
      out.write("               </div>  \r\n");
      out.write("                 <input type=\"hidden\" name=\"sub_num\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sub_num}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("               <div class=\"title\">\r\n");
      out.write("                  <p>제목</p>\r\n");
      out.write("                  <input type=\"text\" name=\"cou_title\" placeholder=\"제목을 입력해주세요\" >\r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("               <div>\r\n");
      out.write("                  <p>닉네임</p>\r\n");
      out.write("                  <input type=\"text\" name=\"id\" value=\"su@naver.com\">\r\n");
      out.write("                  <!-- readonly=\"readonly\"  placeholder=\"정은\" --> \r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("               <div>\r\n");
      out.write("                  <p>작성일자</p>\r\n");
      out.write("                  <input type=\"text\" name=\"cou_reg_date\">\r\n");
      out.write("                  <!-- readonly=\"readonly\"  placeholder=\"2023-07-08\" -->\r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"file_list\">\r\n");
      out.write("                        <hr>\r\n");
      out.write("                        <p>파일</p>\r\n");
      out.write("                  <button type=\"submit\">파일 첨부 + </button>\r\n");
      out.write("               </div>\r\n");
      out.write("               \r\n");
      out.write("               <div class=\"line\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("      \r\n");
      out.write("               <div class=\"wright\">\r\n");
      out.write("               <div class=\"wtitle\">\r\n");
      out.write("                  <h4>✍ 상세 설명</h4>\r\n");
      out.write("<!--                   <input id=\"subBtn\" type=\"button\" value=\"저장\" class=\"wbutton\"\r\n");
      out.write("                     onclick=\"location.href='/write'\" /> -->\r\n");
      out.write("                     <button id=\"subBtn\"  class=\"wbutton\">저장</button>\r\n");
      out.write("               </div>\r\n");
      out.write("               <!-- 썸머노트 들어갈 곳 -->\r\n");
      out.write("               <div style=\" margin: auto;\" class=\"summer\">\r\n");
      out.write("                     <textarea id=\"summernote\" name=\"cou_content\"></textarea>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("      </div>\r\n");
      out.write("       \r\n");
      out.write("      \r\n");
      out.write("      </div>\r\n");
      out.write("      </form>\r\n");
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
