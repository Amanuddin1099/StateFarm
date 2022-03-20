package com.statefarm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PayaBill {
    @Test
    public void payaBillTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.statefarm.com/");
        driver.manage().window().maximize();
        WebElement pay= driver.findElement(By.cssSelector("#oneX-header > nav > section.-oneX-header-nav-apps-container > div.-oneX-header-nav-container > div.-oneX-header-main-nav > ul > li:nth-child(5) > div > button"));
        Actions actions = new Actions(driver);
        actions.doubleClick(pay).build().perform();
        driver.findElement(By.id("pay-a-bill-paymentSelect")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.findElement(By.linkText("Key Code")).click();


    }

}
