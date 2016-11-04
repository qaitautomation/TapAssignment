package com.qait.demo.keywords;

import static com.qait.automation.utils.YamlReader.getYamlValue;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;
import com.qait.automation.utils.YamlReader;
import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.Wait.WaitTimedOutException;

public class CartPageActions extends GetPage {

	WebDriver driver;
	private EventFiringWebDriver e_driver;

	public CartPageActions(WebDriver driver) {
		super(driver, "HomePage");
		this.driver = driver;

	}

	public void verifyCart() {
		
		
		//String number=element("Item_In_Cart").getText();
		wait.hardWait(3);
		 Assert.assertTrue(isElementDisplayed("Item_In_Cart"));
	
		
	}

	public void Is_On_Cart_Page() {
		if(this.ApplicatonToBeTested().equalsIgnoreCase("flipkart"))
		{   
			Assert.assertTrue(getCurrentURL().contains(getYamlValue("cartURL")));
			
		  	}		
		else{
	   
		     Assert.assertTrue(getCurrentURL().contains(getYamlValue("cartURL")));
		}
		
	}

	public void VerifyDeatilsOnCartPage() {
		isElementDisplayed("Product_Name_On_Cart_Page");
		wait.hardWait(2);
		isElementDisplayed("Product_Price_On_Cart_Page");
		
	}

	public void placeOrder() {
	
		element("Place_Order").click();
		if(this.ApplicatonToBeTested().equalsIgnoreCase("flipkart"))
		{   
			Assert.assertTrue(getCurrentURL().contains(getYamlValue("checkoutURL")));
			
		  	}		
		else{
	   
		     Assert.assertTrue(getCurrentURL().contains(getYamlValue("checkoutURL")));
		}
		
		
	}

}
