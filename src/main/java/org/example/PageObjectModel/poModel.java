package org.example.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;


import org.testng.annotations.Test;

public class poModel extends base {
    @Test
    public void signUpBtn() {
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        pageObject pageObject=new pageObject(driver);
        pageObject.clickSignUpBtn("signup");
       // driver.findElement(By.id("signup")).click();
        pageObject.insertFirstName("saida");
       // driver.findElement(By.id("firstName")).sendKeys("saida");
        pageObject.insertLastName("saida123");
       // driver.findElement(By.id("lastName")).sendKeys("saida123");
        pageObject.email("saida123@yahoo.com");
        //driver.findElement(By.id("email")).sendKeys("saida123@yahoo.com");
        pageObject.insertPaswor("saida123");
       // driver.findElement(By.id("password")).sendKeys("saida123");
        pageObject.clickSubmit("submit");
        //driver.findElement(By.id("submit")).click();

    }
   @Test
   public void addNewContactBtn(){
        addNewContact addNewContact=new addNewContact(driver);
        driver.get("https://thinking-tester-contact-list.herokuapp.com/contactList");
        addNewContact.clickAddContactBtn("add-contact");
        //driver.findElement(By.id("add-contact")).click();
       addNewContact.insertName("saida");
       // driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("saida");
       addNewContact.insertLastName("saidA");
       // driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("saidA");
       addNewContact.insertBrthDate("01/01/00");
       // driver.findElement(By.id("birthdate")).sendKeys("01/01/00");
       addNewContact.email("saida123@yahoo.com");
       // driver.findElement(By.xpath("//input[@placeholder='example@email.com']")).sendKeys("saida123@yahoo.com");
       addNewContact.enterPhoneNumber("2121212121");
        //driver.findElement(By.id("phone")).sendKeys("2121212121");
       addNewContact.enterAdress("trump rd");
        //driver.findElement(By.xpath("//input[@placeholder='Address 1']")).sendKeys("trump rd");
       addNewContact.enterCity("brooklyn");
       // driver.findElement(By.cssSelector("#city")).sendKeys("brooklyn");
       addNewContact.enterState("brooklyn");
       // driver.findElement(By.id("stateProvince")).sendKeys("brooklyn");
       addNewContact.enterPostalCode("123456");
       // driver.findElement(By.xpath("//input[@id='postalCode']")).sendKeys("123456");
       addNewContact.enterCountry("USS");
       //driver.findElement(By.xpath("//input[@placeholder='Country']")).sendKeys("USS");
       addNewContact.clickSubmitBtn();
       // driver.findElement(By.id("submit")).click();
    }


}



