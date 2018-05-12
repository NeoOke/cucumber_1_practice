package com.CucumberPrac.Step_definition;

import com.CucumberPrac.DriverInstance;
import com.CucumberPrac.login_linkedin_Page;
import cucumber.api.java.en.*;
import org.junit.Assert;

public class login_linkedinTest extends DriverInstance {
    login_linkedin_Page llp = new login_linkedin_Page(driver);

    @Given("^I navigate to the Landing page of LinkedIn$")
    public void i_navigate_to_the_Landing_page_of_LinkedIn() throws Throwable {

        System.out.println("There is nothing to declare here" + "|");
    }

    @When("^I enter my Username & Password$")
    public void i_enter_my_Username_Password() throws Throwable {
        llp.doLogin("niyi_oke@hotmail.com", "21Shakeyourbooty");

    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {
        llp.clickLogin();

    }

    @Then("^I should login successfully$")
    public void i_should_login_successfully() throws Throwable {

        Assert.assertTrue(llp.verifyLoginPage());

    }

}
