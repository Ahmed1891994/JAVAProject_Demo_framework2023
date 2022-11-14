package pages;

import org.openqa.selenium.By;

public class RegisterCompletedPage extends TestBase{

	By registeredcomplete_txt = By.className("result");
	By logout_btn = By.className("ico-logout");
	public String GetPageTitle()
	{
		return driverActions.TitleGet();
	}
	public String PageLoadedSuccessfully()
	{
		return driverActions.textGet(registeredcomplete_txt);
	}
	public void Logout()
	{
		driverActions.clickOn(logout_btn);
	}
}
