package com.CucumberPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by musti on 22/06/2017.
 */
public class login_linkedin_Page {
    WebDriver driver;
    public login_linkedin_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Web Elements for Login Test + Assert login_linkedin_Page
    @FindBy(xpath = "//*[@id='login-email']")
    private WebElement Email;

    @FindBy(xpath = "//*[@id='login-password']")
    private WebElement Password;

    @FindBy(xpath = "//*[@id='login-submit']")
    private WebElement Singin;

    @FindBy(xpath = "//*[@id='application-body']/script[2]")
    private WebElement closeCookie;

    @FindBy(xpath = "//*[@id='feed-tab-icon']")
    private WebElement LoginVerify;

    // Web elements for LogoutTest + Assert Log Out Test

    @FindBy(xpath = ".//*[@id='gb']/div[2]/div[3]/div/div[3]/div/a/span")
    private WebElement LogOutBtn;

    @FindBy(xpath = ".//*[@id='gb_71']")
    private WebElement SignOutBtn;

    @FindBy(xpath = ".//*[@id='view_container']/form/div[2]/div/div/div/ul[1]/li[1]/div/div[2]/p[3]")
    private WebElement VerifySignOut;



    public void doLogin(String myEmail, String myPassword) throws InterruptedException {

        //Thread.sleep(2000);
        //closeCookie.click();
        Thread.sleep(2000);
        Email.sendKeys(myEmail);
        Thread.sleep(2000);
        Password.sendKeys(myPassword);
    }

    public void clickLogin(){
        Singin.click();
    }

    public boolean verifyLoginPage(){
        return LoginVerify.isDisplayed();

    }

    public void doLogOut(){

        LogOutBtn.click();
        SignOutBtn.click();
    }

    public boolean VerifyLogOut(){
        return VerifySignOut.isDisplayed();
    }
}
