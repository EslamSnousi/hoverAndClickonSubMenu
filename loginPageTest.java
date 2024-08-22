package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        System.out.println(driver.getTitle());

        Actions action = new Actions(driver);
        WebElement userIcon = driver.findElement(By.xpath("//span[contains(text(),'My account')]"));
        action.moveToElement(userIcon).perform();

        WebElement registerButton = driver.findElement(By.xpath("//span[contains(text(),'Register')]"));
        action.moveToElement(registerButton).click().build().perform();


        //exit
        //driver.quit();
    }
}
