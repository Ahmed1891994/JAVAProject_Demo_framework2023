package pages;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import base.DriverActions;
import driver.BrowserFactory;
import driver.BrowserFactoryManager;
import utils.FakerDataUser;

public class TestBase {

	protected ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	protected ThreadLocal<BrowserFactory> driverManager = new ThreadLocal<BrowserFactory>();
	public static DriverActions driverActions;
	public static FakerDataUser fakeruser;
	
    @BeforeTest
    public void setupClass() {
    	BrowserFactoryManager browserfactorymanager = new BrowserFactoryManager();
    	setDriverManager(browserfactorymanager.get("Firefox"));
    	setDriver(getDriverManager().getDriver());
        driverActions = new DriverActions(getDriver());
        getDriver().manage().window().maximize();
        driverActions.openURL("https://demo.nopcommerce.com");
        fakeruser = new FakerDataUser();
    }

    @AfterTest
    public void teardown() {
    	driverActions.closeAllWindows();
    }
    
    private void setDriver(WebDriver driver)
    {
    	this.driver.set(driver);
    }
    
    protected WebDriver getDriver()
    {
    	return this.driver.get();
    }
    
    private void setDriverManager(BrowserFactory driverManager)
    {
    	this.driverManager.set(driverManager);
    }
    
    protected BrowserFactory getDriverManager()
    {
    	return this.driverManager.get();
    }
    
}
