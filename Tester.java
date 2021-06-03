package com.xworkz.light;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the light type");
		String type=sc.next();
	 ISwitch iswitch=	LightFactory.getLight(type);
	 //consumer logic
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 if(iswitch!=null)
	 {
		 iswitch.switchOn();
		 iswitch.switchOff();
	 }
	}

}
