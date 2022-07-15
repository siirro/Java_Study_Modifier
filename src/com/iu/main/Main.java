package com.iu.main;

import com.iu.terran.Marine;
import com.iu.terran.Scv;
import com.iu.unit.Unit;

public class Main {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Scv s1 = new Scv();
		m1.setHp(30);
		m1.move();
		m1.info();
		
		//Marine is a Unit
		//Scv is a Unit
		
		Unit unit = m1;
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
		//System.out.println(unit.getWeapon()); weapon은 unit은 몰라서 안됨
	
		m1 = (Marine)unit;
		System.out.println(m1.getWeapon());
	}
	
	

}
