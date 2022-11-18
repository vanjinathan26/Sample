package org.stepdefinitionfile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinitionFile {
	@Given("to Launch Browse and URL")
	public void to_Launch_Browse_and_URL() {
	   System.out.println("ABCDE");
	}

	@Given("To Maximize the Window")
	public void to_Maximize_the_Window() {
	  System.out.println("Cucumber Framework");
	}

	@When("To pass the Data in Email and Password Box")
	public void to_pass_the_Data_in_Email_and_Password_Box() {
		System.out.println("Done");
	    
	}

	@When("Click the login button")
	public void click_the_login_button() {
		System.out.println("error");
	   
	}



}
