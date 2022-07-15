package com.iu.himart;

public class Phone extends Product{

	private String company;
	
	public Phone() {
		company = "Samsung";
		this.setBrand("Flip");
		this.setPrice(500000);
		this.setPoint(50);
	}
	
	
	public void info() {
		super.info();
		System.out.println(this.getCompany());
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
