package test.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import test.automation.utilities.UiOprations;

public class CheckOutPage extends PageObjectManager{

	@FindBy(id="first-name")
	WebElement input_Fname ;
	
	@FindBy(id="last-name")
	WebElement input_Lname;
	
	@FindBy(id="postal-code")
	WebElement input_postal;
	
	@FindBy(xpath="//div[@class='checkout_buttons']/a[starts-with(text(),'CANCEL')]")
	WebElement link_cancel;
	
	@FindBy(xpath="//input[@type='submit'][@value='CONTINUE']")
	WebElement link_continue;
	
	public CheckOutPage() {
		PageFactory.initElements(driver, this);
	}

	public void address_Fill(List<String> addressDetails) throws InterruptedException
	{
	input_Fname.sendKeys(addressDetails.get(0));
	input_Lname.sendKeys(addressDetails.get(1));
	input_postal.sendKeys(addressDetails.get(2));
	link_continue.click();
	Thread.sleep(3000);
	UiOprations uiOp=new UiOprations();
	Assert.assertEquals(uiOp.isElementExist(driver.findElement(By.xpath("//div[starts-with(text(),'Checkout: Overview')]"))), true);
	}
	
	
}
