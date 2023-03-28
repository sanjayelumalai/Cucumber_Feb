package com.Step_Defination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObjectModel.Loginpage;
import com.PageObjectModel.SearchHotel;
import com.TestRunner.RunnerClass;
import com.base1.Base_Class1;
import com.pagaObjectManager.POmanager;
import com.reader.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends Base_Class1 {

	public static WebDriver driver;

	POmanager pom = new POmanager(driver);

	@Given("User launch The Application")
	public void user_launch_the_application() throws IOException {

		ConfigurationReader co = new ConfigurationReader();
		geturl("http://adactinhotelapp.com/");

	}

	@When("User Enter The {string} in the Username Field")
	public void user_enter_the_in_the_username_field(String string) {
		inputElement(pom.getLogin().getUser(), string);
	}

	@When("user Enter The {string} in Password Field")
	public void user_enter_the_in_password_field(String string) {
		inputElement(pom.getLogin().getPass(), string);
	}

	@Then("user Click Login button Its Navigate To the Search Hotel")
	public void user_click_login_button_its_navigate_to_the_search_hotel() {
		// Write code here that turns th

	}
}
