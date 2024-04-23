package utilities;
/**
	 * @author aayush wanem limbu
	 */
	
	public class Utilities {
		
		//loginquery for normal user
		public static final String Get_Login_User_Information = "SELECT * FROM User WHERE USERNAME = ?;";
		
		//query for user registration
		public static final String Customer_Registration = "INSERT INTO User (fullName, email, userName, phoneNumber, password, profilePicture) "
		        + "VALUES (?,?,?,?,?,?)";
		//query for admin registration 
		public static final String Add_Admin = "INSERT INTO User (fullName, email, userName, accountType, phoneNumber, password, profilePicture)"
		           + " VALUES (?,?,?,?,?,?,?)";
		//query for storing the contact us message to the database
		public static final String Store_Contact_Us_Page_Message = "INSERT INTO ContactUsFormMessage (Name, ContactNumber, Email, Message)"
				+ "VALUES (?, ?, ?, ?)";
		//query to read the stored message from the database
		public static final String Read_Contact_Us_Message = "SELECT * FROM ContactUsFormMessage";
		//query to count the messages in the database
		public static final String Count_Total_Contact_Us_Messages = "SELECT COUNT(*) FROM ContactUsFormMessage;";
		//query to add brand to the database
		public static final String Add_Brands = "INSERT INTO Brand (CompanyName) VALUES(?) ";
		//query to get all the brands from the database;
		public static final String Show_Brands = "select * from Brand";
		//query to insert products into the product table
		public static final String Add_Products = "INSERT INTO Product(productName, productDesc, price, quantity, companyName, productImage)"
				+ "VALUES (?,?,?,?,?,?)";
		//quert to see all of the products
		public static final String  See_All_Products = "SELECT * FROM Product";
		
		//defining a set of constant values
		public static final String name = "name";
		public static final String user_name = "user_name";
		public static final String full_name = "full_name";
		public static final String email = "email";
		public static final String password = "password";
		public static final String phone_number = "phone_Num";
		public static final String message = "message";
		public static final String account_type = "account_type";
		public static final String company_name = "company_name";
		public static final String product_name = "productName";
		public static final String product_descrption = "productDescription";
		public static final String product_price = "productPrice";
		public static final String product_quantity = "productQuantity";
		public static final String brand_name = "brandName";
		public static final String product_image = "productImage";
		//end constants
		
		//start of the page names
		public static final String Home_Page_Title = "Pixle Print";
		public static final String Login_Page_Title = "Login Page";
		public static final String Registration_Page_Title = "Welcome User";
		//end of page names
		
		//profile picture store path
		public static final String Profile_Picture_Store_Dir = "/home/happy-kitty/eclipse-workspace/PixlePrinter/src/main/webapp/Uploads/ProfilePicture/";
		//product image store path
		public static final String Product_Picture_Store_Dir = "/home/happy-kitty/eclipse-workspace/PixlePrinter/src/main/webapp/Uploads/ProductImages/";
		
		
		//Start of constant string messages
		public static final String SUCCESSFULLY_REGISTERED_MESSAGE = "The User Was Successfully Registered!";
		public static final String INCORRECT_FORM_DATA_MESSAGE = "Please Check and Enter The Correct Form Data.";
		public static final String SERVER_ERROR_MESSAGE = "An unexpected server error occurred.";
		public static final String SUCCESS_MESSAGE = "successMessage";
		public static final String ERROR_MESSAGE = "errorMessage";
		public static final String INCORRECT_LOGIN_CREDENTIAL_ERROR = "Username or Password Incorrect";
		public static final String Successfully_Stored_Message = "Dear user your message has been successfully stored, please wait for an response";
		public static final String SUCCESSFULLY_ADD_BRAND_MESSAGE = "Brand Added Successfully";
		public static final String PRODUCT_SUCCESSFULLU_ADD_MESSAGE = "The product was added successfully";
		// End string messages 
		
		// Start JSP Route
		public static final String LOGIN_PAGE = "/pages/Login.jsp";
		public static final String REGISTER_PAGE = "/pages/Register.jsp";
		public static final String HOME_PAGE = "/pages/Index.jsp";
		public static final String ADMIN_HOME_PAGE = "/pages/Admin.jsp";
		public static final String CONTACT_US_PAGE = "/pages/Contact.jsp";
		public static final String ADD_BRAND = "/pages/AddBrand.jsp";
		public static final String ADD_PRODUCT_PAGE = "/pages/AddProducts.jsp";
		// End JSP Route
		
		// Start Servlet Route
		public static final String REGISTER_SERVLET = "/RegisterServlet";
		public static final String LOGIN_SERVLET = "/UserLogin";
		// End Servlet Route
	}
