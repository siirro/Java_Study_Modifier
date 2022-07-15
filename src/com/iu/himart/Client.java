package com.iu.himart;

public class Client {
	
	private int money;
	private int point;
	
	public Client() {
		this.money=30000000;
		this.setPoint(10);
		//둘다가능
	}
	
	
	
	public void buy(int price, int point) {
		this.money = this.money-price;
		this.point = this.point+point;
		System.out.println("잔액 : "+this.money);
		System.out.println("Point : "+this.point);
	}
	
	public void buy(Product product) {
		this.money = this.money-product.getPrice();
		this.point = this.point+product.getPoint();
		System.out.println("잔액 : "+this.money);
		System.out.println("Point : "+this.point);
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
