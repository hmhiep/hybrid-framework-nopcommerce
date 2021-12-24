package com.nopcommerce.user;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import commons.BasePage;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

public class Level_03_Page_Object_02 extends BasePage{
	private WebDriver driver;
	private String firstName, lastName, invalidEmail, notFoundEmail, existingEmail, validPassword, incorrectPassword;
	private HomePageObject homePage;
	private RegisterPageObject registerPage;
	private LoginPageObject loginPage;
	private String projectPath = System.getProperty("user.dir");
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.nopcommerce.com/");
		homePage = new HomePageObject(driver);
		
		firstName = "Automation";
		lastName = "FC";
		invalidEmail = "FC@afc.com@.vn";
		notFoundEmail = "auto" + generateFakeNumber() + "@gmail.com";
		existingEmail = "auto" + generateFakeNumber() + "@gmail.vn";
		validPassword = "123456";
		incorrectPassword = "999999";
		
		System.out.println("Pre-Condition - Step 01: Click to Register link");
		homePage.clickToRegisterLink();
		registerPage = new RegisterPageObject(driver);
		
		System.out.println("Pre-Condition - Step 02: Input to required fields");
		registerPage.inputToFirstNameTextbox(firstName);
		registerPage.inputToLastNameTextbox(lastName);
		registerPage.inputToEmailTextbox(existingEmail);
		registerPage.inputToPasswordTextbox(validPassword);
		registerPage.inputToConfirmPasswordTextbox(validPassword);
			
		System.out.println("Pre-Condition - Step 03: Click to Register button");
		registerPage.clickToRegisterButton();
		
		System.out.println("Pre-Condition - Step 04: Verify success message displayed");
		Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");
		
		System.out.println("Pre-Condition - Step 05: Click to Logout link");
		registerPage.clickToLogoutLink();
		
		homePage = new HomePageObject(driver);
	}
	
	@Test
	public void Login_01_Empty_Data() {
		System.out.println("Login_01 - Step 01: Click to Login link");
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageAtEmailTextbox(), "Please enter your email");
	}
  
	@Test
	public void Login_02_Invalid_Email() {
		System.out.println("Login_02 - Step 01: Click to Login link");
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(invalidEmail);
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageAtEmailTextbox(), "Wrong email");
	}
	
	@Test
	public void Login_03_Email_Not_Found() {
		System.out.println("Login_03 - Step 01: Click to Login link");
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(notFoundEmail);
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageUnsuccessfull(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found");
	}
	
	@Test
	public void Login_04_Existing_Email_Empty_Password() {
		System.out.println("Login_04 - Step 01: Click to Login link");
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(existingEmail);
		loginPage.inputToPasswordTextbox("");
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageUnsuccessfull(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
	}
	
	@Test
	public void Login_05_Existing_Email_Incorrect_Password() {
		System.out.println("Login_05 - Step 01: Click to Login link");
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(existingEmail);
		loginPage.inputToPasswordTextbox(incorrectPassword);
		
		loginPage.clickToLoginButton();
		
		Assert.assertEquals(loginPage.getErrorMessageUnsuccessfull(), "Login was unsuccessful. Please correct the errors and try again.\nThe credentials provided are incorrect");
	}
	
	@Test
	public void Login_06_Valid_Email_Password() {
		System.out.println("Login_05 - Step 01: Click to Login link");
		homePage.clickToLoginLink();
		
		loginPage = new LoginPageObject(driver);
		
		loginPage.inputToEmailTextbox(existingEmail);
		loginPage.inputToPasswordTextbox(validPassword);
		
		loginPage.clickToLoginButton();
		
		homePage = new HomePageObject(driver);
		
		Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
	
	public int generateFakeNumber() {
		Random rand = new Random();
		return rand.nextInt(9999);
	}
}
