package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_09_Excecise_While_Do_While {
	Scanner scanner = new Scanner(System.in);
	
	@Test
	public void TC_01_For() {
		int number = scanner.nextInt();
		
		for (int i = number; i < 100; i++) {
			if ((i % 2) == 0) {
				System.out.print(i + " ");
			}
		}		
	}
	
	@Test
	public void TC_02_While() {
		int number = scanner.nextInt();
		
		while (number < 100) {
			if ((number % 2) == 0) {
				System.out.print(number + " ");
			}
			number++;
		}		
	}
	
	@Test
	public void TC_03_Do_While() {
		int number = scanner.nextInt();
		
		do {
			if ((number % 2) == 0) {
				System.out.print(number + " ");
		}
			number++;
		} while (number < 100);
	}
	
	@Test
	public void TC_04_While() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		while (numberA < numberB) {
			if (numberA % 3 == 0 && numberA % 5 == 0) {
				System.out.print(numberA + " ");
			}
			numberA++;
		}		
	}
	
	@Test
	public void TC_05_While() {
		int n = scanner.nextInt();
		int sum = 0;
		
		while (n > 0) {
			if (n % 2 != 0) {
				sum += n;
			}
			n--;
		}		
		System.out.println(sum);
	}
	
	@Test
	public void TC_06_While() {
		int n = scanner.nextInt();
		int total = 1;
		
		while (n > 0) {
				total *= n;
				n--;
			}	
		System.out.println(total);
	}
	
	@Test
	public void TC_07_While() {
		int i = 1;
		
		while (i <= 10) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}	
	}
}
