package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homework6Tests {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public void homeworkCssTests() {
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        driver.findElement(By.cssSelector("#bar-notification"));

        driver.findElement((By.cssSelector(".close")));
        driver.findElement((By.cssSelector(".master-wrapper-page")));
        driver.findElement((By.cssSelector(".master-wrapper-content")));

        driver.findElement(By.cssSelector("[action='/search']"));
        driver.findElement(By.cssSelector("[onsubmit='return check_small_search_form()']"));
        driver.findElement(By.cssSelector("[aria-live='polite']"));

        driver.findElement(By.cssSelector("[autocomplete*='off']"));

        driver.findElement(By.cssSelector("[div^='You have no']"));
    }

    @Test
    public void homeworkXPathTests(){
        driver.findElement(By.xpath("//*[@id='dialog-notifications-success']"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));

        driver.findElement(By.xpath("//*[@class='close']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-content']"));

        driver.findElement(By.xpath("//*[contains(.,'/search')]"));
        driver.findElement(By.xpath("//form[contains(@onsubmit,'return check_small_search_form()')]"));

        driver.findElement(By.xpath("//span[contains(@aria-live,'polite')]"));
        driver.findElement(By.xpath("//input[contains(@autocomplete,'off')]"));
        driver.findElement(By.xpath("//div[contains(text(),'You')]"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
