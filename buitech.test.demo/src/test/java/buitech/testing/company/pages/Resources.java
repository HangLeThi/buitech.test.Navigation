package buitech.testing.company.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Resources extends PageObject {

	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement resourcesTitle;

	public Object getPageTitle() {
		return resourcesTitle.getText().contains("Resources");
	}

	public void close_browser() {
		getDriver().quit();

	}

}
