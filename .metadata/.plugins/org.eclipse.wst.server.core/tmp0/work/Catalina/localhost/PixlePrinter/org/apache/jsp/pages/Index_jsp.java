/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-04-29 05:22:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utilities.Utilities;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("utilities.Utilities");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<link rel=\"icon\"\n");
      out.write("    href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/pixelprinter-high-resolution-logo.png\"\n");
      out.write("    type=\"image/png\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Printer Design</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("    href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("    href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/Style.css\" />\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <section id=\"header\" class=\"header\">\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/Index.jsp\"><img\n");
      out.write("            src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/logo.png\" class=\"logo\"\n");
      out.write("            style=\"width: 120px; height: auto;\"></a>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <a class=\"active\"\n");
      out.write("                href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/Index.jsp\">Home</a> <a\n");
      out.write("                href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/DisplayProductToCustomerServlet\">Product</a>\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/Contact.jsp\">About\n");
      out.write("                Us</a> \n");
      out.write("            ");
 
            if (session.getAttribute("username") == null) {
            
      out.write("\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/Login.jsp\">Login</a>\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/LogoutServlet\">Logout</a>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"icons\">\n");
      out.write("            <div id=\"menu-btn\" class=\"fas fa-bars\"></div>\n");
      out.write("            <a href=\"#\" class=\"fas fa-user-circle\"></a> <a href=\"#\"\n");
      out.write("                class=\"fas fa-search\"></a> <a href=\"#\" class=\"fas fa-shopping-cart\"></a>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("	<!-- Main Content -->\n");
      out.write("	<div class=\"main\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<!-- Text and image content -->\n");
      out.write("				<div class=\"col2\">\n");
      out.write("					<h1>\n");
      out.write("						Best Printers for you <br /> Shop with us\n");
      out.write("					</h1>\n");
      out.write("					<p>Now make your office and academic work easier and convenient\n");
      out.write("						by connecting with us!</p>\n");
      out.write("					<br /> <a\n");
      out.write("						href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/DisplayProductToCustomerServlet\"\n");
      out.write("						class=\"btn\">Explore Now &#8594;</a>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col2\">\n");
      out.write("					<img\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/Untitled design.png\" />\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<!-- Featured Categories -->\n");
      out.write("	<div class=\"categories\">\n");
      out.write("		<div class=\"small-container\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<!-- Images for featured categories -->\n");
      out.write("				<div class=\"col3\">\n");
      out.write("					<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/Product3.jpg\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col3\">\n");
      out.write("					<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/Product1.jpg\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col3\">\n");
      out.write("					<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/Product4.jpg\" />\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<!-- Offer Section -->\n");
      out.write("	<div class=\"offer\">\n");
      out.write("		<div class=\"small-container\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<!-- Offer details and image -->\n");
      out.write("				<div class=\"col2\">\n");
      out.write("					<img\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/Canon_All_in_one.jpg\"\n");
      out.write("						class=\"offer Image\" />\n");
      out.write("				</div>\n");
      out.write("				<div class=\"col2\">\n");
      out.write("					<p>Exclusively available on Printer Hub</p>\n");
      out.write("					<h1>Canon all in One Printer</h1>\n");
      out.write("					<small>The Canon All in One Printer has all the function\n");
      out.write("						you need. It can print paper at the best quality and can also scan\n");
      out.write("						the documents you need</small> <br /> <br /> <a\n");
      out.write("						href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Html/CanonAllInOne.jsp\"\n");
      out.write("						class=\"btn\">Buy Now &#8594;</a>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("	<!-- Footer Section -->\n");
      out.write("	<div class=\"footer\">\n");
      out.write("		<div class=\"container\">\n");
      out.write("			<div class=\"row\">\n");
      out.write("				<!-- App download, company info, useful links, and social media -->\n");
      out.write("				<div class=\"footer-col1\">\n");
      out.write("					<h3>Download Our App</h3>\n");
      out.write("					<p>Download App for Android and IOS mobile phones</p>\n");
      out.write("					<div class=\"app-logo\">\n");
      out.write("						<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/app-store.png\"\n");
      out.write("							alt=\"\"> <img\n");
      out.write("							src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/play-store.png\"\n");
      out.write("							alt=\"\">\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"footer-col2\">\n");
      out.write("					<img\n");
      out.write("						src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/pixelprinter-high-resolution-logo.png\"\n");
      out.write("						width=\"160px\" />\n");
      out.write("					<p>\n");
      out.write("						<strong>Our purpose is your satisfaction and happiness</strong>\n");
      out.write("					</p>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"footer-col3\">\n");
      out.write("					<!-- Useful links -->\n");
      out.write("					<h3>Useful links</h3>\n");
      out.write("					<ul type=\"none\">\n");
      out.write("						<li>Coupons</li>\n");
      out.write("						<li class=\"blog-link\"><a\n");
      out.write("							href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Html/blog.jsp\"\n");
      out.write("							style=\"color: #8a8a8a;\">Blog Post</a></li>\n");
      out.write("						<li>Return Policy</li>\n");
      out.write("					</ul>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"footer-col4\">\n");
      out.write("					<!-- Social media links -->\n");
      out.write("					<h3>Follow Us</h3>\n");
      out.write("					<i class='bx bxl-youtube'>Youtube</i><br> <i\n");
      out.write("						class='bx bxl-instagram'>Instagram</i><br> <i\n");
      out.write("						class='bx bxl-facebook-circle'>Facebook</i>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<!-- Copyright Section -->\n");
      out.write("			<hr />\n");
      out.write("			<p class=\"copyright\">&copy; All rights reserved- Pixel Printer</p>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
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
