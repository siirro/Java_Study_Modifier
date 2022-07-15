package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit {
	
	
	
	private String weapon;
	
	public Marine() {
		//super(30);
		//super(); (부모호출:생략되어있음.)
		System.out.println("Marine 생성자");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	//오버라이딩
	public void move() {
		super.info();
		System.out.println("뛰어다님");
	}
	
	//오버라이딩
	public void info() {
		System.out.println("Marine Info");
	}
	
////오버라이딩
//	public void info() {
//		//이렇게 내용이 없어도 선언 자체가 오버라이딩이다..... (말장난)
//	}
	
	public void shoot() {
		System.out.println("우다다닫");
	}
	
	
	
}
