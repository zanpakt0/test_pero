package com.example.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// page_url = https://vk.com/club225299895?w=product-225299895_10044406
public class ProductPage {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public ProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @FindBy(css = ".ItemCardLayout__right .vkuiButtonGroup button")
    WebElement writeButton;

    public void clickWriteButton() {
        wait.until(ExpectedConditions.visibilityOf(writeButton)).click();
    }
}
