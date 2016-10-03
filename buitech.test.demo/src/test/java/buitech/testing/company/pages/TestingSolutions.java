package buitech.testing.company.pages;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class TestingSolutions extends PageObject {
	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement testingSolutionsTitle;

	public Object getPageTitle() {
		return testingSolutionsTitle.getText().contains("Testing Solutions");
	}

	public void close_browser() {
		getDriver().quit();

	}

}
