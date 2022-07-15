package com.iu.himart;

public class Computer extends Product{
	
	private String cpu;
	
	public Computer() {
		this.cpu = "M2";
		this.setBrand("MacMini");
		this.setPrice(20000000);
		this.setPoint(100);
	}
	
	public void info() {
		super.info();
		System.out.println(this.getCpu());
	}
	
	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
}
