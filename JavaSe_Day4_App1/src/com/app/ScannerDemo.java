package com.app;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner c =  new Scanner(System.in);
		System.out.println("enter x and y values");
		int x = c.nextInt();
		int y = c.nextInt();
		int z = x+y;
		System.out.println("z value is" + z);
		
	}

}
