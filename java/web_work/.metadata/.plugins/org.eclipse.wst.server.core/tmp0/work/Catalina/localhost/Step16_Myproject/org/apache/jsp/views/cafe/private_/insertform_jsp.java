/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.48
 * Generated at: 2018-01-07 08:27:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.cafe.private_;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insertform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/lmk/dev/java/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Step16_Myproject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1515144894000L));
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<meta name=\"description\" content=\"\">\r\n");
      out.write("<meta name=\"author\" content=\"Sergey Pozhilov (GetTemplate.com)\">\r\n");
      out.write("\r\n");
      out.write("<title>Board</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/resource.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Fixed navbar -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/topnavbar.jsp", out, false);
      out.write("\r\n");
      out.write("\t<!-- /.navbar -->\r\n");
      out.write("\r\n");
      out.write("\t<header id=\"head\" class=\"secondary\"></header>\r\n");
      out.write("\r\n");
      out.write("\t<!-- container -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<ol class=\"breadcrumb\">\r\n");
      out.write("\t\t\t<li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("\t\t\t<li class=\"active\">About</li>\r\n");
      out.write("\t\t</ol>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!-- Article main content -->\r\n");
      out.write("\t\t\t<article class=\"maincontent\">\r\n");
      out.write("\t\t\t\t<header class=\"page-header\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"page-title\">게시판</h1>\r\n");
      out.write("\t\t\t\t</header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h3>카페 새글 입력 페이지 입니다.</h3>\r\n");
      out.write("\t\t\t\t<form action=\"insert.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<label for=\"writer\">작성자</label> <input type=\"text\" id=\"writer\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" disabled=\"disabled\" /><br /> <label for=\"title\">제목</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"title\" id=\"title\" /><br />\r\n");
      out.write("\t\t\t\t\t<textarea name=\"ir1\" id=\"ir1\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 766px; height: 412px; display: none\"></textarea>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"pasteHTML();\" value=\"본문에 내용 넣기\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"showHTML();\" value=\"본문 내용 가져오기\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" onclick=\"submitContents(this);\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"서버로 내용 전송\" /> <input type=\"button\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"setDefaultFont();\" value=\"기본 폰트 지정하기 (궁서_24)\" />\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</article>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /container -->\r\n");
      out.write("\r\n");
      out.write("\t<section class=\"container-full top-space\">\r\n");
      out.write("\t\t<div id=\"map\"></div>\r\n");
      out.write("\t</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- footer -->\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/resources/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\r\n");
      out.write("\tSmartEditor/js/HuskyEZCreator.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tvar oEditors = [];\r\n");
      out.write("\r\n");
      out.write("\t\t//추가 글꼴 목록\r\n");
      out.write("\t\t//var aAdditionalFontSet = [[\"MS UI Gothic\", \"MS UI Gothic\"], [\"Comic Sans MS\", \"Comic Sans MS\"],[\"TEST\",\"TEST\"]];\r\n");
      out.write("\r\n");
      out.write("\t\tnhn.husky.EZCreator\r\n");
      out.write("\t\t\t\t.createInIFrame({\r\n");
      out.write("\t\t\t\t\toAppRef : oEditors,\r\n");
      out.write("\t\t\t\t\telPlaceHolder : \"ir1\",\r\n");
      out.write("\t\t\t\t\tsSkinURI : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/SmartEditor/SmartEditor2Skin.html\",\r\n");
      out.write("\t\t\t\t\thtParams : {\r\n");
      out.write("\t\t\t\t\t\tbUseToolbar : true, // 툴바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("\t\t\t\t\t\tbUseVerticalResizer : true, // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("\t\t\t\t\t\tbUseModeChanger : true, // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)\r\n");
      out.write("\t\t\t\t\t\t//aAdditionalFontList : aAdditionalFontSet,\t\t// 추가 글꼴 목록\r\n");
      out.write("\t\t\t\t\t\tfOnBeforeUnload : function() {\r\n");
      out.write("\t\t\t\t\t\t\t//alert(\"완료!\");\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}, //boolean\r\n");
      out.write("\t\t\t\t\tfOnAppLoad : function() {\r\n");
      out.write("\t\t\t\t\t\t//예제 코드\r\n");
      out.write("\t\t\t\t\t\t//oEditors.getById[\"ir1\"].exec(\"PASTE_HTML\", [\"로딩이 완료된 후에 본문에 삽입되는 text입니다.\"]);\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tfCreator : \"createSEditor2\"\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tfunction pasteHTML() {\r\n");
      out.write("\t\t\tvar sHTML = \"<span style='color:#FF0000;'>이미지도 같은 방식으로 삽입합니다.<\\/span>\";\r\n");
      out.write("\t\t\toEditors.getById[\"ir1\"].exec(\"PASTE_HTML\", [ sHTML ]);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction showHTML() {\r\n");
      out.write("\t\t\tvar sHTML = oEditors.getById[\"ir1\"].getIR();\r\n");
      out.write("\t\t\talert(sHTML);\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction submitContents(elClickedObj) {\r\n");
      out.write("\t\t\toEditors.getById[\"ir1\"].exec(\"UPDATE_CONTENTS_FIELD\", []); // 에디터의 내용이 textarea에 적용됩니다.\r\n");
      out.write("\r\n");
      out.write("\t\t\t// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById(\"ir1\").value를 이용해서 처리하면 됩니다.\r\n");
      out.write("\r\n");
      out.write("\t\t\t//검증후 폼의 전송을 막고 싶으면 return false; \r\n");
      out.write("\r\n");
      out.write("\t\t\ttry {\r\n");
      out.write("\t\t\t\telClickedObj.form.submit();//폼전송\r\n");
      out.write("\t\t\t} catch (e) {\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\tfunction setDefaultFont() {\r\n");
      out.write("\t\t\tvar sDefaultFont = '궁서';\r\n");
      out.write("\t\t\tvar nFontSize = 24;\r\n");
      out.write("\t\t\toEditors.getById[\"ir1\"].setDefaultFont(sDefaultFont, nFontSize);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
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
