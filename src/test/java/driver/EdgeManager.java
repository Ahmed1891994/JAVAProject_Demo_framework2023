package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeManager extends BrowserFactory{
	@Override
	public WebDriver Driversetup() {
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();
	}
}
