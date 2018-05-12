package com.CucumberPrac;

import org.apache.regexp.RE;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;


/**
 * Created by musti on 11/09/2017.
 */
public class DriverInstance {

    public  static WebDriver driver;

    //This will open the browser
    public void openBrowser() {
        ResourceBundle global = ResourceBundle.getBundle("global");
        if (global.getString("browser").equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "src\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
        } else if (global.getString("browser").equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "src/Drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(global.getString("URL"));
        driver.manage().window().maximize();
    }
            //This will close browser
            public void closeBrowser(){
            driver.quit();
        }

}
