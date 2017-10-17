package com.CucumberPrac.Step_definition;

import com.CucumberPrac.DriverInstance;
import com.CucumberPrac.loginPage;
import cucumber.api.java.en.*;
import org.junit.Assert;

import java.util.ResourceBundle;


/**
 * Created by musti on 12/10/2017.
 */
public class loginTest extends DriverInstance{
    //ResourceBundle config = ResourceBundle.getBundle("config");
    loginPage lp = new loginPage(driver);
    @Given("^I navigate to the Landing page$")
    public void i_navigate_to_the_Landing_page() throws Throwable {
        Thread.sleep(5000);


    }

    @When("^I enter my \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_my_and(String arg1, String arg2) throws Throwable {

        lp.doLogin("muyi.accuity@gmail.com", "Accuity123");
    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {

        System.out.println("Practice step. This step should ideally contain the login button method");
    }


    @Then("^I should login successfully$")
    public void i_should_login_successfully() throws Throwable {

        //loginPage lp = new loginPage(driver);
        Assert.assertTrue(lp.verifyLoginPage());

        DriverInstance di=new DriverInstance();
        di.closeBrowser();

    }
}
