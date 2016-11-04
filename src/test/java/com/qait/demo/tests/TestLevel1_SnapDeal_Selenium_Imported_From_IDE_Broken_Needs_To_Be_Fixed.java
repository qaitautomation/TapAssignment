/**
* This is a sample test recorded in selenium ide and exported to eclipse
* Step 1 : Open snapdeal.com
* Step 2 : Search A product - Mobile
* Step 3 : Select First Product
* Step 4 : Add the product to cart
* Step 5 : Verify the product has been added to cart
* 
* Task : You have to fix this test and run it.
*/



package com.qait.demo.tests;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestLevel1_SnapDeal_Selenium_Imported_From_IDE_Broken_Needs_To_Be_Fixed {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
System.setProperty("webdriver.chrome.driver","chromedriver.exe");	  
    driver = new ChromeDriver();
    baseUrl = "https://www.snapdeal.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
    driver.manage().window().maximize();
  }

  @Test
  public void testECommerceSite() throws Exception {
    driver.get(baseUrl + "/");
    driver.findElement(By.id("inputValEnter")).click();
    driver.findElement(By.id("inputValEnter")).clear();
    driver.findElement(By.id("inputValEnter")).sendKeys("mobile");
    driver.findElement(By.xpath("//button[@onclick=\"submitSearchForm('go_header');\"]")).click();
    driver.findElement(By.xpath("(//img[contains(@class,'product-image')])[1]")).click();
    String MaintabTitle=driver.getTitle();
    
    for(String handles:driver.getWindowHandles())
    {
    	driver.switchTo().window(handles);
    	if(driver.getTitle().equals(MaintabTitle)!=true)
    	{
    		break;
    	}
    	
    }
   driver.findElement(By.xpath("//div[@id='add-cart-button-id']")).click();   
   String number=driver.findElement(By.cssSelector(".count")).getText(); 
   Assert.assertTrue(number.equals("1 Item"));
   
   driver.findElement(By.linkText(("Proceed To Checkout").toUpperCase())).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
