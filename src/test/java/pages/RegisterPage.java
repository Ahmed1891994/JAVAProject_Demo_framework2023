package pages;

import org.openqa.selenium.By;

public class RegisterPage extends TestBase{
	By male_Rdbtn = By.id("gender-male");
	By female_Rdbtn = By.id("gender-female");
	By firstname_fld = By.id("FirstName");
	By lastname_fld = By.id("LastName");
	By day_fld = By.name("DateOfBirthDay");
	By month_fld = By.name("DateOfBirthMonth");
	By year_fld = By.name("DateOfBirthYear");
	By email_fld = By.id("Email");
	By company_fld = By.id("Company");
	By newsletter_chk = By.id("Newsletter");
	By password_fld = By.id("Password");
	By confirmpassword_fld = By.id("ConfirmPassword");
	By register_confirm_btn = By.id("register-button");
	
	public String GetPageTitle()
	{
		return driverActions.TitleGet();
	}

	public void Register()
	{	
		if(fakeruser.getMalefemale_status().equals("m"))
			driverActions.clickOn(male_Rdbtn);
		else
			driverActions.clickOn(female_Rdbtn);
		driverActions.textSet(firstname_fld, fakeruser.getFirstname());
		driverActions.textSet(lastname_fld, fakeruser.getLastname());
		driverActions.selectByVisibleText(day_fld, fakeruser.getDay());
		driverActions.selectByValue(month_fld, fakeruser.getMonth());
		driverActions.selectByVisibleText(year_fld, fakeruser.getYear());
		driverActions.textSet(company_fld, fakeruser.getCompanyname());
		driverActions.textSet(email_fld, fakeruser.getEmail());
		if(fakeruser.getNewsletter_status())
			driverActions.clickOn(newsletter_chk);
		driverActions.textSet(password_fld, fakeruser.getPassword());
		driverActions.textSet(confirmpassword_fld, fakeruser.getPassword());
		driverActions.clickOn(register_confirm_btn);
	}
	public void Register(String Malefemale_status,String firstname,String lastname,String day,String month,String year,String company
			,String email,boolean Newsletter,String password,String confirmpassword)
	{	
		if(Malefemale_status.equals("m"))
			driverActions.clickOn(male_Rdbtn);
		else
			driverActions.clickOn(female_Rdbtn);
		driverActions.textSet(firstname_fld, firstname);
		driverActions.textSet(lastname_fld, lastname);
		driverActions.selectByVisibleText(day_fld, day);
		driverActions.selectByValue(month_fld, month);
		driverActions.selectByVisibleText(year_fld, year);
		driverActions.textSet(company_fld, company);
		driverActions.textSet(email_fld, email);
		if(Newsletter)
			driverActions.clickOn(newsletter_chk);
		driverActions.textSet(password_fld, password);
		driverActions.textSet(confirmpassword_fld, confirmpassword);
		driverActions.clickOn(register_confirm_btn);
	}
}
