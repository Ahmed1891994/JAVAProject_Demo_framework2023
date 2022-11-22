package driver;

import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactoryType {
	private RemoteWebDriver Chrome = new ChromeManager();
	private BrowserFactory Edge =  new EdgeManager();
}
