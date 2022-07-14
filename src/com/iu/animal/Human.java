package com.iu.animal;

public class Human {
	
	
	private int age;

	public int getAge() {
		return this.age;
	}
	
	//기본값 0 0~150사이면 걍, 그이상:0으로
	public void setAge(int age) {
		this.age=0;
		if(age>=0&&age<150) {
			this.age=age;
		}
//		if(age>=0&&age<150) {
//			this.age = age;
//		} else {
//			this.age = 0;
//		}
		
	}
	
	public void info() {
		System.out.println(this.age);
	}
	
	
	public void myPet() {
		Cat cat = new Cat();
		//cat.age=10;
		cat.sound();
	}
}
