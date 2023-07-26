package org.example.reading_file;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//can we use testNG with property file?
//explicit and implicit wait time initiation


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


public class readProperties {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.driver.chromedriver", "/Users/saida/Documents/drivers/chromedriver");
       driver= new ChromeDriver();
        Properties prop = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/main/java/org/example/reading_file/properties/application_properties");
        prop.load(fileInputStream);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get(prop.getProperty("url"));
       driver.findElement(By.xpath(prop.getProperty("sign-in"))).click();
       driver.findElement(By.xpath(prop.getProperty("account"))).click();
       driver.findElement(By.xpath(prop.getProperty("firstnamebox"))).sendKeys("saida0000");
       driver.findElement(By.xpath(prop.getProperty("nextbox"))).click();





        }



    }











