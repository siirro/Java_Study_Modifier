package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		
		//Iu iu = new Iu();
		
		Iu iu = Iu.getInstance();
		
		iu.setName("Iu");
		iu.setAge(30);
		
		String name = iu.getName();
		
		//Iu iu2 = new Iu();
		System.out.println(name);
		System.out.println(iu.getAge());
		System.out.println(iu);
		System.out.println("==================");
		Iu iu2 = Iu.getInstance();
		System.out.println(iu2.getName());
		System.out.println(iu2.getAge());
		System.out.println(iu2);
		
		
		
	}

}
