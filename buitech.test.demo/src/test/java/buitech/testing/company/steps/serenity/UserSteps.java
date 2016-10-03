package buitech.testing.company.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;
import buitech.testing.company.pages.Clients;
import buitech.testing.company.pages.HomePage;
import buitech.testing.company.pages.News;
import buitech.testing.company.pages.Resources;
import buitech.testing.company.pages.TestingServices;
import buitech.testing.company.pages.TestingSolutions;

public class UserSteps extends ScenarioSteps {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	HomePage homePage;
	TestingServices testingServices;
	TestingSolutions testingSolutions;
	Resources resources;
	Clients clients;
	News news;

	public void open_home_page() {
		homePage.open();

	}
	
	public void maximize_browser() {
		getDriver().manage().window().maximize();

	}
	
	public void click_on_menu_link(String Element) {
		homePage.navigation(Element);
		
	}
	
	public void page_displays_title(String Title) {
		Assert.assertEquals(Title,testingServices.getPageTitle());
		Assert.assertEquals(Title,testingSolutions.getPageTitle());
		Assert.assertEquals(Title,resources.getPageTitle());
		Assert.assertEquals(Title,clients.getPageTitle());
		Assert.assertEquals(Title,news.getPageTitle());
		
	}

	public void closeBrowser() {
		getDriver().quit();

	}

	
}
