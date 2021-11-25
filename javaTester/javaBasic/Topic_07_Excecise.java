package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_07_Excecise {
	Scanner scanner = new Scanner(System.in);
	
	@Test
	public void TC_01_() {
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		}
	}
	
	@Test
	public void TC_02() {
		int firstNumber = scanner.nextInt();
		int secondNumber = scanner.nextInt();
		String operator = scanner.next();
		
		switch (operator) {
		case "+":
			System.out.println("A + B = " + (firstNumber + secondNumber));
			break;
		case "-":
			System.out.println("A - B = " + (firstNumber - secondNumber));
			break;
		case "*":
			System.out.println("A x B = " + (firstNumber * secondNumber));
			break;
		case "/":
			System.out.println("A / B = " + (firstNumber / secondNumber));
			break;
		case "%":
			System.out.println("A % B = " + (firstNumber % secondNumber));
			break;
		}
	}
	
	@Test
	public void TC_03() {
		int month = scanner.nextInt();
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		
		case 8:
		case 10:
		case 12:
			System.out.println("Tháng " + month + " có 31 ngày.");
			break;
		case 2:
			System.out.println("Tháng " + month + " có 28 ngày.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tháng " + month + " có 30 ngày.");
			break;
		default:
			System.out.println("Vui lòng nhập số tháng trong khoảng 1 đến 12.");
			break;
		}
	}
}
