package org.example.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class pageObject {
    WebDriver driver;
    //loctors
  By signupBox=By.id("signup");
 By firstnameBox=By.id("firstName");
    By lastnameBox=By.id("lastName");
   By emailadres=By.id("email");
    By passwordBox=By.id("password");
    By submitBtn=By.id("submit");
    public pageObject(WebDriver driver){
        this.driver=driver;

    }

    //Actions
    public void clickSignUpBtn(String click){
        driver.findElement(By.id("signupBox")).click();

    }
    @Test
    public void insertFirstName(String name){
        driver.findElement(By.id("firstnameBox")).sendKeys("saida");
    }
    @Test
    public void insertLastName(String lastName){
       driver.findElement(By.id("lastnameBox")).sendKeys("saida123");

    }
    @Test
    public  void email(String email){
        driver.findElement(By.id("emailadres")).sendKeys("saida123@yahoo.com");

    }
   @Test
   public void insertPasword(String password){
        driver.findElement(By.id("passwordBox")).sendKeys("saida123");

    }
    public  void clickSubmit(String id){
        driver.findElement(By.id("submitBtn")).click();

    }


}
