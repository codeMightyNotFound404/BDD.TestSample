package test.automation.pages;

import org.openqa.selenium.support.PageFactory;
import test.automation.base.SuperClass;

public class PageObjectManager extends SuperClass {
	
	   public PageObjectManager()
	   {
		   PageFactory.initElements(driver, this);
	   }

	/**
	 *
	 * @param className
	 * @return
	 */
		public PageObjectManager getIntance(String className)
		{
			if(className.equalsIgnoreCase("CheckOutPage"))
				 return new CheckOutPage();
			else if(className.equalsIgnoreCase("DashboardPage"))
				return new DashboardPage();
			else if(className.equalsIgnoreCase("DashboardPage"))
				return new LoginPage();
			else if(className.equalsIgnoreCase("LoginPage"))
				return new RegisterPage();
			else
				return null;
		}

}
