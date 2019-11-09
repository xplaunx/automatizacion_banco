package co.com.banco.prueba.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.banco.prueba.pages.HomePage;
import co.com.banco.prueba.pages.LoginPage;
import co.com.banco.prueba.utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankTestLoginDefinitions {

	static WebDriver driver;
	
	LoginPage login;
	
	
	@Given("^i am in the main page of bank$")
	public void i_am_in_the_main_page_of_bank() throws Exception {
		driver = TestBase.startBrowser("chrome");
	}

	@When("^entry user and password valids$")
	public void entry_user_and_password_valids() throws Exception {
		login = new LoginPage(driver);
		login.enterHomePage("sebasqvision@qvision.com.co", "Sebas123");
	}

	@Then("^entry in the home page of bank$")
	public void entry_in_the_home_page_of_bank() throws Exception {
	    login.verifyHomePage();
	    TestBase.closeDriver();
	}
	
	
	
} //end class


