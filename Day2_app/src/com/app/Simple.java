package com.app;

class A{
	int x = 200;
	static int y = 200;
	void show() {
		System.out.println(x + " " + y);
		x++; y++;
	}
	
}

public class Simple {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		A a1 = new A(); a1.show();
		A a2 = new A(); a2.show();
		A a3 = new A(); a3.show();
	}
}
