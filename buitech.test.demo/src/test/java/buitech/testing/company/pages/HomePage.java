package buitech.testing.company.pages;


import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://buitech.co.uk/")
public class HomePage extends PageObject {

@FindBy(xpath = "//*[@id='navigation']/div/ul/li[1]/a")
WebElement homepage;

@FindBy(xpath = "//*[@id='navigation']/div/ul/li[2]/a")
WebElement testingServices;

@FindBy(xpath = "//*[@id='navigation']/div/ul/li[3]/a")
WebElement testingSolutions;

@FindBy(xpath = "//*[@id='navigation']/div/ul/li[4]/a")
WebElement resources;

@FindBy(xpath = "//*[@id='navigation']/div/ul/li[5]")
WebElement clients;

@FindBy(xpath = "//*[@id='navigation']/div/ul/li[6]")
WebElement news;
 
	public void navigation(String Element) {
		testingServices.click();
		testingSolutions.click();
		resources.click();
		clients.click();
		news.click();
		
	}

	
}
