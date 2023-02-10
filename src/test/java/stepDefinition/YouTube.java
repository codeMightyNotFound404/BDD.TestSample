package stepDefinition;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.automation.base.SuperClass;


public class YouTube extends SuperClass{


@Before
public void setUp()
{
	//To Be Imp
}

@Given("user on dashboard")
public void user_on_dashboard() 
{
    //To Be Imp
}

@When("^search by title \"([^\"]*)\"$")
public void search_by_title(String str) {
    //To Be Imp
}

@Then("there will be search result")
public void there_will_be_search_result() {
    //To Be Imp

}
@Then("count will be more")
public void count_will_be_more() {
    //To Be Imp
   
}

@After()
public void tearDown()
{
	driver.close();
}

}
