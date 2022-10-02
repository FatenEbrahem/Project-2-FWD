package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class D03_currenciesStepDef {
    P03_homePage homePage = new P03_homePage();

    @Given("user go to Home page")
    public void homePage(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("customerCurrency")));
    }

    @When("user selects Euro currency")
    public void selectEuroCurr() throws InterruptedException {
        homePage.selectEuroCurrency().click();
        Select select = new Select(homePage.selectEuroCurrency());
        select.selectByVisibleText("Euro");
        Thread.sleep(3000);
    }

    @Then("system display related products")
    public void productsRelatedToEuro(){

        for (int x=0 ; x < 4; x++){
            List<WebElement> prices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
            String value = prices.get(x).getText();
            Assert.assertEquals(value.contains("€"),true);
        }

    }




}
