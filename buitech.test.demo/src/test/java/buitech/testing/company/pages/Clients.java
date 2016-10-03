package buitech.testing.company.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Clients extends PageObject {

	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement clientsTitle;

	public Object getPageTitle() {
		return clientsTitle.getText();
	}

	public void close_Browser() {
		getDriver().quit();

	}
}
