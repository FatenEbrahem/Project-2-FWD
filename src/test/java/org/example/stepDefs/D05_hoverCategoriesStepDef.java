package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

public class D05_hoverCategoriesStepDef {
    P03_homePage homePage = new P03_homePage();

    @Given("user can hover on the computer category")
    public void userCanHoverOnTheComputerCategory() throws InterruptedException {
        homePage.hoveringComputerCategory();
        Thread.sleep(3000);
    }

    @When("user clicks on notebooks subcategory")
    public void userClicksOnNotebooksSubcategory() throws InterruptedException {
        homePage.noteBooksSubcategory().getText();
        homePage.noteBooksSubcategory().click();
        Thread.sleep(3000);
    }


    @Then("the system will open the subcategory details page {string}")
    public void theSystemWillOpenTheSubcategoryDetailsPage(String subcategoryName) {
        Assert.assertEquals(homePage.subcategoryTitle(),subcategoryName);
        System.out.println("Actual Result is "+homePage.subcategoryTitle()+", and the expected is "+ subcategoryName);
        System.out.println(homePage.subcategoryTitle().toLowerCase().trim());
    }
}
