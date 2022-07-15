package com.iu.himart;

public class Tv extends Product{
	
	private int size;
	
	public Tv() {
		this.size = 15;
		this.setBrand("LG");
		this.setPrice(8000000);
		this.setPoint(200);
	}
	
	
	public void info() {
		super.info();
		System.out.println(this.getSize());
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
