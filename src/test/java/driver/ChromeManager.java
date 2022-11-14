package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeManager extends BrowserFactory{
	@Override
	public WebDriver Driversetup() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
}
