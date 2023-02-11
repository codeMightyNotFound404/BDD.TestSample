package test.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.cucumber.datatable.DataTable;

public class RegisterPage extends PageObjectManager {

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement last_name;
	
	@FindBy(xpath="//textarea[starts-with(@ng-model,'Adress')]")
	WebElement address;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email_address;
	
	@FindBy(xpath="//label[contains(text(),'Gender')]/following-sibling::div/label/*[starts-with (text(),'')]")
	WebElement gender;	
	
	@FindBy(xpath="//label[contains(text(),'Hobbies')]/following-sibling::div/div/input[@value='']")
	WebElement hobbies;
	
	@FindBy(xpath="//input[@type='tel']")
	WebElement phone;
	
	@FindBy(xpath="//div[@id='msdd']")
	WebElement Language;
	
	@FindBy(xpath="//select[@id='Skills']")
	WebElement skills;
	
	@FindBy(xpath="//select[@id='countries']")
	WebElement country;
	
	@FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
	WebElement select_country;
	
	@FindBy(xpath="//select[@id='yearbox']")
	WebElement dob_Year;
	
	@FindBy(xpath="//select[@ng-model='monthbox']")
	WebElement dob_Month;
	
	@FindBy(xpath="//select[@id='daybox']")
	WebElement dob_date;
	
	@FindBy(xpath="//input[@id='firstpassword']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	WebElement confirm_password;
	
	@FindBy(xpath="//button[@value='sign up']")
	WebElement submit;
	
	@FindBy(xpath="//button[@value='Refresh']")
	WebElement refresh;

	/**
	 *
	 * @param hobbies
	 * @throws NoSuchElementException
	 */
	public void selectHobbies(List<String> hobbies) throws NoSuchElementException
	{
		hobbies.forEach(value->{
			driver.findElement(By.xpath("//label[contains(text(),'Hobbies')]/following-sibling::div/div/input[@value='"+value+"']")).click();
		});
	}

	/**
	 *
	 * @param language_value
	 * @throws NoSuchElementException
	 * @throws InterruptedException
	 */
	public void selectLanguage(String language_value) throws NoSuchElementException, InterruptedException
	{
		Language.click();
		driver.findElement(By.xpath("//li/a[@class='ui-corner-all' and contains(text(),'"+language_value+"')]")).click();	
	}

	/**
	 *
	 * @param tabledata
	 * @throws NoSuchElementException
	 * @throws InterruptedException
	 */
	public void fillform(DataTable tabledata) throws NoSuchElementException, InterruptedException
	{
		List<List<String>> str=tabledata.asLists(String.class);
		 first_name.sendKeys(str.get(1).get(0));
		 last_name.sendKeys(str.get(1).get(1));
		 submit.click();
	}
	
}
