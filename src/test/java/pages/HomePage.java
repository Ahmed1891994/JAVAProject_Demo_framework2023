package pages;

import org.openqa.selenium.By;

public class HomePage extends TestBase{
	By login_menu = By.className("ico-login");
	By register_menu = By.className("ico-register");
	By logout_btn = By.className("ico-logout");
	
	public HomePage EnterToLogin()
	{
		driverActions.clickOn(login_menu);
		return this;
	}
	public HomePage EnterToRegister()
	{
		driverActions.clickOn(register_menu);
		return this;
	}
	public boolean PageLoginLoadedSuccessfully()
	{
		return driverActions.isDisplayed(logout_btn);
	}
}

