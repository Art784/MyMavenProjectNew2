package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MyTest4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.muztorg.ru");


        WebElement webElement1 = driver.findElement(By.xpath("//div[@class='header__search j-header-search']//form[@id='all-pages-search-form']//input[@id='search-product-input']"));
        // WebElement webElement1 = driver.findElement(By.xpath("//div[@class='header__search j-header-search']//form[@id='all-pages-search-form']"));

        //WebElement webElement1 = driver.findElement(By.xpath("//div[@class='header__search j-header-search']"));

        //WebElement webElement1 = driver.findElement(By.id("//input[@id='search-product-input']"));
        webElement1.click();
        webElement1.sendKeys("Усилитель ламповый");
        WebElement webElement2 = driver.findElement(By.xpath("//button[@class='header__search-button']"));
        webElement2.click();
        //driver.quit();
    }
}
