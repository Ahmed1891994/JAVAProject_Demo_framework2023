package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxManager extends BrowserFactory{
	
	@Override
	public WebDriver Driversetup() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
}
