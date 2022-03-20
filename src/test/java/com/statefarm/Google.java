package com.statefarm;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Google {
   @Test
        public void googleTest() throws InterruptedException{
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://accounts.google.com/signin/v2/identifier?service=wise&passive=1209600&continue=https%3A%2F%2Fdocs.google.com%2Fspreadsheets%2F%3Fusp%3Dsheets_alc&followup=https%3A%2F%2Fdocs.google.com%2Fspreadsheets%2F%3Fusp%3Dsheets_alc&ltmpl=sheets&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
            driver.manage().window().maximize();
            driver.findElement(By.id("identifierId")).sendKeys("Admin123@gmail.com");
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("admin123");


    }
}
