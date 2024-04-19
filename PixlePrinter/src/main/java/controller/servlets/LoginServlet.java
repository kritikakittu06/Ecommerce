package controller.servlets;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import utilities.Utilities;

@WebServlet("/UserLogin")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    controller.DatabaseController dbController = new controller.DatabaseController();

    public LoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Your existing code for handling GET requests
    	response.sendRedirect(request.getContextPath() + Utilities.HOME_PAGE);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Handle POST requests here
        String username = request.getParameter(Utilities.user_name);
        String password = request.getParameter(Utilities.password);

        int loginResult = dbController.getUserLoginInformation(username, password);
        
        System.out.println("Login result is :"+loginResult);

        if (loginResult == 1) {
            request.getSession().setAttribute("username", username);
            response.sendRedirect(request.getContextPath() + Utilities.HOME_PAGE);
        } 
        else if (loginResult == 5) {
            request.getSession().setAttribute("username", username);
            response.sendRedirect(request.getContextPath() + Utilities.ADMIN_HOME_PAGE);
        } 
        else if (loginResult == 0) {
            request.setAttribute(Utilities.ERROR_MESSAGE, Utilities.INCORRECT_LOGIN_CREDENTIAL_ERROR);
            System.out.println("Username or Password Incorrect");
            request.getRequestDispatcher(Utilities.LOGIN_PAGE).forward(request, response);
        } 
        else {
            request.setAttribute(Utilities.ERROR_MESSAGE, Utilities.SERVER_ERROR_MESSAGE);
            request.getRequestDispatcher(Utilities.LOGIN_PAGE).forward(request, response);
        }
    }
}