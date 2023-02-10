package test.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCard extends PageObjectManager{

	@FindBy(xpath="//div/a[contains(text(),'CHECKOUT')]")
	WebElement link_CheckOut;
	
	@FindBy(xpath="//div/a[contains(text(),'Continue Shopping')]")
	WebElement link_cont_shopping;

	public YourCard() {
		PageFactory.initElements(driver, this);
	}

}
