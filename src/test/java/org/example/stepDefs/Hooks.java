package org.example.stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver = null;


    @Before
    public void openBrowser() throws InterruptedException {

        //Bridge
//        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\pro\\chromedriver.exe");
        //Create new object from chrome
        driver = new ChromeDriver();

        //Configuration
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Navigate to the website
        driver.navigate().to("https://demo.nopcommerce.com/");


    }

    @After
    public void quitDriver() throws InterruptedException {

        Thread.sleep(3000);
        driver.quit();

    }
}
