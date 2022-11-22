package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;

public abstract class BrowserFactory {
	protected WebDriver driver;
	
	abstract WebDriver Driversetup();
	
	public WebDriver getDriver()
	{
		if(driver == null)
			driver = Driversetup();
		return driver;
	}

	abstract AbstractDriverOptions getOptions();
}
