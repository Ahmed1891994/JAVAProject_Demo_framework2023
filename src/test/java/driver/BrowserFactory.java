package driver;

import org.openqa.selenium.WebDriver;

public abstract class BrowserFactory {
	protected WebDriver driver;
	
	abstract WebDriver Driversetup();
	
	public WebDriver getDriver()
	{
		if(driver == null)
			driver = Driversetup();
		return driver;
	}
}
