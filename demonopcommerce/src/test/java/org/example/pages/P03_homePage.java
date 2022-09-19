package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
}
