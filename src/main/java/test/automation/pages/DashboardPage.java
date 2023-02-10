package test.automation.pages;

import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class DashboardPage extends PageObjectManager{

	@FindBy(xpath="//select[@class='product_sort_container']")
	WebElement dropdown_sorting;
	
	@FindBy(xpath="//title")
	WebElement title;
	
	@FindBy(xpath="//div[@id='shopping_cart_container']/a/span")
	WebElement cart_count;
	
	@FindAll(
	@FindBy(xpath="//div[@class='inventory_container']/div[@class='inventory_list']/div")
	)List<WebElement> product_list;
	
	public DashboardPage() {
		PageFactory.initElements(driver, this);
	}

	public void productsorting(String sortby) throws NoSuchElementException,InterruptedException
	{
		Select sorting=new Select(dropdown_sorting);
		sorting.selectByVisibleText(sortby);
		Thread.sleep(4000);
		Assert.assertEquals(sorting.getFirstSelectedOption(), sortby);
	}
	
	public void add_Product(List<String> productName)
	{
		for(String product: productName) {
			
	  
	WebElement productElement  = driver.findElement(By.xpath("//a/div[contains(text(),'"+product+"')]/parent::a/parent::div/following-sibling::div/button"));
	String action=productElement.getText();
	
	if(!action.equalsIgnoreCase("ADD TO CART"))
		{
			productElement.click();
		}
	    
		}
		
		Assert.assertEquals(Integer.parseInt(cart_count.getText()), productName.size());
	}
	
	public void remove_Product(List<String> productName)
	{
    String productcount=cart_count.getText();
		for(String product: productName) {
	WebElement productElement  = driver.findElement(By.xpath("//a/div[contains(text(),'"+product+"')]/parent::a/parent::div/following-sibling::div/button"));
	String action=productElement.getText();
	
	if(!action.equalsIgnoreCase("REMOVE"))
		{
			productElement.click();
		}
	    
		}
		
		Assert.assertEquals(Integer.parseInt(cart_count.getText()),productName.size()-Integer.parseInt(productcount) );
	
	}

}
