package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D02_loginStepDef {

    P02_login login = new P02_login();

    @Given("user go to login page")
    public void loginPage() throws InterruptedException {
        login.loginLink().click();
        Thread.sleep(3000);
//        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Email")));
    }

    @And("user press on login button")
    public void submitLoginButton() throws InterruptedException {
        login.loginButton().click();
        Thread.sleep(3000);
    }

    @Then("user login to the system successfully")
    public void loginSuccessfully() throws InterruptedException {
        login.loginButton().click();
        Thread.sleep(3000);
        Assert.assertEquals(login.loginURL(),"https://demo.nopcommerce.com/");
        Assert.assertTrue(login.myAccountLink().isDisplayed());
    }

    @Then("user could not login to the system")
    public void notLoginSuccessfully() throws InterruptedException {
        login.loginButton().click();
        Thread.sleep(3000);
        Assert.assertTrue(login.unsuccessfulLoginMsg().contains("Login was unsuccessful."));
        Assert.assertEquals(login.unsuccessfulMsgColor(), "#e4434b");
    }

    @When("user login with {string} and {string}")
    public void userLoginWithAnd(String email, String password) {
        login.emailField().sendKeys(email);
        login.passwordField().sendKeys(password);

    }
}
