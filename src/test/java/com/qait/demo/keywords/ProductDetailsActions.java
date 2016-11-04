package com.qait.demo.keywords;


import static com.qait.automation.utils.ConfigPropertyReader.getProperty;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;


public class ProductDetailsActions extends GetPage {

	WebDriver driver;
	//private EventFiringWebDriver e_driver;

	public ProductDetailsActions(WebDriver driver) {
		
		super(driver, "HomePage");
		this.driver = driver;

	}

	public void AddTheProductToCart() {
		
		element("Add_Cart_Button").click();
		if(ApplicatonToBeTested().equalsIgnoreCase("flipkart")){
			wait.hardWait(3);
			element("Go_To_Cart").click();
		  		}	
		
		
	}

	

	public void Add_Cart_Button_On_Product_detail_Page() {
		SwitchToWindow();
		isElementDisplayed("Add_Cart_Button");
		
	}

	public void Product_Details_Are_Visible() {
		isElementDisplayed("Product_Image_Large");
		isElementDisplayed("Product_Name");
	isElementDisplayed("Price");
	}
}
