package javaBasic;

import org.testng.annotations.Test;

public class Topic_03_Excecise {

	@Test
	public void TC_01() {
		int a = 6;
		int b = 2;

		System.out.println("a + b = " + a + b);
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + a * b);
		System.out.println("a / b = " + a / b);

	}
	
	@Test
	public void TC_02() {
		float d = 7.5f;
		float r = 3.8f;

		System.out.println("Diện tích là " + d*r);
	}
	
	@Test
	public void TC_03() {
		String name = "Automation Testing";

		System.out.println("Hello " + name);
	}
}
