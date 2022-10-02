package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginLink(){
        WebElement loginLink = Hooks.driver.findElement(By.className("ico-login"));
        return loginLink;
    }

    public WebElement emailField(){
        WebElement emailField = Hooks.driver.findElement(By.className("email"));
        return emailField;
    }

    public WebElement passwordField() {
        WebElement passwordField = Hooks.driver.findElement(By.className("password"));
        return passwordField;
    }

    public WebElement loginButton() {
        WebElement loginButton = Hooks.driver.findElement(By.className("button-1 login-button"));
        return loginButton;
    }

    public String loginURL() {
        String loginURL = String.valueOf(Hooks.driver.getCurrentUrl());
        return loginURL;
    }

    public WebElement myAccountLink() {
        WebElement myAccountLink = Hooks.driver.findElement(By.className("ico-account"));
        return myAccountLink;
    }

    public String unsuccessfulLoginMsg() {
        String invalidMsg = Hooks.driver.findElement(By.className("message-error validation-summary-errors")).getText();
        return invalidMsg;
    }

    public String unsuccessfulMsgColor(){
        String Color = Hooks.driver.findElement(By.className("message-error validation-summary-errors")).getCssValue("color");
        return Color;
    }
}
