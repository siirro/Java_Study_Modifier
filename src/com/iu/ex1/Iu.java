package com.iu.ex1;

public class Iu {
	
	private String name;
	private int age;
	
	
	//이 클래스 안에서만 공유 가능
	private static Iu iu=null;
	

	
	private Iu() {
		
	}
	
	public static Iu getInstance() {
		if(Iu.iu==null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	
	//Setter 멤버변수에 저장할것이다.
	//public void set변수명(데이터타입 변수명(매개변수:내가집어넣고싶은것)) {}
	
	//Getter 멤버변수에 있는것을 반환해주세요
	//public 리턴타입 get변수명() {}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
