package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D01_registerStepDef {

    P01_register register = new P01_register();

    @Given("User go to register page")
    public void registerPage(){
        register.registerLink().click();
    }

    @When("user select gender type")
    public void genderField() throws InterruptedException {
        register.genderType().click();
        Thread.sleep(1000);
    }

    @And("user enter first name and last name")
    public void addingTextFields(){
//        register.firstNameField().click();
        register.firstNameField().sendKeys("automation");
        register.firstNameField().sendKeys(Keys.TAB);
        register.lastNameField().sendKeys("tester");
    }

    @And("user enter date of birth")
    public void addBirthDate() throws InterruptedException {
        Select select = new Select(register.dayDateField());
        select.selectByIndex(5);
        Thread.sleep(2000);
        select = new Select(register.monthDateField());
        select.selectByIndex(10);
        Thread.sleep(2000);
        select = new Select(register.yearDateField());
        select.selectByValue("1990");
    }

    @And("user enter email field")
    public void email(){
        register.emailField().sendKeys("test1@example.com");
    }

    @And("user fills Password fields")
    public void addPassword(){
        register.passwordField().sendKeys("P@ssw0rd");
        register.confirmPasswordField().sendKeys("P@ssw0rd");
    }

    @And("user clicks on register button")
    public void clickRegisterButton() throws InterruptedException {
        register.registerButton().click();
        Thread.sleep(3000);

    }

    @Then("success message is displayed")
    public void viewSuccessMsg(){

        Assert.assertTrue(register.successMsg().isDisplayed());
        Assert.assertEquals(register.successMsg().getText(), "Your registration completed");
        Assert.assertEquals(register.successMsgColor(),"rgba(76, 177, 124, 1)");
    }

}
