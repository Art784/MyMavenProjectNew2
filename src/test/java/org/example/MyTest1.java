package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class MyTest1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.muztorg.ru");
        WebElement webElement1 = driver.findElement(By.xpath("//a[contains(.,'Войти')]"));
        // WebElement webElement1 = driver.findElement(By.xpath("//li[@class='topbar__menu-item_notable']"));
        //WebElement webElement1 = driver.findElement(By.name("Войти"));
        //WebElement webElement1 = driver.findElement(By.xpath("//a[@href='/site/get-login-form' and contains(text()='Войти')]"));
        //WebElement webElement1 = driver.findElement(By.xpath("//a[@href='/site/get-login-form' and contains(@class,'topbar__menu _auth')]"));
        webElement1.click();
        //WebElement webElement1= driver.findElement(By.xpath("//a[@href='/shops']"));
        //webElement1.click();
        WebDriverWait webDriverWait = new WebDriverWait(driver, 15);
        // final WebElement until = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.id("login-by-pass_phone-or-email-input")));
        WebElement webElement2 = driver.findElement(By.xpath("//div[@class='modal-content']//div[@class='login__i form-field-phone-or-email']//input[@class='login__input']"));
        //WebElement webElement2 = driver.findElement(By.xpath("//div[@class='login__i form-field-phone-or-email']//input[@class='login__input']"));
        // WebDriverWait webDriverWait = new WebDriverWait(driver,10);
        // WebElement webElement2;// Это рабочий вариант, но нестабильный
        //webElement2 = driver.findElement(By.id("login-by-pass_phone-or-email-input"));
        //WebElement webElement2 = driver.findElement(By.name("//input[@name='LoginForm[login]'"));
        webElement2.click();
        webElement2.sendKeys("ap2566430@gmail.com");
        //WebElement webElement2 = driver.findElement(By.cssSelector("a[href='/site/get-login-form']"));
        //webElement2.click();
        WebElement webElement3 = driver.findElement(By.id("login-by-pass_password-input"));
        webElement3.click();
        webElement3.sendKeys("parolparol");

        WebElement webElement4 = driver.findElement(By.id("login-by-pass_submit-btn"));
        webElement4.click();

        //Это код для 2 го тест-кейса!!!
        //WebElement webElement5 = driver.findElement(By.xpath("//a[@href='/category/gitary' and contains(text(),'Гитары')]"));
        // webElement5.click();
        //driver.quit();
    }
}
