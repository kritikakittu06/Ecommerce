//package controller.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//
//@WebFilter("/*")
//public class AuthenticationFilter implements Filter {
//
//    @Override
//    public void destroy() {
//        // TODO Auto-generated method stub
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//            throws IOException, ServletException {
//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletResponse res = (HttpServletResponse) response;
//
//        String uri = req.getRequestURI();
//
//        boolean isRegisterServlet = uri.endsWith("UserRegister");
//        boolean isLogin = uri.endsWith("Login.jsp");
//        boolean isLoginServlet = uri.endsWith("LoginServlet");
//        boolean isLogoutServlet = uri.endsWith("LogoutServlet");
//        boolean isAdminPage = uri.endsWith("Admin.jsp");
//        boolean isIndexPage = uri.endsWith("Index.jsp");
//
//        HttpSession session = req.getSession(false);
//        boolean isLoggedIn = session != null && session.getAttribute("username") != null;
//
//        if (uri.endsWith(".css") || uri.endsWith(".js") || uri.endsWith(".jpg") || uri.endsWith(".png") || uri.endsWith(".jpeg")) {
//            chain.doFilter(request, response);
//            return;
//        }
//
//        if (uri.endsWith("Register.jsp") || isIndexPage) {
//            chain.doFilter(req, res);
//            return;
//        }
//
//        if (!isLoggedIn && isRegisterServlet) {
//            chain.doFilter(req, res);
//            return;
//        }
//
//        if (!isLoggedIn && !(isLogin || isLoginServlet)) {
//            res.sendRedirect(req.getContextPath() + "/pages/Login.jsp");
//            return;
//        }
//
//        if (isAdminPage && !isLoggedIn) {
//            res.sendRedirect(req.getContextPath() + "/pages/Login.jsp");
//            return;
//        }
//
//        chain.doFilter(request, response);
//    }
//
//    @Override
//    public void init(FilterConfig arg0) throws ServletException {
//        // TODO Auto-generated method stub
//    }
//
//}
