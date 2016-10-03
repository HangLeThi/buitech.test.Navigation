package buitech.testing.company.steps.serenity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;
import net.thucydides.core.annotations.Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import buitech.testing.company.pages.Clients;
import buitech.testing.company.pages.News;
import buitech.testing.company.pages.Resources;
import buitech.testing.company.pages.TestingServices;
import buitech.testing.company.pages.TestingSolutions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DifinitionScenarioSteps {
		
	@Steps
	UserSteps userSteps;
	
	TestingServices testingServices;

	TestingSolutions testingSolutions;
	
	Resources resources;
	
	Clients clients;

	News news;
	
	@Given("^I am on  buitech website$")
	public void i_am_on_buitech_website() throws Throwable {
	   		userSteps.open_home_page();
		
	    }

	@Given("^maximize the browser$")
	public void maximize_the_browser() throws Throwable {
	   	userSteps.maximize_browser();
	}

	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String Element) throws Throwable {
		userSteps.click_on_menu_link(Element);
		/*userSteps.click_On_Testing_Services(Link);
		userSteps.click_on_Testing_Solutions(Link);
		userSteps.click_on_Resources(Link);
		userSteps.click_on_Clients(Link);
		userSteps.click_on_News(Link);*/
	
	}

	@When("^the page is display with \"([^\"]*)\"$")
	public void the_page_is_display_with(String Title) throws Throwable {
		userSteps.page_displays_title(Title);
		
	}

	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
		userSteps.closeBrowser();
		
	}



}
