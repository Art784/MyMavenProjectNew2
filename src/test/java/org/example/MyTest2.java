package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MyTest2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.get("https://www.muztorg.ru");
        WebElement webElement1 = driver.findElement(By.xpath("//div[@class='catalog-menu__i ']//a[@href='/category/gitary']"));
        webElement1.click();
        WebElement webElement2 = driver.findElement(By.xpath("//li//a[@href='/category/elektrogitary']"));
        //WebElement webElement2 = driver.findElement(By.xpath("//div[@class='catalog-menu__category']//a[@href='/category/elektrogitary']"));
        webElement2.click();
        WebElement webElement3 = driver.findElement(By.xpath("//div[@class='catalog-filter__container _brands']//a[@class='catalog-filter__more js-cf-more']//span[@class='js-cf-more-txt']"));
        webElement3.click();
        WebElement webElement4 = driver.findElement(By.xpath("//label[contains(.,' GIBSON ')]"));
        //WebElement webElement4 = driver.findElement(By.id("//input[@id='checkbox-gibson1']"));
        webElement4.click();
        WebElement webElement5 = driver.findElement(By.xpath("//div[@class='catalog-filter__button']//button[@class='button button-blue']"));
        webElement5.click();
        WebElement webElement6 = driver.findElement(By.xpath("//label[contains(.,' sg ')]"));
        webElement6.click();
        WebElement webElement7 = driver.findElement(By.xpath("//div[@class= 'catalog-filter__ear']//button[@class='button button-blue']"));
        webElement7.click();
        //driver.quit();
    }
}
