package buitech.testing.company.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class News extends PageObject {

	@FindBy(xpath = "//*[@id='content']/div/div[1]/h1")
	WebElement newsTitle;

	public Object getPageTitle() {
		return newsTitle.getText().contains("News");
	}

	public void close_browser() {
		getDriver().quit();

	}

}
