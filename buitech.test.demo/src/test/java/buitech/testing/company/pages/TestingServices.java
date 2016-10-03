package buitech.testing.company.pages;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class TestingServices extends PageObject {

	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement TestingServicesTitle;

	public Object getPageTitle() {
		return TestingServicesTitle.getText().contains("Testing Services");
	}

	public void close_browser() {
		getDriver().quit();

	}

}
