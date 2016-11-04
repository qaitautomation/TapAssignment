package com.qait.demo.keywords;



import static com.qait.automation.utils.YamlReader.getYamlValue;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.qait.automation.getpageobjects.GetPage;
import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class ResultsPageActions extends GetPage {
	
	WebDriver driver;

    public ResultsPageActions(WebDriver driver) {
        super(driver, "ResultsPage");
        this.driver = driver;
    }

	
	public void verifySearchResults(String resultText) {
		isElementDisplayed("area_searchResult");
		Assert.assertTrue(element("txt_resultCount",resultText).isDisplayed(), "Result count section is not present");
		logMessage("Search Results successfully displayed");
	}
	
	
	public void getResponseCode(String url){
		logMessage("Status Code for the URL '"+url+"' :- "+ apiTester.getStatusCodeOfTheService(url));
	}

	public void getHeaders(String url){
		Map<String, List<String>> map = apiTester.getAllHeaderFields(url);
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			logMessage("Map value:- "+it.next());
		}
	}


	public void clickFirstProduct() {
		element("product_image","1").click();		
			
	}


	public void verifyResults(String yamlValue) {
		if(this.ApplicatonToBeTested().equalsIgnoreCase("flipkart"))
		{
			wait.hardWait(3);
			Assert.assertTrue(this.isElementDisplayed("search_keyword_on_result_page",yamlValue.toLowerCase()));
		  	}		
		else{
	   Assert.assertTrue(this.isElementDisplayed("search_keyword_on_result_page",yamlValue));
	   int number_of_Results=Integer.valueOf(element("number_of_search_results").getText());
	   Assert.assertTrue(number_of_Results>=1);	
		
		}
		
		
	}


	public void Is_result_Page_Visible() {
		
		driver.getCurrentUrl().contains(getYamlValue("baseUrl")+"search?");
	}


	public void Is_On_Result_Page(String value) {
		//Assert.assertTrue(this.getCurrentURL().contains(value.toLowerCase()));
	 wait.waitForElementToBeVisible(element("Heading_on_Result_Page"));
		isElementDisplayed("Heading_on_Result_Page",value);	
	}


	public void Is_Image_Displaying() {
	 isElementDisplayed("images");
	
	}
	
	
    
    
}
