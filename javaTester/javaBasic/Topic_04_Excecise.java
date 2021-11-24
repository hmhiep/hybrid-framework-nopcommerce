package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_04_Excecise {
	Scanner scanner = new Scanner(System.in);
	
	@Test
	public void TC_01_After_15_Years() {
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		
		System.out.println("After 15 years, age of " + name + " will be " + (age + 15));
	}
	
	@Test
	public void TC_02_swapNumder() {
		int a = 5;
		int b = 6;
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void TC_03() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		if (a >= b) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
	
}
