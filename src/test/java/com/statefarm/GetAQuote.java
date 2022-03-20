package com.statefarm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class GetAQuote {
    @Test
    public void getaQuoteTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.statefarm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("quote-main-zip-code-input")).sendKeys("10002");
        WebElement startaquotebtn = driver.findElement(By.id("quote-main-zip-btn"));
        Actions actions = new Actions(driver);
        actions.doubleClick(startaquotebtn).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("first_name")).sendKeys("Minhaz");
        driver.findElement(By.id("last_name")).sendKeys("Khan");
        driver.findElement(By.id("street1")).sendKeys("343 Grand St");
        driver.findElement(By.id("date_of_birth")).sendKeys("01012001");
//        Thread.sleep(5000);
//        WebElement next = driver.findElement(By.id("btnContinue"));
//        Actions a = new Actions(driver);
//        actions.doubleClick(next).build().perform();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.id("btnContinue")).click();
//





}}
