/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-04-22 06:14:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Product Management</title>\r\n");
      out.write("  <style>\r\n");
      out.write("    :root {\r\n");
      out.write("      --color-primary: cornflowerblue; /* #7380ec */\r\n");
      out.write("      --color-danger: coral; /* #ff7782 */\r\n");
      out.write("      --color-dark: midnightblue; /* #363949 */\r\n");
      out.write("      --color-background: gainsboro; /* #f6f6f9 */\r\n");
      out.write("      --color-white: white; /* #fff */\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    body {\r\n");
      out.write("      background-color: var(--color-background);\r\n");
      out.write("      color: var(--color-dark);\r\n");
      out.write("      font-family: Arial, sans-serif;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .container {\r\n");
      out.write("      max-width: 800px;\r\n");
      out.write("      margin: 20px auto;\r\n");
      out.write("      padding: 20px;\r\n");
      out.write("      background-color: var(--color-white);\r\n");
      out.write("      border-radius: 8px;\r\n");
      out.write("      box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    table {\r\n");
      out.write("      width: 100%;\r\n");
      out.write("      border-collapse: collapse;\r\n");
      out.write("      margin-bottom: 20px;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    th, td {\r\n");
      out.write("      padding: 10px;\r\n");
      out.write("      border-bottom: 1px solid var(--color-background);\r\n");
      out.write("      vertical-align: middle;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    th {\r\n");
      out.write("      background-color: var(--color-primary);\r\n");
      out.write("      color: var(--color-white);\r\n");
      out.write("      text-align: left;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    td {\r\n");
      out.write("      text-align: left;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn-edit,\r\n");
      out.write("    .btn-delete {\r\n");
      out.write("      padding: 6px 12px;\r\n");
      out.write("      border: none;\r\n");
      out.write("      border-radius: 4px;\r\n");
      out.write("      cursor: pointer;\r\n");
      out.write("      display: inline-block;\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn-edit {\r\n");
      out.write("      background-color: var(--color-primary);\r\n");
      out.write("      color: var(--color-white);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    .btn-delete {\r\n");
      out.write("      background-color: var(--color-danger);\r\n");
      out.write("      color: var(--color-white);\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("    td,img{\r\n");
      out.write("        height: 100px;\r\n");
      out.write("    }\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <h2>Product Management</h2>\r\n");
      out.write("    <table>\r\n");
      out.write("      <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <th>ID</th>\r\n");
      out.write("          <th>Photo</th>\r\n");
      out.write("          <th>Name</th>\r\n");
      out.write("          <th>Description</th>\r\n");
      out.write("          <th>Price</th>\r\n");
      out.write("          <th>Actions</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("      </thead>\r\n");
      out.write("      <tbody>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>1</td>\r\n");
      out.write("          <td><img src=\"https://www.iec.com.np/uploads/thumbnails/147eea35e9314cca929e45ac8d0aec6b_CISS_CM_AS_FR_cl-362x320.png\" alt=\"Product 1\"></td>\r\n");
      out.write("          <td>Product 1</td>\r\n");
      out.write("          <td>Description 1</td>\r\n");
      out.write("          <td>$19.99</td>\r\n");
      out.write("          <td>\r\n");
      out.write("            <button class=\"btn-edit\">Edit</button>\r\n");
      out.write("            <button class=\"btn-delete\">Delete</button>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("          <td>2</td>\r\n");
      out.write("          <td><img src=\"data:image/jpeg;base64,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\" alt=\"Product 2\"></td>\r\n");
      out.write("          <td>Product 2</td>\r\n");
      out.write("          <td>Description 2</td>\r\n");
      out.write("          <td>$29.99</td>\r\n");
      out.write("          <td>\r\n");
      out.write("            <button class=\"btn-edit\">Edit</button>\r\n");
      out.write("            <button class=\"btn-delete\">Delete</button>\r\n");
      out.write("          </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <!-- Add more rows as needed -->\r\n");
      out.write("      </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("  </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
