package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Attachment;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;
import pages.TestBase;

@Listeners(utils.Listener.class)

public class FormAuthenticationTests extends TestBase{
	
	@Attachment
	@Test(description="Valid Login Scenario with valid username and password.")
	public void VerifyLoginSuccessfully()
	{
		HomePage homepage = new HomePage();
		homepage.EnterToForm_Authentication();
		
		LoginPage loginpage = new LoginPage();
		loginpage.pressLogin("tomsmith","SuperSecretPassword!x");
		
		SecureAreaPage secureareapage = new SecureAreaPage();

		assertTrue(secureareapage.GetAlertText().contains("You logged into a secure area!"));
		assertEquals(secureareapage.GetPageHeader(), "Secure Area");
	}
	
	
}
