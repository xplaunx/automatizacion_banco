package co.com.banco.prueba.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.banco.prueba.pages.CheckingAddPage;
import co.com.banco.prueba.pages.CheckingViewPage;
import co.com.banco.prueba.pages.HomePage;
import co.com.banco.prueba.pages.LoginPage;
import co.com.banco.prueba.utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankTestNewCheckingDefinitions {

	static WebDriver driver;
	LoginPage login;
	HomePage home;
	CheckingAddPage checkingAdd;
	CheckingViewPage checkingView;
	
	
	@Given("^I want create a new checking standard$")
	public void i_want_create_a_new_checking_standard() throws Exception {
		driver = TestBase.startBrowser("chrome");
		login = new LoginPage(driver);
		login.enterHomePage("sebasqvision@qvision.com.co", "Sebas123");
		home = new HomePage(driver);
		home.entryNewChecking();
		TestBase.esperaImplicita();
	}


	@When("^I entry \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_entry(String arg1, String arg2, String arg3) throws Exception {
	    checkingAdd = new CheckingAddPage(driver);
	    checkingAdd.entryDataNewChecking(arg1, arg2, arg3);
	}

	@Then("^the system show a page view-checking$")
	public void the_system_show_a_message_with_$_of_the_new_checking() throws Exception {
	    checkingView = new CheckingViewPage(driver);
	    TestBase.esperaImplicita();
	    checkingView.checkStatusChecking();
	    TestBase.closeDriver();
	}

	
	
	
	
}
