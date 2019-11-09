package co.com.banco.prueba.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import co.com.banco.prueba.utils.TestBase;

public class CheckingViewPage extends TestBase {

	public CheckingViewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//Localizadores
	@FindBy(xpath="//*[@class='card-title text-light'][contains(text(), 'Transactions')]")
	WebElement tituloTransacciones;
	
	
	
	
	
	
	
	public void checkStatusChecking() {
		Assert.assertEquals(true, tituloTransacciones.isDisplayed());
	}
	
}
