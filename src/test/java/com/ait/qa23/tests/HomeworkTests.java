package com.ait.qa23.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

/* Создать новый тестовый класс и найти 10 элементов на странице.
Для этого создать два тестовых метода:
один будет искать элементы по cssSelector,
а второй те же самые элементы, но по xPath. */
public class HomeworkTests {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void homeworkCssTests() {
        driver.findElement(By.cssSelector("#flyout-cart"));
        driver.findElement(By.cssSelector("#mob-menu-button"));

        driver.findElement((By.cssSelector(".master-wrapper-page")));
        driver.findElement((By.cssSelector(".header-logo")));
        driver.findElement((By.cssSelector(".bar-notification")));

        driver.findElement(By.cssSelector("[method='get']"));
        driver.findElement(By.cssSelector("[title='Error']"));
        driver.findElement(By.cssSelector("[style='display:none;']"));

        driver.findElement(By.cssSelector("[href*='nopcommerce']"));

        driver.findElement(By.cssSelector("[type^='text']"));
    }

    @Test
    public void homeworkXPathTests(){
        driver.findElement(By.xpath("//*[@id='flyout-cart']"));
        driver.findElement(By.xpath("//*[@id='mob-menu-button']"));

        driver.findElement(By.xpath("//*[@class='master-wrapper-page']"));
        driver.findElement(By.xpath("//*[@class='header-logo']"));
        driver.findElement(By.xpath("//*[@class='bar-notification']"));

        driver.findElement(By.xpath("//*[contains(.,'get')]"));
        driver.findElement(By.xpath("//*[contains(.,'Error')]"));

        driver.findElement(By.xpath("//div[contains(@style,'display:none;')]"));
        driver.findElement(By.xpath("//a[contains(@href,'nopcommerce')]"));
        driver.findElement(By.xpath("//script[starts-with(@type,'text')]"));

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
