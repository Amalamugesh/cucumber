package org.stepdenifinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinitions {
	WebDriver driver;
	
	@Given("^Enter the Adactin url in Search bar and enter$")
	public void enter_the_Adactin_url_in_Search_bar_and_enter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.adactinhotelapp.com/");
	}

	@When("^Enter the valid user name and password$")
	public void enter_the_valid_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     WebElement user = driver.findElement(By.id("username"));
	     user.sendKeys("amalamugesh");
	     WebElement pass = driver.findElement(By.id("password"));
	     pass.sendKeys("Kebalevijo@007");
	}

	@When("^user enter the login button$")
	public void user_enter_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	     driver.findElement(By.id("login")).click();
	}

	@Then("^it should be shown the Hotel search page$")
	public void it_should_be_shown_the_Hotel_search_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

         WebElement element = driver.findElement(By.xpath("(//*[contains(text(),'Search')])[3]"));
         
         Assert.assertEquals("to verify the Search hotel", element, "Search");
         driver.quit();
         driver.close();
         
	}
	

	
}
