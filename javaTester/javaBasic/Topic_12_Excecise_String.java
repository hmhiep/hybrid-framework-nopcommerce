package javaBasic;

import org.testng.annotations.Test;

public class Topic_12_Excecise_String {
	String courseName = "Automation Testing Selenium Java Tutorials Online 2021";
	
	@Test
	public void TC_01() {
		char courseNameArr[] = courseName.toCharArray();
		int countUpper = 0;
		int countLower = 0;
		int countNumber = 0;
		
		for (char character : courseNameArr) {
			// Uppercase
			if (character <= 'Z' && character >= 'A') {
				countUpper++;
			}
			
			// Lowercase
			if (character <= 'z' && character >= 'a') {
				countLower++;
			}
			
			// Number
			if (character <= '9' && character >= '0') {
				countNumber++;
			}
		}
		
		System.out.println("Sum of Uppercase = " + countUpper);
		System.out.println("Sum of Lowercase = " + countLower);
		System.out.println("Sum of Number = " + countNumber);
	}
	
	@Test
	public void TC_02() {
		char courseNameArr[] = courseName.toCharArray();
		int count = 0;
		
		for (char character : courseNameArr) {
			if (character == 'a') {
				count++;
			}
		}
		System.out.println("Sum of character 'a' = " + count);
		System.out.println("Contains 'Testing' = " + courseName.contains("Testing"));
		System.out.println("Start with 'Automation' = " + courseName.startsWith("Automation"));
		System.out.println("End with 'Online' = " + courseName.endsWith("Online"));
		System.out.println("Index of 'Tutorials' = " + courseName.indexOf("Tutorials"));
		
		String replaceCourseName = courseName.replace("Online", "Offline");
		System.out.println("Replace 'Online' by 'Offline' = " + replaceCourseName);
	}
	
	@Test
	public void TC_03() {
		char courseNameArr[] = courseName.toCharArray();
		
		for (int i = courseNameArr.length - 1; i >= 0; i--) {
			System.out.print(courseNameArr[i]);
		}
	}
}
