package co.com.banco.prueba.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import co.com.banco.prueba.utils.TestBase;

public class HomePage extends TestBase{

	
	//Constructor e inicializacion de objetos del page object
	public HomePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	//Localizadores
	
	@FindBy(xpath="//*[@id='main-menu']//li[2]//a")
	WebElement listDropDownChecking;
	
	@FindBy(xpath="//a[contains(text(),'New Checking')]")
	WebElement newChecking;
	
	
	
	
	
	
	
	public void entryNewChecking() {
		listDropDownChecking.click();
		TestBase.esperaImplicita();
		newChecking.click();
	}
	
	
	
	
	
	
}//end class
