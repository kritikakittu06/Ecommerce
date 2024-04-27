package controller.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import models.BrandModel;
import models.ProductModel;
import utilities.Utilities;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 5, // upto 5mb file size will be saved in the database and system
		maxFileSize = 1024 * 1024 * 10, // 10mb
		maxRequestSize = 1024 * 1024 * 50) // incomming request size containing all information must be equals to or
											// less than 50
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	controller.servlets.DatabaseController dbController = new controller.servlets.DatabaseController();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DatabaseController dbController = new DatabaseController();
		List<BrandModel> brands = dbController.getBrandsFromDatabase(); 																	// from the database

		for (BrandModel bs : brands) {
			System.out.println(bs.getCompanyName());
		}
		request.setAttribute("brands", brands);
		request.getRequestDispatcher("/pages/AddProducts.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String productName = request.getParameter(Utilities.product_name);
		String productDesc = request.getParameter(Utilities.product_descrption);
		double price = Double.parseDouble(request.getParameter(Utilities.product_price));
		int quantity = Integer.parseInt(request.getParameter(Utilities.product_quantity));
		String companyName = request.getParameter("brandName");
		Part productImage = request.getPart(Utilities.product_image);
		String printTechnology = request.getParameter(Utilities.print_technology);
		String printSpeed = request.getParameter(Utilities.print_speed);
		String printResulotion = request.getParameter(Utilities.print_resolution);
		String weight = request.getParameter(Utilities.printer_weight);
		String dimensions = request.getParameter(Utilities.printer_dimensions);
		String operatingSystem = request.getParameter(Utilities.operating_system);
		String supportedPageSize = request.getParameter(Utilities.supported_page_size);
		String color = request.getParameter(Utilities.printer_color);
		String printColor = request.getParameter(Utilities.print_color);
//		System.out.println("Brand Nice "+ companyName);
		ProductModel productModel = new ProductModel(productName, productDesc, price, quantity, companyName, productImage,
				printTechnology, printSpeed, printResulotion, weight, dimensions, operatingSystem, supportedPageSize, color, printColor);

		String savePath = Utilities.Product_Picture_Store_Dir;
		String fileName = productModel.getProductImage();

		try {
			if (fileName != null && !fileName.isEmpty()) {
				productImage.write(savePath + fileName);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
			// Handle the exception appropriately (e.g., log it, return an error message,
			// etc.)
		}
		int result = dbController.addProducts(productModel);
		System.out.println("add product result : " + result);
		
		if (result == 1) {
		    request.setAttribute(Utilities.SUCCESS_MESSAGE, Utilities.PRODUCT_SUCCESSFULLU_ADD_MESSAGE);
		    request.getRequestDispatcher(Utilities.ADD_PRODUCT_PAGE).forward(request, response);
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
