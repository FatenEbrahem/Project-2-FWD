package org.example.stepDefs;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;


public class D07_followUsStepDef {
    P03_homePage homePage = new P03_homePage();

    @When("user opens facebook link")
    public void userOpensFacebookLink() throws InterruptedException {
        homePage.facebookLink().click();
        Thread.sleep(2000);
        homePage.switchToOpenedTab();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String expectedResult) {
        Assert.assertEquals(homePage.newTabURL(), expectedResult);
        System.out.println("Actual result is "+homePage.newTabURL()+ "The expected result is "+expectedResult);
    }

    @When("user opens twitter link")
    public void userOpensTwitterLink() throws InterruptedException {
        homePage.twitterLink().click();
        Thread.sleep(2000);
        homePage.switchToOpenedTab();
    }

    @When("user opens rss link")
    public void userOpensRssLink() throws InterruptedException {
        homePage.rssLink().click();
        Thread.sleep(2000);
        homePage.switchToOpenedTab();
    }

    @When("user opens youtube link")
    public void userOpensYoutubeLink() throws InterruptedException {
        homePage.youtubeLink().click();
        Thread.sleep(2000);
        homePage.switchToOpenedTab();
    }
}
