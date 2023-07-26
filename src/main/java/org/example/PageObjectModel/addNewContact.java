package org.example.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class addNewContact {


        WebDriver driver;
    By addcontactbox= By.id("add-contact");
    By firstnamebox=  By.xpath("//input[@placeholder='First Name']");
    By lastnamebox= By.xpath("//input[@placeholder='Last Name']");
    By dateofbirth= By.id("birthdate");
    By emailbox= By.xpath("//input[@placeholder='example@email.com']");
    By phonenmbr=By.id("phone");
    By adress=By.xpath("//input[@placeholder='Address 1']");
    By city=By.cssSelector("#city");
    By state= By.id("stateProvince");
    By postalcode= By.xpath("//input[@id='postalCode']");
    By country= By.xpath("//input[@placeholder='Country']");



    public addNewContact(WebDriver driver){
        this.driver=driver;


    }
  @Test
  public void clickAddContactBtn(String id){
      driver.findElement(By.id("addcontactbox")).click();
  }
  @Test
  public  void insertName(String name){
      driver.findElement(By.xpath("firstnamebox")).sendKeys("saida");
    }
    @Test
    public void insertLastName(String lastname){
        driver.findElement(By.xpath("lastnamebox")).sendKeys("saidA");

    }
   @Test
   public void insertBrthDate(String birthdate){
        driver.findElement(By.id("dateofbirth")).sendKeys("01/01/21");
    }
    @Test
    public  void email(String email){
        driver.findElement(By.xpath("emailbox")).sendKeys("saida123@yahoo.com");
    }
    @Test
    public void enterPhoneNumber(String phoneNumber){
        driver.findElement(By.id("phonenmbr")).sendKeys("2121212121");

    }
   @Test
   public void enterAdress(String adress){
        driver.findElement(By.xpath(" adress")).sendKeys("trump rd");

    }
    @Test
    public  void enterCity(String city){
        driver.findElement(By.cssSelector("city")).sendKeys("brooklyn");
    }
    @Test
    public  void enterState(String state){

    }
    @Test
    public  void enterPostalCode(String postalCode){
        driver.findElement(By.xpath("postalcode")).sendKeys("123456");
    }
   @Test
   public  void enterCountry(String country){
        driver.findElement(By.xpath("country")).sendKeys("USS");
    }
   @Test
   public void clickSubmitBtn(){
        driver.findElement(By.id("submitbox")).click();
    }
}
