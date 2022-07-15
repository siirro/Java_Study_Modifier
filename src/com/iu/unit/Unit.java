package com.iu.unit;

public abstract class Unit {
	//abstract이 붙은 클래스는 객체를 만들지 못한다. (추상클래스:상속전용)
	
	//클래스간의 공통 요소
	private int hp;
	private String color;
	private String name;
	
//	public Unit(int hp) {
//		System.out.println("Super 생성자");
//		this.hp=hp;
//	}
	
	//추상메서드 완성되지 않은 메서드
	public abstract void move();
	
	public void info() {
		System.out.println("Super Info");
	}
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
