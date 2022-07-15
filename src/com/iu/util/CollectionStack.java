package com.iu.util;

import java.util.Scanner;

import com.iu.util.Collection;

public class CollectionStack implements Collection {
	
	//add - 호출하면 입력받은 새로운숫자 추가 무조건 0번인덱스에 추가
	//remove - 0번 인덱스 삭제.
	//collectionStack.add -> {4,1,2,3}

	public int [] add(int [] numbers) {
		System.out.println("숫자입력하셈");
		Scanner sc = new Scanner(System.in);
		int [] copy = new int[numbers.length+1];
		for(int i=0;i<numbers.length;i++) {
			copy[i+1] = numbers[i];
		}
		copy[0] = sc.nextInt();
		numbers = copy;
		return numbers;
	}
	
	//remove - 0번 인덱스 삭제.
	//collectionStack.remove -> {2,3}
	public int [] remove(int [] numbers) {
		int [] copy = new int[numbers.length-1];
		for(int i=0;i<numbers.length-1;i++) {
			copy[i] = numbers[i+1];
		}
		numbers = copy;
		
		
		
		
		return numbers;
	}
	
	
}
