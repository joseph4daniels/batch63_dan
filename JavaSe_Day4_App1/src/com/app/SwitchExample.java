package com.app;

public class SwitchExample {

	public static void main(String[] args) {
		int a=0;
		switch(a)// jumping statement
		{
		case 0: System.out.println("zero"); break;
		case 1: System.out.println("one"); break;
		case 2: System.out.println("two"); break;
		case 3: System.out.println("three"); break;
		case 10: System.out.println("TEN"); break;
		default: System.out.println("No matching case");
		}
	}

}
