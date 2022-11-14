package pages;

import org.openqa.selenium.By;

public class LoginPage extends TestBase{
	By email_fld = By.id("Email");
	By password_fld = By.id("Password");
	By rememberme_chx = By.id("RememberMe");
	By forgot_password_lnk = By.className("forgot-password");
	By login_button_lnk = By.className("login-button");
	By wronglogin_txt = By.className("message-error");
	public void setEmail(String email)
	{
		driverActions.textSet(email_fld,email);
	}
	public void setPassword(String password)
	{
		driverActions.textSet(password_fld,password);
	}
	public void pressLogin()
	{
		setEmail(fakeruser.getEmail());
		setPassword(fakeruser.getPassword());
		driverActions.clickOn(login_button_lnk);
	}
	public void pressLogin(String email,String password)
	{
		setEmail(email);
		setPassword(password);
		driverActions.clickOn(login_button_lnk);
	}
	public String PageLoadedSuccessfully()
	{
		return driverActions.textGet(wronglogin_txt);
	}

}
