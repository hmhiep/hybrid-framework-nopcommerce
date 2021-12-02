package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_08_Excecise_For_Foreach {
	Scanner scanner = new Scanner(System.in);
	
	@Test
	public void TC_01_() {
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1);
			if (i < n) {
				System.out.print(" ");
			}
		}		
	}
	
	@Test
	public void TC_02_() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		for (int i = a; i <= b; i++) {
			System.out.print(i);
			if (i < b) {
				System.out.print(" ");
			}
		}		
	}
	
	@Test
	public void TC_03_() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if ((i % 2) == 0) {
				sum += i;
			}
		}	
		System.out.print(sum);
	}
	
	@Test
	public void TC_04_() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = 0;
		
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.print(sum);
	}
	
	@Test
	public void TC_05_() {
		int n = scanner.nextInt();
		int sum = 0;
		
		for (int i = 0; i <= n; i++) {
			if ((i % 2) != 0) {
				sum += i;
			}
		}
		System.out.print(sum);	
	}
	
	@Test
	public void TC_06_() {
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		for (int i = a; i <= b; i++) {
			if ((i % 3) == 0) {
				System.out.print(i + " ");
			}
		}		
	}
	
	@Test
	public void TC_07_() {
		int n = scanner.nextInt();
		int total = 1;
		
		for (int i = 1; i <= n; i++) {
			total *= i;
		}
		System.out.print(total);
	}		
}
