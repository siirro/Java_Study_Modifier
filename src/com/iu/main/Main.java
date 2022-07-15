package com.iu.main;

import com.iu.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		CollectionStack cs = new CollectionStack();
		
		
		int [] nums = {1,2,3};
		int [] test11 = new int[nums.length+1];
		test11 = cs.add(nums);
		
		int [] test12 = new int[nums.length-1];
		test12 = cs.remove(nums);
		
		
//		//1-1잘되는지 확인용
//		for(int i=0;i<test11.length;i++) {
//		System.out.println(test11[i]);
//		}
		
//		//1-2잘되는지 확인용
		for(int i=0;i<test12.length;i++) {
		System.out.println(test12[i]);
		}
		
		
		
		//1. com.iu.util.CollectionStack 클래스 생성 
		//컬렉션 인터페이스 구현 이 클래스안에 add,remove 메서드 추상메서드로 들어감-<오버라이딩
		//add - 호출하면 입력받은 새로운숫자 추가 무조건 0번인덱스에 추가
		//remove - 0번 인덱스 삭제.
		//collectionStack.add -> {4,1,2,3}
		//collectionStack.remove -> {2,3}
	
		
		
		
		//2. com.iu.util.CollectionQue 컬렉션인터페이스받음
		//add - 새로운 숫자 무조건 0번에 추가
		//remove = 마지막 인덱스 번호 삭제
		//collectionQue.add -> {4,1,2,3}
		//collectionQue.remove -> {1,2}
		
		//3. com.iu.util.CollectionSet
		//add - 새로운 숫자 추가 마지막에 추가
		//단, 중복되지 않는 숫자만 추가 
		//remove - 삭제할 숫자를 입력받아서 일치하는 숫자를 삭제
		//collectionSet.add -> {1,2,3,4}
		//collectionSet.remove -> {입력받은게 사라짐}
	}
	
	

}
