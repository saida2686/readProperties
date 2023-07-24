package org.example.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageObject {
    WebDriver driver;
    //loctors
  protected   By id=By.id("signup");
  protected By firstname=By.id("firstName");
    protected By lastname=By.id("lastName");
   protected By email=By.id("email");
   protected By password=By.id("password");
   protected By submitBtn=By.id("submit");
    public pageObject(WebDriver driver){
        this.driver=driver;

    }

    //Actions
    public void clickSignUpBtn(String str){
        driver.findElement(By.id("signup")).click();

    }
    public void insertFirstName(String id){
        driver.findElement(By.id("firstName")).sendKeys("saida");
    }
    public void insertLastName(String id){
       driver.findElement(By.id("lastName")).sendKeys("saida123");

    }
    public  void email(String id){
        driver.findElement(By.id("email")).sendKeys("saida123@yahoo.com");

    }
    public void insertPaswor(String id){
        driver.findElement(By.id("password")).sendKeys("saida123");

    }
    public  void clickSubmit(String id){
        driver.findElement(By.id("submit")).click();

    }


}
