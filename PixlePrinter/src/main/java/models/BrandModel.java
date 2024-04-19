package models;

import java.io.Serializable;

public class BrandModel implements Serializable {
	private String CompanyName;

	public BrandModel(String companyName) {
		super();
		CompanyName = companyName;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	
	
}
