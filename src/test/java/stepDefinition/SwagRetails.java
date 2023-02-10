package stepDefinition;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.automation.base.SuperClass;

public class SwagRetails extends SuperClass {
	
	@Given("^Login to the swap$")
	public void login() {
	}
	
	@When("^Selected the item \"(.*)\"$")
	public void chechout_Items(String string) {
	
	}
	@And("^Enter the address$")
	public void address_Fill(DataTable dataTable) {
	   
	}
	@And("^Place the order$")
	public void place_order() {
	  
	}
	@Then("^Order should be placed successfully$")
	public void order_validation() {
	   
	}

}
