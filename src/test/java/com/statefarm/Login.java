package com.statefarm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {

    @Test
    public void loginTest() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.statefarm.com/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("#oneX-header > nav > section.-oneX-header-nav-apps-container > div.-oneX-header-nav-container > div.-oneX-header-login-nav > div > div > button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("oneX-username")).sendKeys("Admin123@gmail.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("util-login-password")).sendKeys("Admin123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.cssSelector("#oneX-submenu-login > div > div > div.-oneX-col-12.-oneX-col-lg-6.-oneX-first-col > form > div > button")).click();


    }
}
