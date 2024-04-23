package models;

import java.io.File;

import javax.servlet.http.Part;

import utilities.Utilities;

public class ProductModel{
	private String productName;
	private String productDescription;
	private double price;
	private int quantity;
	private String companyName;
	private String productImage;
	
	private String getProductPicUrl(Part part) {//part is an imterface not a class
		String imageSavePath = Utilities.Product_Picture_Store_Dir;
		File imageSaveDir = new File(imageSavePath);
		String profilePicUrlFromPath = null;
		if(!imageSaveDir.exists()) {
			imageSaveDir.mkdir();
		}
		String contentDisp = part.getHeader("content-disposition");
		String []items = contentDisp.split(";");
		for(String s : items) {
			if(s.trim().startsWith("filename")) {
				profilePicUrlFromPath = s.substring(s.indexOf("=") + 2, s.length() -1);
			}
		}	
		if(profilePicUrlFromPath == null || profilePicUrlFromPath.isEmpty()) {
			profilePicUrlFromPath = "default.png";
		}
		return profilePicUrlFromPath;
	}
	
	public ProductModel(String productName, String productDescription, double price, int quantity, String companyName,
			Part imagePart) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.price = price;
		this.quantity = quantity;
		this.companyName = companyName;
		this.productImage = getProductPicUrl(imagePart);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(Part part) {
		this.productImage = getProductPicUrl(part);
	}
	
	
}