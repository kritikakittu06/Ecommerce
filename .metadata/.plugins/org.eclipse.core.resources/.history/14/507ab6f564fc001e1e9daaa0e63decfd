package userRegister;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import databaseConnector.DatabaseController;
import models.UserModel;
import utilities.Utilities;

@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
    DatabaseController dbController = new DatabaseController();//creating a new object of the dbController class (servlet file)
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegister() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter(Utilities.user_name);
		String fullName = request.getParameter(Utilities.full_name);
		String email = request.getParameter(Utilities.email);
		String password = request.getParameter(Utilities.password);
		String phoneNumber = request.getParameter(Utilities.phone_number);
		
		UserModel userModel = new UserModel(fullName, email, userName,password, phoneNumber);
		
		int result = dbController.addNewCustomer(userModel);
		
		System.out.println(result);
		
		if (result == 1) {
		    request.setAttribute(Utilities.SUCCESS_MESSAGE, Utilities.SUCCESSFULLY_REGISTERED_MESSAGE);
		    response.sendRedirect(request.getContextPath() + Utilities.LOGIN_PAGE);
		} 
		else if (result == 0) {
		    request.setAttribute(Utilities.ERROR_MESSAGE, Utilities.INCORRECT_FORM_DATA_MESSAGE);
		    request.getRequestDispatcher(Utilities.REGISTER_PAGE).forward(request, response);
		} 
		else {
		    request.setAttribute(Utilities.ERROR_MESSAGE, Utilities.SERVER_ERROR_MESSAGE);
		    request.getRequestDispatcher(Utilities.REGISTER_PAGE).forward(request, response);
		}
	}
}
