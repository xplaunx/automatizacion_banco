package co.com.banco.prueba.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
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
	
	@FindBy(xpath="//form[@action='/account/checking-view']//div[1]//div[1]")
	List <WebElement> nameAccountUser;
	
	@FindBy(xpath="//form[@action='/account/checking-view']//div[1]//div[7]")
	List <WebElement> balanceAccountUser;
	
	
	
	
	public void checkAccount(String nameAccount, String balance) {
		
		String[] name = new String[nameAccountUser.size()];
		String[] bal = new String[balanceAccountUser.size()];
		int i = 0;
		int j = 0;
		
		/* Ciclo para obtener el indice de la cuenta a la que le voy a sacar el balance */
		for(WebElement e:nameAccountUser) {
			name[i] = e.getText();
			 if(name[i].equals(nameAccount)) {
				 j = i;
			 }
			i++;
		}
		
		i = 0;
		for(WebElement money:balanceAccountUser) {
			bal[i] = money.getText();
			i++;
		}
		
		Assert.assertEquals("Balance: $"+balance, bal[j]);	
	}
	
	
	
	public void checkStatusChecking() {
		Assert.assertEquals(true, tituloTransacciones.isDisplayed());
	}
	
}
