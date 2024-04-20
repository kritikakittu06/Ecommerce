package controller.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.BrandModel;
import utilities.Utilities;

/**
 * Servlet implementation class AddBrand
 */
@WebServlet("/AddBrand")
public class AddBrandServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	controller.servlets.DatabaseController dbController = new controller.servlets.DatabaseController();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBrandServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Call the getBrands method to fetch the brands from the database
        List<BrandModel> brands = dbController.getBrands();
        request.setAttribute("brands", brands);
        request.getRequestDispatcher(Utilities.ADD_BRAND).forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String companyName = request.getParameter(Utilities.company_name);
		BrandModel brandModel = new BrandModel(companyName);
		int result = dbController.addNewBrands(brandModel);
		System.out.println("Add brand result is : "+result);
		if (result == 1) {
		    request.setAttribute(Utilities.SUCCESS_MESSAGE, Utilities.SUCCESSFULLY_ADD_BRAND_MESSAGE);
		    request.getRequestDispatcher(Utilities.ADD_BRAND).forward(request, response);
		} 
		else if (result == 0) {
		    request.setAttribute(Utilities.ERROR_MESSAGE, Utilities.INCORRECT_FORM_DATA_MESSAGE);
		    request.getRequestDispatcher(Utilities.ADD_BRAND).forward(request, response);
		} 
		else {
		    request.setAttribute(Utilities.ERROR_MESSAGE, Utilities.SERVER_ERROR_MESSAGE);
		    request.getRequestDispatcher(Utilities.ADD_BRAND).forward(request, response);
		}
	}

}
