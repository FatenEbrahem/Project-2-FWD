package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D08_WishlistStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user clicks on wishlist for {string} product")
    public void userClicksOnWishlistForProduct(String htcProduct) throws InterruptedException {
        homePage.htcWishButton().click();
        Thread.sleep(2000);
    }

    @Then("user views the success msg")
    public void userViewsTheSuccessMsg() {
        Assert.assertTrue(homePage.wishSuccessMsg().isDisplayed());
        Assert.assertEquals(homePage.wishSuccessMsgColor(), "green");
        System.out.println("Actual color is "+homePage.wishSuccessMsgColor() );

    }

    @Then("wishlist link will have the saved wish product")
    public void wishlistLinkWillHaveTheSavedWishProduct() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("content")));
        homePage.wishListLink().click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("quantity")));
        Assert.assertTrue(homePage.quantityFieldValue());
    }
}
