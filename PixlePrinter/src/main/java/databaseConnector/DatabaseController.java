//this will be used to connect to the mysql database
package databaseConnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mindrot.bcrypt.BCrypt;

import models.AdminModel;
import models.ContactUsMessageModel;
import models.UserModel;
import utilities.Utilities;


public class DatabaseController {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/PixlePrint";//ailey lai temporary db name
        String user = "root";
        String pass = "12345"; //change it to the one u are using in ur xampp
        return DriverManager.getConnection(url, user, pass);
    }
	//login method start from here
	public int getUserLoginInformation(String username, String password) {
	    try (Connection con = getConnection()) {
	        PreparedStatement statement = con.prepareStatement(Utilities.Get_Login_User_Information);
	        statement.setString(1, username);
	        ResultSet result = statement.executeQuery();
	        if (result.next()) {
	            String hashedPasswordFromDb = result.getString("password");
	            System.out.println("Hashed Password"+hashedPasswordFromDb);
	            if (BCrypt.checkpw(password, hashedPasswordFromDb)) {
	                String userAccountType = result.getString("accountType");
	                if ("User".equals(userAccountType)) {
	                    return 1;
	                } else if ("Admin".equals(userAccountType)) {
	                    return 5;
	                }
	            }
	        }
	        return 0; // Username or password is incorrect
	    } catch (SQLException | ClassNotFoundException ex) {
	        ex.printStackTrace();
	        return -1; // Server error or exception
	    }
	}//end of login method
	
	public int addNewCustomer(UserModel userModel) {
	    try (Connection con = getConnection()) {
	        PreparedStatement statement = con.prepareStatement(Utilities.Customer_Registration);
	        statement.setString(1, userModel.getFullName());
	        statement.setString(2, userModel.getEmail());
	        statement.setString(3, userModel.getUserName());
	        statement.setString(4, userModel.getPhoneNumber());
	        String hashedPassword = BCrypt.hashpw(userModel.getPassword(), BCrypt.gensalt());
	        statement.setString(5, hashedPassword);

	        int result = statement.executeUpdate();
	        return result > 0 ? 1 : 0;
	    } catch (SQLException | ClassNotFoundException ex) {
	        ex.printStackTrace(); // Log the exception for debugging
	        return -1;
	    }
	}
	
	public int storeContactUsMessages(ContactUsMessageModel contactUsMessageModel) {
		try(Connection con = getConnection()) {
			PreparedStatement statement = con.prepareStatement(Utilities.Store_Contact_Us_Page_Message);
			statement.setString(1, contactUsMessageModel.getName());
			statement.setString(2, contactUsMessageModel.getContactNumber());
			statement.setString(3, contactUsMessageModel.getEmail());
			statement.setString(4, contactUsMessageModel.getMessage());
			
			int result = statement.executeUpdate();
			return result > 0 ? 1 : 0;
		}
		 catch (SQLException | ClassNotFoundException ex) {
		        ex.printStackTrace(); // Log the exception for debugging
		        return -1;
		    }
	}
	
	public int registerNewAdmin(AdminModel adminModel) {
		try(Connection conn = getConnection()){
			PreparedStatement statement = conn.prepareStatement(Utilities.Add_Admin);
			statement.setString(1, adminModel.getFullName());
			statement.setString(2, adminModel.getEmail());
			statement.setString(3, adminModel.getUserName());
			statement.setString(4, adminModel.getAccountType());
			statement.setString(5, adminModel.getPhoneNumber());
			String hashedPassword = BCrypt.hashpw(adminModel.getPassword(), BCrypt.gensalt());
	        statement.setString(6, hashedPassword);
	        
			int result = statement.executeUpdate();
			return result > 0 ? 1 : 0;
		}
		catch (SQLException | ClassNotFoundException ex) {
	        ex.printStackTrace(); // Log the exception for debugging
	        return -1;
	    }
	}
}