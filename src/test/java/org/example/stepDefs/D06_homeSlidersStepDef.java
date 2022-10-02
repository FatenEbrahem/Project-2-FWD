package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user clicks into the first slider")
    public void userClicksIntoTheFirstSlider() throws InterruptedException {
        homePage.firstSlider().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        System.out.println(Hooks.driver.getCurrentUrl());
    }

    @Then("system will navigate the user to the first slider details page")
    public void systemWillNavigateTheUserToTheFirstSliderDetailsPage(){
        String actualURL = homePage.firstSliderNavigationURL();
        String expectedURL = "https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(actualURL, expectedURL);
        System.out.println(actualURL + ", "+ expectedURL);
    }

    @When("user clicks into the second slider")
    public void userClicksIntoTheSecondSlider() {
        homePage.secondSlider().click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleContains("https://demo.nopcommerce.com/iphone-6"));
        System.out.println(Hooks.driver.getCurrentUrl());
    }

    @Then("system will navigate the user to the second slider details page")
    public void systemWillNavigateTheUserToTheSecondSliderDetailsPage() {
        String actualURL = homePage.secondSliderNavigationURL();
        String expectedURL = "https://demo.nopcommerce.com/iphone-6";
        Assert.assertEquals(actualURL, expectedURL);
        System.out.println(actualURL + ", "+ expectedURL);
    }
}
