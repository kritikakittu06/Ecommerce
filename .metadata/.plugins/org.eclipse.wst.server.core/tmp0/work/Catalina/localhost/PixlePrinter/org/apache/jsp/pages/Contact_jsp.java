/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-04-15 10:09:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utilities.Utilities;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Contact Us</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\">\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/css/Contact.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<section id=\"header\" class=\"header\">\n");
      out.write("		<a href=\"#\"><img\n");
      out.write("			src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Images/logo.png\" class=\"logo\"\n");
      out.write("			style=\"width: 120px; height: auto;\"></a>\n");
      out.write("		<nav class=\"navbar\">\n");
      out.write("			<a class=\"active\"\n");
      out.write("				href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/Index.jsp\">Home</a> <a\n");
      out.write("				href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/product.jsp\">Product</a>\n");
      out.write("			<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/Contact.jsp\">About\n");
      out.write("				Us</a> <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/Login.jsp\">Login</a>\n");
      out.write("		</nav>\n");
      out.write("		<div class=\"icons\">\n");
      out.write("			<div id=\"menu-btn\" class=\"fas fa-bars\"></div>\n");
      out.write("			<a href=\"#\" class=\"fas fa-user-circle\"></a> <a href=\"#\"\n");
      out.write("				class=\"fas fa-search\"></a> <a href=\"#\" class=\"fas fa-heart\"></a>\n");
      out.write("		</div>\n");
      out.write("	</section>\n");
      out.write("	<br>\n");
      out.write("	<br>\n");
      out.write("	<div class=\"message-from-backend\">\n");
      out.write("		");
 if (session.getAttribute(Utilities.Successfully_Stored_Message) != null) { 
      out.write("\n");
      out.write("		<div class=\"alert alert-success\" role=\"alert\">\n");
      out.write("			");
      out.print( session.getAttribute(Utilities.Successfully_Stored_Message) );
      out.write("\n");
      out.write("		</div>\n");
      out.write("		");
 } else if (request.getAttribute(Utilities.ERROR_MESSAGE) != null) {
                  if (request.getAttribute(Utilities.ERROR_MESSAGE).equals(Utilities.INCORRECT_FORM_DATA_MESSAGE)) { 
      out.write("\n");
      out.write("		<div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("			");
      out.print( request.getAttribute(Utilities.ERROR_MESSAGE) );
      out.write("\n");
      out.write("		</div>\n");
      out.write("		");
   } else if (request.getAttribute(Utilities.ERROR_MESSAGE).equals(Utilities.SERVER_ERROR_MESSAGE)) { 
      out.write("\n");
      out.write("		<div class=\"alert alert-danger\" role=\"alert\">\n");
      out.write("			");
      out.print( request.getAttribute(Utilities.ERROR_MESSAGE) );
      out.write("\n");
      out.write("		</div>\n");
      out.write("		");
   }
                  } 
      out.write("\n");
      out.write("	</div>\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<div class=\"content\">\n");
      out.write("			<div class=\"left\">\n");
      out.write("				<!-- Address Details -->\n");
      out.write("				<div class=\"address details\">\n");
      out.write("					<i class=\"fas fa-map-marker-alt\"></i>\n");
      out.write("					<div class=\"topic\">Address</div>\n");
      out.write("					<div class=\"text-one\">Dulari</div>\n");
      out.write("					<div class=\"text-two\">sunsari</div>\n");
      out.write("				</div>\n");
      out.write("				<!-- Phone Details -->\n");
      out.write("				<div class=\"phone details\">\n");
      out.write("					<i class=\"fas fa-phone-alt\"></i>\n");
      out.write("					<div class=\"topic\">Phone</div>\n");
      out.write("					<div class=\"text-one\">(977) 9842630796</div>\n");
      out.write("				</div>\n");
      out.write("				<!-- Email Details -->\n");
      out.write("				<div class=\"email details\">\n");
      out.write("					<i class=\"fas fa-envelope\"></i>\n");
      out.write("					<div class=\"topic\">Email</div>\n");
      out.write("					<div class=\"text-one\">pixelPrinter123@gmail.com</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<br> <br>\n");
      out.write("			<!-- Contact Form -->\n");
      out.write("			<div class=\"right\">\n");
      out.write("				<div class=\"topic-text\">Send us a message</div>\n");
      out.write("				<p >If you have any queries regarding our products or overall\n");
      out.write("					system, you can contact us here.</p>\n");
      out.write("				<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/StoreContactUsMessage\" method=\"post\">\n");
      out.write("					<div class=\"input-box\">\n");
      out.write("						<input name=\"name\" type=\"text\" id=\"name\"\n");
      out.write("							placeholder=\"Enter your name\" required>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"input-box\">\n");
      out.write("						<input name=\"email\" type=\"text\" id=\"email\"\n");
      out.write("							placeholder=\"Enter your email\" required>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"input-box\">\n");
      out.write("						<input type=\"tel\" id=\"phoneNumber\" placeholder=\"Phone Number\"\n");
      out.write("							name=\"phone_Num\">\n");
      out.write("					</div>\n");
      out.write("					<div class=\"input-box message-box\">\n");
      out.write("						<textarea name=\"message\" id=\"message\"\n");
      out.write("							placeholder=\"write us a message\" rows=\"4\" cols=\"50\" required></textarea>\n");
      out.write("					</div>\n");
      out.write("					<div class=\"button\">\n");
      out.write("						<button type=\"submit\">Send Now</button>\n");
      out.write("					</div>\n");
      out.write("				</form>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<section class=\"footer\">\n");
      out.write("		<div class=\"box-container\">\n");
      out.write("			<div class=\"box\">\n");
      out.write("				<h3>quick links</h3>\n");
      out.write("				<a class=\"link\" href=\"#home\"> <i class=\"fas fa-angle-right\"></i>\n");
      out.write("					home\n");
      out.write("				</a> <a class=\"link\" href=\"#about\"> <i class=\"fas fa-angle-right\"></i>\n");
      out.write("					Blogs\n");
      out.write("				</a> <a class=\"link\" href=\"#shop\"> <i class=\"fas fa-angle-right\"></i>\n");
      out.write("					Contact US\n");
      out.write("				</a> <a class=\"link\" href=\"#gallery\"> <i class=\"fas fa-angle-right\"></i>\n");
      out.write("					About US\n");
      out.write("				</a> <a class=\"link\" href=\"#message\"> <i class=\"fas fa-angle-right\"></i>\n");
      out.write("					Log In\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"box\">\n");
      out.write("				<h3>extra links</h3>\n");
      out.write("				<a class=\"link\" href=\"#\"> <i class=\"fas fa-angle-right\"></i> my\n");
      out.write("					favorite\n");
      out.write("				</a> <a class=\"link\" href=\"#\"> <i class=\"fas fa-angle-right\"></i> my\n");
      out.write("					order\n");
      out.write("				</a> <a class=\"link\" href=\"#\"> <i class=\"fas fa-angle-right\"></i> my\n");
      out.write("					wish list\n");
      out.write("				</a> <a class=\"link\" href=\"#\"> <i class=\"fas fa-angle-right\"></i>\n");
      out.write("					private policy\n");
      out.write("				</a> <a class=\"link\" href=\"#\"> <i class=\"fas fa-angle-right\"></i>\n");
      out.write("					terms of use\n");
      out.write("				</a>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"box\">\n");
      out.write("				<h3>contact info</h3>\n");
      out.write("				<a class=\"link\" href=\"#\"> <i class=\"fas fa-phone\"></i> +9779825908706\n");
      out.write("				</a> <a class=\"link\" href=\"#\"> <i class=\"fas fa-phone\"></i> +977 9814961231\n");
      out.write("				</a> <a class=\"link\" href=\"#\"> <i class=\"fas fa-envelope\"></i>\n");
      out.write("					pixelPrinter123@gmail.com\n");
      out.write("				</a> <a class=\"link\" href=\"#\"> <i class=\"fas fa-map\"></i> Damak, Nepal - 401203\n");
      out.write("				</a>\n");
      out.write("				<div class=\"share\">\n");
      out.write("					<a href=\"#\" class=\"fab fa-facebook-f\"></a> <a href=\"#\"\n");
      out.write("						class=\"fab fa-twitter\"></a> <a href=\"#\" class=\"fab fa-instagram\"></a>\n");
      out.write("					<a href=\"#\" class=\"fab fa-linkedin\"></a>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"box\">\n");
      out.write("				<h3>newsletter</h3>\n");
      out.write("				<p>subscribe for latest updates</p>\n");
      out.write("				<form action=\"\">\n");
      out.write("					<input type=\"email\" name=\"\" placeholder=\"enter your email\" id=\"\"\n");
      out.write("						class=\"email\"> <input type=\"submit\" value=\"subscribe\"\n");
      out.write("						class=\"btn\">\n");
      out.write("				</form>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"credit\">\n");
      out.write("			created by <span>Pixel Printer</span> || all rights reserved!\n");
      out.write("		</div>\n");
      out.write("	</section>\n");
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
