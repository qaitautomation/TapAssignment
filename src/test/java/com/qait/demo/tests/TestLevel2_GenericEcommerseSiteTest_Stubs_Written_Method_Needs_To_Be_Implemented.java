/**
* This is a sample test 
* Step 1 : Open snapdeal.com/amazon.com/flipcart.com
* Step 2 : Search A product - Mobile
* Step 3 : Select First Product
* Step 4 : Add the product to cart
* Step 5 : Verify the product has been added to cart
* 
* Task : Stubs are already written , you have to implement them and run this test
*/

package com.qait.demo.tests;

import static com.qait.automation.utils.YamlReader.getYamlValue;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.qait.automation.TestSessionInitiator;

public class TestLevel2_GenericEcommerseSiteTest_Stubs_Written_Method_Needs_To_Be_Implemented {

	TestSessionInitiator test;
	String baseUrl;

	@BeforeClass
	public void Start_Test_Session() {
		test = new TestSessionInitiator(this.getClass().getSimpleName());
		initVars();
		test.launchApplication(this.baseUrl);
	}

	@BeforeMethod
	public void handleTestMethodName(Method method) {
		test.stepStartMessage(method.getName());
	}

	private void initVars() {
		baseUrl = getYamlValue("baseUrl");
	}
	
	@Test public void Verify_User_is_able_to_land_On_Homepage()
	{
		test.homePage.Is_On_homePage();
		
	}
	
	@Test(dependsOnMethods = { "Verify_User_is_able_to_land_On_Homepage" }) 
	public void Verify_User_Is_able_To_See_Suggestionbox_On_typing()
	{
		
		test.homePage.Is_Suggestion_Box_Displaying(getYamlValue("productName"));
	}
	
	
	@Test(dependsOnMethods = { "Verify_User_Is_able_To_See_Suggestionbox_On_typing" })
	public void Verify_Suggestions_Have_search_Term()
	{
		test.homePage.Is_Suggestion_Box_Showing_Correct_Suggestions(getYamlValue("productName"));
		
	} 
	
	
	
	@Test(dependsOnMethods = { "Verify_Suggestions_Have_search_Term" })
	public void TestStep1_SearchProduct() throws InterruptedException{
		test.homePage.enterProductName(getYamlValue("productName"));
		test.homePage.clickSearchIcon();
		
	}
	
	@Test(dependsOnMethods = { "TestStep1_SearchProduct" })
	public void User_Is_able_To_Land_On_Result_Page()
	{
		test.resultPage.Is_On_Result_Page(getYamlValue("productName"));
		
	}
	
	@Test(dependsOnMethods = { "User_Is_able_To_Land_On_Result_Page" })
	public void Images_are_Displayed()
	{
		test.resultPage.Is_Image_Displaying();
	}
	 
	@Test(dependsOnMethods = { "Images_are_Displayed" })
	public void TestStep2_VerifySearchResult(){
		
		test.resultPage.verifyResults(getYamlValue("productName"));
	}
	
	
	@Test(dependsOnMethods = { "TestStep2_VerifySearchResult"})
	public void TestStep3_SelectFirstProduct(){
		test.resultPage.clickFirstProduct();
		
	}
	@Test(dependsOnMethods = { "TestStep3_SelectFirstProduct"})
	public void Verify_User_Is_Able_To_View_Add_Cart_button()
	{
		test.productDetailsPage.Add_Cart_Button_On_Product_detail_Page();
		
	}
	 
	@Test(dependsOnMethods = { "Verify_User_Is_Able_To_View_Add_Cart_button"})
	public void product_deatils_are_visible()
	{
		
		test.productDetailsPage.Product_Details_Are_Visible();
	}
	
	
	
	
	@Test(dependsOnMethods = { "product_deatils_are_visible"})
	public void TestStep4_AddProductToCart(){
		test.productDetailsPage.AddTheProductToCart();
	}
	
	@Test(dependsOnMethods = { "TestStep4_AddProductToCart"})
	public void User_Is_Able_To_Cart_Page()
	{
		test.cartPage.Is_On_Cart_Page();
	} 
	
	@Test(dependsOnMethods={ "User_Is_Able_To_Cart_Page"})
	public void User_Is_Able_To_See_Product_Deatils_On_Cart_Page()
	{
	  	test.cartPage.VerifyDeatilsOnCartPage();
		
	}
	
	@Test(dependsOnMethods={ "User_Is_Able_To_See_Product_Deatils_On_Cart_Page"})
	public void TestStep5_VerifyCart(){
		test.cartPage.verifyCart();
	}
	@Test(dependsOnMethods={ "TestStep5_VerifyCart"})
	public void User_Is_Able_To_Navigate_To_Checkout_Page()
	{
		test.cartPage.placeOrder();
		
	}
	
	@AfterMethod
	public void take_screenshot_on_failure(ITestResult result) {
		test.takescreenshot.takeScreenShotOnException(result);
	}

	@AfterClass
	public void close_Test_Session() {
		test.closeBrowserSession();
	}
  
 	
	
}
