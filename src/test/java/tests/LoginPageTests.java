package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.TestBase;

public class LoginPageTests extends TestBase{
	
	@Test(dependsOnGroups = {"Registration"})
	public void VerifyLoginSuccessfully()
	{
		HomePage homepage = new HomePage();
		homepage.EnterToLogin();
		
		LoginPage loginpage = new LoginPage();
		loginpage.pressLogin();
		assertTrue(homepage.PageLoginLoadedSuccessfully());
	}
	@Test
	public void VerifyFailedLoginUsingWrongEmail()
	{
		HomePage homepage = new HomePage();
		homepage.EnterToLogin();
		
		LoginPage loginpage = new LoginPage();
		loginpage.pressLogin("aaaaaa!@gmail.com","aaaaaa");
		assertTrue(loginpage.PageLoadedSuccessfully().contains("Login was unsuccessful. Please correct the errors and try again."));
		assertTrue(loginpage.PageLoadedSuccessfully().contains("No customer account found"));

	}
	@Test
	public void VerifyFailedLoginUsingWrongPassword()
	{
		HomePage homepage = new HomePage();
		homepage.EnterToLogin();
		
		LoginPage loginpage = new LoginPage();
		loginpage.pressLogin("aaaaaa@gmail.com","aaaaaa!");
		assertTrue(loginpage.PageLoadedSuccessfully().contains("Login was unsuccessful. Please correct the errors and try again."));
		assertTrue(loginpage.PageLoadedSuccessfully().contains("No customer account found"));
	}

}
