package test.automation.pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.automation.utilities.UiOprations;

public class LoginPage extends PageObjectManager {

	@FindBy(xpath="//input[@id='user-name']")
	WebElement input_username;
	
	@FindBy(id="password")
	WebElement input_password;
	
	@FindBy(id="login-button")
	WebElement button_submit;
	
	@FindBy(xpath="//h3[@data-test='error']/text()[2]")
	WebElement error_msg;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public void login(String username ,char[] password) throws Exception
	{
		input_username.clear();
		input_username.sendKeys(username);
		input_password.clear();
		input_password.sendKeys(String.valueOf(password));
		button_submit.click();
		UiOprations op=new UiOprations();
		Assert.assertEquals(op.isElementExist(error_msg), false);
	}
	
}
