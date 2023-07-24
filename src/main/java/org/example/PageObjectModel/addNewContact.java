package org.example.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class addNewContact {


        WebDriver driver;



    public addNewContact(WebDriver driver){
        this.driver=driver;
        By.id("add-contact");
        By.xpath("//input[@placeholder='First Name']");
        By.xpath("//input[@placeholder='Last Name']");
        By.id("birthdate");
        By.xpath("//input[@placeholder='example@email.com']");
        By.id("phone");
        By.xpath("//input[@placeholder='Address 1']");
        By.cssSelector("#city");
        By.id("stateProvince");
        By.xpath("//input[@id='postalCode']");
        By.xpath("//input[@placeholder='Country']");
        By.id("submit");

    }
  public void clickAddContactBtn(String id){
      driver.findElement(By.id("add-contact")).click();
  }
  public  void insertName(String id){
      driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("saida");
    }
    public void insertLastName(String id){
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("saidA");

    }
    public void insertBrthDate(String id){
        driver.findElement(By.id("birthdate")).sendKeys("01/01/21");
    }
    public  void email(String str){
        driver.findElement(By.xpath("//input[@placeholder='example@email.com']")).sendKeys("saida123@yahoo.com");
    }
    public void enterPhoneNumber(String str){
        driver.findElement(By.id("phone")).sendKeys("2121212121");

    }
    public void enterAdress(String str){
        driver.findElement(By.xpath("//input[@placeholder='Address 1']")).sendKeys("trump rd");

    }
    public  void enterCity(String str){
        driver.findElement(By.cssSelector("#city")).sendKeys("brooklyn");
    }
    public  void enterState(String str){

    }
    public  void enterPostalCode(String str){
        driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("123456");
    }
    public  void enterCountry(String ster){
        driver.findElement(By.xpath("//input[@placeholder='Country']")).sendKeys("USS");
    }
    public void clickSubmitBtn(){
        driver.findElement(By.id("submit")).click();
    }
}
