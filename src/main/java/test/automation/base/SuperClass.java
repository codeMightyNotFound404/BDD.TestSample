package test.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SuperClass {
	
	public  WebDriver driver;
	
	public void browserinitialization(String type)
	{
		type.toLowerCase();
		switch(type)
		{
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src//main//resource//drivers//chromedriver");
			//WebDriverManager.chromedriver().version("84.0.4147.130").setup();
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
