package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterCompletedPage;
import pages.RegisterPage;
import pages.TestBase;

public class RegistrationTests extends TestBase{
	@Test(priority=0,groups = "Registration")
	public void RegistrationSuccessfully()
	{
		HomePage homepage = new HomePage();
		homepage.EnterToRegister();
		
		RegisterPage registerpage = new RegisterPage();
		registerpage.Register();
		RegisterCompletedPage registercompletedpage = new RegisterCompletedPage();	
		assertTrue(registercompletedpage.PageLoadedSuccessfully().contains("Your registration completed"));
		registercompletedpage.Logout();
	}
}
