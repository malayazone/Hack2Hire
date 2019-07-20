package StepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sampleStepDef {
	@Given("I have variable a")  
	public void i_have_variable_a() {
	    System.out.println("Given");
	   
	}

	@Given("I have variable b")
	public void i_have_variable_b() {
		System.out.println("Given2");
	   
	}

	@When("I multiplication a and b")
	public void i_multiplication_a_and_b() {
		System.out.println("When");
	   
	}

	@Then("I display the Result")
	public void i_display_the_Result() {
		System.out.println("Then");
	  
	}
}
