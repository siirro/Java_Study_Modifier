package com.iu.main;

import com.iu.animal.Cat;
import com.iu.animal.Human;
import com.iu.animal.Zoo;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.sound();
		//cat.age=5;
		Human human = new Human();
		//human.age=100;
		human.setAge(50);
		human.info();
		int d = human.getAge();
		System.out.println(d);
		
		System.out.println(Zoo.title);
		Zoo.info();
		
		Zoo zoo = new Zoo();
		//zoo.price=10000;
		
	}
	
	

}
