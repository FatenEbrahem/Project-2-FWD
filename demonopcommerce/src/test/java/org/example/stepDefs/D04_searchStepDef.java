package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

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



}
