package com.statefarm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Motorcycle {
    @Test
    public void motorcycleTest(){
         WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.statefarm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#oneX-header > nav > section.-oneX-header-nav-apps-container > div.-oneX-header-nav-container > div.-oneX-header-main-nav > ul > li:nth-child(1) > div > button")).click();
        driver.findElement(By.cssSelector("#oneX-submenu-insurance > div > div > div:nth-child(1) > section > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.id("callout-agent-zip-code-input1")).sendKeys("10002");
        driver.findElement(By.id("quote-main-zip-code-button1")).click();
        driver.close();


    }
}
