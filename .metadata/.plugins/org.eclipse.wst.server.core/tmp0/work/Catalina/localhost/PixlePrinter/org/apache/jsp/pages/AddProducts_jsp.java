/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-04-23 03:56:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import models.BrandModel;

public final class AddProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("models.BrandModel");
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("<title>Add Product</title>\n");
      out.write("<style>\n");
      out.write(":root {\n");
      out.write("	--color-primary: cornflowerblue; /* #7380ec */\n");
      out.write("	--color-danger: coral; /* #ff7782 */\n");
      out.write("	--color-success: mediumspringgreen; /* #41f1b6 */\n");
      out.write("	--color-warning: sandybrown; /* #ffbb55 */\n");
      out.write("	--color-white: white; /* #fff */\n");
      out.write("	--color-info-dark: cadetblue; /* #7d8da1 */\n");
      out.write("	--color-info-light: lavender; /* #dce1eb */\n");
      out.write("	--color-dark: midnightblue; /* #363949 */\n");
      out.write("	--color-light: rgba(132, 139, 200, 0.18); /* rgba(132,139,200,0.18) */\n");
      out.write("	--color-primary-variant: midnightblue; /* #111e88 */\n");
      out.write("	--color-dark-variant: slategray; /* #677483 */\n");
      out.write("	--color-background: gainsboro; /* #f6f6f9 */\n");
      out.write("	--card-border-radius: 32px; /* 2rem = 2 * 16px */\n");
      out.write("	--border-radius-1: 6.4px; /* 0.4rem = 0.4 * 16px */\n");
      out.write("	--border-radius-2: 19.2px; /* 1.2rem = 1.2 * 16px */\n");
      out.write("	--card-padding: 28.8px; /* 1.8rem = 1.8 * 16px */\n");
      out.write("	--padding-1: 19.2px; /* 1.2rem = 1.2 * 16px */\n");
      out.write("	--box-shadow: 0 32px 48px var(--color-light);\n");
      out.write("	/* 2rem = 2 * 16px, 3rem = 3 * 16px */\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("	background-color: var(--color-background);\n");
      out.write("	color: var(--color-dark);\n");
      out.write("	font-family: Arial, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container {\n");
      out.write("	max-width: 600px;\n");
      out.write("	margin: 0 auto;\n");
      out.write("	padding: var(--padding-1);\n");
      out.write("	background-color: var(--color-white);\n");
      out.write("	border-radius: var(--card-border-radius);\n");
      out.write("	box-shadow: var(--box-shadow);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group {\n");
      out.write("	margin-bottom: var(--padding-1);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group label {\n");
      out.write("	display: block;\n");
      out.write("	margin-bottom: var(--padding-1);\n");
      out.write("	color: var(--color-dark);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group input, .form-group textarea, .form-group select {\n");
      out.write("	width: 100%;\n");
      out.write("	padding: var(--padding-1);\n");
      out.write("	border: 1px solid var(--color-info-dark);\n");
      out.write("	border-radius: var(--border-radius-1);\n");
      out.write("	box-sizing: border-box; /* Include padding in width calculation */\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-group button {\n");
      out.write("	padding: var(--padding-1);\n");
      out.write("	border: none;\n");
      out.write("	border-radius: var(--border-radius-1);\n");
      out.write("	background-color: var(--color-primary);\n");
      out.write("	color: var(--color-white);\n");
      out.write("	cursor: pointer;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<div class=\"container\">\n");
      out.write("	<div class=\"form-messages\">\n");
      out.write("    ");
 if (request.getAttribute("successMessage") != null) { 
      out.write("\n");
      out.write("        <div class=\"success-message\">");
      out.print( request.getAttribute("successMessage") );
      out.write("</div>\n");
      out.write("    ");
 } else if (request.getAttribute("errorMessage") != null) { 
      out.write("\n");
      out.write("        <div class=\"error-message\">");
      out.print( request.getAttribute("errorMessage") );
      out.write("</div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("	</div>\n");
      out.write("		<h2>Add Product</h2>\n");
      out.write("		<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/AddProductServlet\"\n");
      out.write("			method=\"POST\" enctype=\"multipart/form-data\">\n");
      out.write("			<div class=\"form-group\">\n");
      out.write("				<label for=\"productName\">Product Name</label> <input type=\"text\"\n");
      out.write("					id=\"productName\" name=\"productName\" required>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"form-group\">\n");
      out.write("				<label for=\"productDescription\">Product Description</label>\n");
      out.write("				<textarea id=\"productDescription\" name=\"productDescription\" rows=\"4\"\n");
      out.write("					required></textarea>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"form-group\">\n");
      out.write("				<label for=\"productPrice\">Price</label> <input type=\"text\"\n");
      out.write("					id=\"productPrice\" name=\"productPrice\" required>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"form-group\">\n");
      out.write("				<label for=\"productQuantity\">Quantity</label> <input type=\"number\"\n");
      out.write("					id=\"productQuantity\" name=\"productQuantity\" required>\n");
      out.write("			</div>\n");
      out.write("			<div class=\"form-group\">\n");
      out.write("				<label for=\"productImage\">Product Image</label> <input type=\"file\"\n");
      out.write("					id=\"productImage\" name=\"productImage\" accept=\"image/*\" required>\n");
      out.write("			</div>\n");
      out.write("	<div class=\"form-group\">\n");
      out.write("    	<label for=\"brandName\">Brand</label>\n");
      out.write("    	<select id=\"brandName\" name=\"brandName\" required>\n");
      out.write("        	<option value=\"\" selected disabled>Select Brand</option>\n");
      out.write("	        ");
 if (request.getAttribute("brands") != null) {
    	        List<BrandModel> brands = (List<BrandModel>) request.getAttribute("brands");
        	    for (BrandModel brand : brands) { 
      out.write("\n");
      out.write("            	    <option value=\"");
      out.print( brand.getCompanyName() );
      out.write('"');
      out.write('>');
      out.print( brand.getCompanyName() );
      out.write("</option>\n");
      out.write("	        ");
  }
    	    } 
      out.write("\n");
      out.write("    	</select>\n");
      out.write("	</div>\n");
      out.write("			<button type=\"submit\">Add Product</button>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
