package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.html.HTMLInputElement;

import java.util.ArrayList;
import java.util.List;

public class P03_homePage {
    public WebElement loginLink(){
        WebElement loginLink = Hooks.driver.findElement(By.className("ico-login"));
        return loginLink;
    }

    public WebElement selectEuroCurrency() {
        WebElement selectEuroCurrency = Hooks.driver.findElement(By.id("customerCurrency"));
        return selectEuroCurrency;
    }

    public WebElement facebookLink() {
        WebElement  facebookLink = Hooks.driver.findElement(By.className("facebook"));
        return facebookLink;
    }

    public WebElement usernameField() {
        WebElement  facebookUsernameField = Hooks.driver.findElement(By.cssSelector("[name=email]"));
        return facebookUsernameField;
    }

    public WebElement passwordField() {
        WebElement  facebookPasswordField = Hooks.driver.findElement(By.cssSelector("[name=pass]"));
        return facebookPasswordField;
    }


    public WebElement unsuccessMsg() {
        WebElement  unsuccessMsg = Hooks.driver.findElement(By.className("_9ay7"));
        return unsuccessMsg;
    }

    public WebElement searchField() {
        WebElement  searchField = Hooks.driver.findElement(By.id("small-searchterms"));
        return searchField;
    }

    public WebElement searchResult() {
        ArrayList <WebElement>  searchResult = (ArrayList<WebElement>) Hooks.driver.findElements(By.className("item-grid"));
        return (WebElement) searchResult;
    }

    public WebElement productDetailsPage() {
        List <WebElement> productDetailsPage = (List<WebElement>) Hooks.driver.findElements(By.className("product-title"));
        return productDetailsPage.get(0);
    }


    public WebElement skuField() {
        WebElement skuField = Hooks.driver.findElement(By.className("value"));
        return skuField;
    }

    public void hoveringComputerCategory() {
        Actions action = new Actions(Hooks.driver);

        WebElement computerCategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
        action.moveToElement(computerCategory).perform();
    }

    public WebElement noteBooksSubcategory() {
        WebElement noteBookSubcategory = Hooks.driver.findElement(By.cssSelector("a[href=\"/notebooks\"]"));
        return noteBookSubcategory;
    }

    public String subcategoryTitle() {
        String title = Hooks.driver.findElement(By.cssSelector("div.page-title>h1")).getText();
        return title;
    }

    public WebElement firstSlider() {
        List<WebElement> Slider = Hooks.driver.findElements(By.id("nivo-slider"));
        return (WebElement) Slider.get(0);
    }

    public String firstSliderNavigationURL() {
        String firstSliderNavigationURL = Hooks.driver.getCurrentUrl();
        return firstSliderNavigationURL;
    }

    public WebElement secondSlider() {
        List<WebElement> Slider = Hooks.driver.findElements(By.id("nivo-slider"));
        return (WebElement) Slider.get(1);
    }

    public String secondSliderNavigationURL() {
        String secondSliderNavigationURL = Hooks.driver.getCurrentUrl();
        return secondSliderNavigationURL;
    }

    public String newTabURL() {
        String newTabURL = Hooks.driver.getCurrentUrl();
        return newTabURL ;
    }

    public void switchToOpenedTab() {
        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }

    public WebElement twitterLink() {
        WebElement  twitterLink = Hooks.driver.findElement(By.className("twitter"));
        return twitterLink;
    }

    public WebElement rssLink() {
        WebElement  rssLink = Hooks.driver.findElement(By.className("rss"));
        return rssLink;
    }

    public WebElement youtubeLink() {
        WebElement  youtubeLink = Hooks.driver.findElement(By.className("youtube"));
        return youtubeLink;
    }

    public WebElement htcWishButton() {
        WebElement wishButton = Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
        return wishButton;
    }

    public WebElement wishSuccessMsg() {
        WebElement  wishSuccessMsg = Hooks.driver.findElement(By.className("content"));
        return wishSuccessMsg;
    }

    public String wishSuccessMsgColor() {
        String successColor = wishSuccessMsg().getAttribute("background-color");
        return successColor;
    }

    public WebElement wishListLink() {
        WebElement wishListLink = Hooks.driver.findElement(By.className("wishlist-label"));
        return wishListLink;
    }

    public boolean quantityFieldValue() {
        int quantityFieldValue = Integer.parseInt(Hooks.driver.findElement(By.className("qty-input")).getAttribute("value"));
        int a = 0;
        if (quantityFieldValue > a) {
            return true;
        }

        return true;
    }
}
