package co.com.banco.prueba.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.banco.prueba.pages.LoginPage;
import co.com.banco.prueba.pages.RegisterPage;
import co.com.banco.prueba.utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BankTestRegisterDefinitions extends TestBase {

	static WebDriver driver;
	LoginPage login;
    RegisterPage register;
	 
	
	@Given("^i am in the main web of bank$")
	public void i_am_in_the_main_web_of_bank() throws Exception {
	    driver = TestBase.startBrowser("chrome");
	}

	@When("^enter user data valid$")
	public void enter_user_data_valid() throws Exception {
		login = new LoginPage(driver);
	    login.clicRegisterUser();
	    register = new RegisterPage(driver);
	    register.dataRegister("Mr.",
	    		"Sebastian",
	    		"Saldarriaga Ruiz",
	    		"M",
	    		"01/07/1995",
	    		"251-85-0006",
	    		"sebasqvision06@qvision.com.co", 
	    		"Sebas123",
	    		"Dgnl 22 num 3",
	    		"QVision",
	    		"CO",
	    		"055412",
	    		"Medellin",
	    		"543322-0006",
	    		"242352-0006",
	    		"352233-0006");
	}

	@Then("^the user is created successfully$")
	public void the_user_is_created_successfully() throws Exception {
	    register.validateRegister();
	    TestBase.closeDriver();
	}
	
	

	
}
