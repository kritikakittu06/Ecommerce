package controller.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import models.UserModel;
import utilities.Utilities;

@WebServlet("/UserRegister")
@MultipartConfig(fileSizeThreshold=1024 * 1024 * 5,//upto 5mb file size will be saved in the database and system
maxFileSize = 1024*1024*10,//10mb 
maxRequestSize = 1024*1024*50 //incomming request size containing all information  must be equals to or less than 50
		)
public class CustomerRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    controller.servlets.DatabaseController dbController = new controller.servlets.DatabaseController();//creating a new object of the dbController class (servlet file)
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter(Utilities.user_name);
		String fullName = request.getParameter(Utilities.full_name);
		String email = request.getParameter(Utilities.email);
		String password = request.getParameter(Utilities.password);
		String phoneNumber = request.getParameter(Utilities.phone_number);
		Part imagePart = request.getPart("image");
		UserModel userModel = new UserModel(fullName, email, userName,password, phoneNumber, imagePart);
		
		String savePath = Utilities.Profile_Picture_Store_Dir;
		String fileName = userModel.getProfilePicture();
		try {
		    if (fileName != null && !fileName.isEmpty()) {
		        imagePart.write(savePath + fileName);
		    }
		} catch (IOException ex) {
		    ex.printStackTrace();
		    // Handle the exception appropriately (e.g., log it, return an error message, etc.)
		}
		int result = dbController.addNewCustomer(userModel);
		
		System.out.println("customer registration result is: "+result);
		
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
