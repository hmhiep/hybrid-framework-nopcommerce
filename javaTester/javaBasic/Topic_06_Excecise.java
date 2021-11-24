package javaBasic;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Topic_06_Excecise {
	Scanner scanner = new Scanner(System.in);
	
	@Test
	public void TC_01_() {
		int number = scanner.nextInt();
		
		if (number % 2 == 0) {
			System.out.println("Số " + number + " là số chẵn.");
		} else {
			System.out.println("Số " + number + " là số lẻ.");
		}
	}
	
	@Test
	public void TC_02() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		
		if (numberA > numberB) {
			System.out.println(numberA + " lớn hơn " + numberB);
		} else if (numberA == numberB) {
			System.out.println(numberA + " bằng " + numberB);
		} else {
			System.out.println(numberA + " nhỏ hơn " + numberB);
		}
	}
	
	@Test
	public void TC_03() {
		String name01 = scanner.nextLine();
		String name02 = scanner.nextLine();
		
		if (name01.equals(name02)) {
			System.out.println("Hai người cùng tên.");
		} else {
			System.out.println("Hai người khác tên.");
		}
	}
	
	@Test
	public void TC_04() {
		int numberA = scanner.nextInt();
		int numberB = scanner.nextInt();
		int numberC = scanner.nextInt();
		
		if (numberA > numberB && numberA > numberC) {
			System.out.println(numberA + " là số lớn nhất.");
		} else if (numberB > numberC) {
			System.out.println(numberB + " là số lớn nhất.");
		} else {
			System.out.println(numberC + " là số lớn nhất.");
		}
	}
	
	@Test
	public void TC_05() {
		int numberA = scanner.nextInt();
		
		if (10 < numberA && numberA < 100) {
			System.out.println(numberA + " nằm trong khoảng (10 - 100).");
		} else
			System.out.println(numberA + " nằm ngoài khoảng (10 - 100).");
	}
	
	@Test
	public void TC_06() {
		float studentPoint = scanner.nextFloat();
		
		if (studentPoint <= 10 && studentPoint >= 8.5) {
			System.out.println("Hệ số A.");
		} else if (studentPoint < 8.5 && studentPoint >= 7.5) {
			System.out.println("Hệ số B.");
		} else if (studentPoint < 7.5 && studentPoint >= 5) {
			System.out.println("Hệ số C.");
		} else if (studentPoint < 5 && studentPoint >= 0) {
			System.out.println("Hệ số D.");
		} else {
			System.out.println("Vui lòng nhập số điểm hợp lệ.");
		}
	}
	
	@Test
	public void TC_07() {
		int month = scanner.nextInt();
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println("Tháng này có 31 ngày");
		} else if (month == 2) {
			System.out.println("Tháng này có 28 ngày");
		} else {
			System.out.println("Tháng này có 30 ngày");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
