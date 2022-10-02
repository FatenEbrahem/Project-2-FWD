package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P01_register extends Hooks{

    public WebElement registerLink(){
        WebElement reg = Hooks.driver.findElement(By.className("ico-register"));
        return reg;
    }

    public WebElement genderType(){
        WebElement maleGenderType = Hooks.driver.findElement(By.id("gender-male"));
        return maleGenderType;
    }

    public WebElement firstNameField(){
        WebElement firstName = Hooks.driver.findElement(By.id("FirstName"));
        return firstName;
    }

    public WebElement lastNameField(){
        WebElement lastName = Hooks.driver.findElement(By.id("LastName"));
        return lastName;
    }

    public WebElement dayDateField() {
        WebElement dayField = Hooks.driver.findElement(By.cssSelector("[name=DateOfBirthDay]"));
        return dayField;
    }


    public WebElement monthDateField(){
        WebElement monthField = Hooks.driver.findElement(By.className("[name=DateOfBirthMonth]"));
        return monthField;
    }

    public WebElement yearDateField(){
        WebElement yearField = Hooks.driver.findElement(By.className("[name=DateOfBirthYear]"));
        return yearField;
    }

    public WebElement emailField(){
        WebElement emailField = Hooks.driver.findElement(By.id("Email"));
        return emailField;
    }

    public WebElement passwordField(){
        WebElement passwordField = Hooks.driver.findElement(By.id("Password"));
        return passwordField;
    }

    public WebElement confirmPasswordField(){
        WebElement confirmPasswordField = Hooks.driver.findElement(By.id("ConfirmPassword"));
        return confirmPasswordField;
    }

    public WebElement registerButton(){
        WebElement registerButton = Hooks.driver.findElement(By.id("register-button"));
        return registerButton;
    }

    public WebElement successMsg(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("result")));
        WebElement successMsg = Hooks.driver.findElement(By.className("result"));
        return successMsg;
    }

    public String successMsgColor(){
        String Color = driver.findElement(By.className("result")).getCssValue("color");
        return Color;
    }


}
