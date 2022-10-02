package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class D04_searchStepDef {

    P03_homePage homePage = new P03_homePage();

    @Given("user navigates to Facebook")
    public void facebookLink() throws InterruptedException {

        homePage.facebookLink().click();
        Thread.sleep(3000);
    }

    @When("I enter Username as \"<username>\" and Password as \"<password>\"")
    public void facebookLogin(String username, String password) throws InterruptedException {

        homePage.usernameField().sendKeys(username);
        homePage.passwordField().sendKeys(password);
        homePage.passwordField().submit();
        Thread.sleep(3000);
    }

    @When("login should be unsuccessful")
    public void unsuccessfulLogin(){

        Assert.assertTrue(homePage.unsuccessMsg().isDisplayed());
    }


    @When("when user clicks on search field")
    public void whenUserClicksOnSearchField() {
        homePage.searchField().click();
    }

    @And("user search with {string}")
    public void userSearchWith(String searchWord) throws InterruptedException {
        homePage.searchField().sendKeys(searchWord + Keys.ENTER);
        Thread.sleep(3000);
    }


    @Then("user could find {string} relative results")
    public void userCouldFindRelativeResults(String productName) {

        Assert.assertEquals(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="), true );
        Assert.assertEquals(homePage.searchResult().getSize(), 4);
        for (int x=0 ; x < 4; x++){
            List<WebElement> results = Hooks.driver.findElements(By.className("item-grid"));
            String value = results.get(x).getText();
            Assert.assertEquals(value.toLowerCase().contains(productName),true);
        }

    }

    @Then("user could find {string} inside product details page")
    public void userCouldFindInsideProductDetailsPage(String SKU) throws InterruptedException {
        homePage.productDetailsPage().click();
        Thread.sleep(3000);
        String skuData = homePage.skuField().getText();
        Assert.assertEquals(skuData , SKU);
    }

//    @Then("user could find {string} inside product details page")
//    public void userCouldFindInsideProductDetailsPage(String productName ,String SKU) throws InterruptedException {
//
//        homePage.productDetailsPage().click();
//        Thread.sleep(3000);
//        String skuData = homePage.skuField().getText();
//        Assert.assertEquals(skuData , SKU);
//    }
}
