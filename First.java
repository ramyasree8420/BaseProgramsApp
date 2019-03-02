package com.regnant;

public class First {

	public static void main(String[] args) {
		int a = 10, b = 30;
		int c = a + b;
		System.out.println(c);
		int x = 14, y = 7;
		int z = x / y;
		System.out.println(z);
		int z1 = x % y;
		System.out.println(z1);
		boolean b1 = x != y;
		y++;
		x = x - 6;
		boolean b2 = x == y;
		System.out.println(b1 + " " + b2);
		boolean b3 = (x > y) && (y < x) && (4 == 4);
		if (b3) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		for (int i = 0; i < 5; i++)
			System.out.println("HI");
		for (int j = 1; j <= 10; j++)
			System.out.println("Hello");

		int m=0;
		while(m<5) {
			System.out.println("good morning");
			m++;
		}
		
		int n=0;
		do {
			System.out.println("hi");
		n++;
		}while(n<5);
		
	}

}
