package stefDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import ulilPage.BasePage;

public class StefDefinationPage extends BasePage {
	
	@Given("^Launch \"([^\"]*)\"$")
	public void launch(String url) throws Throwable {
		geturl(url);
	}

	@Then("^Expect Sign In option$")
	public void expect_Sign_In_option() throws Throwable {
	    
	}

	@Then("^I can Necigate Creat an Account Page$")
	public void i_can_Necigate_Creat_an_Account_Page() throws Throwable {
	    
	}

	@Then("^I Expect to wright First Name$")
	public void i_Expect_to_wright_First_Name() throws Throwable {
	   
	}

	@Then("^I Expect to wright Last Name$")
	public void i_Expect_to_wright_Last_Name() throws Throwable {
	    
	}

	@Then("^I Expect to wright Email Address$")
	public void i_Expect_to_wright_Email_Address() throws Throwable {
	    
	}

	@Then("^I Expect I can create Password$")
	public void i_Expect_I_can_create_Password() throws Throwable {
	   
	}

	@Then("^Verify I can see Show passord button$")
	public void verify_I_can_see_Show_passord_button() throws Throwable {
	   
	}


}
