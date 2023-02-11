package test.automation.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperClass {
	
	public  WebDriver driver;
	public WebDriverWait wait=null;

	/**
	 * @param type
	 */
	public void browserinitialization(String type)
	{
		type.toLowerCase();
		switch(type)
		{
		case "chrome":
			WebDriverManager.chromedriver().version("84.0.4147.130").setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized"); 
			options.addArguments("enable-automation"); 
			options.addArguments("--no-sandbox"); 
			options.addArguments("--disable-infobars");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--disable-browser-side-navigation"); 
			options.addArguments("--disable-gpu"); 
			driver = new ChromeDriver(options); 
			break;
		case "ie":
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src//main//resource//drivers//geckodriver");
			break;	
		case "safari":
			break;
		}
	}
	
   }
