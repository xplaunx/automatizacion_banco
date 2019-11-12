package co.com.banco.prueba.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.com.banco.prueba.utils.TestBase;

public class CheckingAddPage extends TestBase {

	
	public CheckingAddPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	//Localizadores
	@FindBy(id="Standard Checking")
	WebElement accountTypeStandard;
	
	@FindBy(id="Interest Checking")
	WebElement accountTypeInterest;
	
	@FindBy(id="Individual")
	WebElement ownershipIndividual;
	
	@FindBy(id="Joint")
	WebElement ownershipJoint;
	
	@FindBy(id="name")
	WebElement accountName;
	
	@FindBy(id="openingBalance")
	WebElement balanceAmount;
	
	@FindBy(xpath="//button[@type='submit' and @class='btn btn-primary btn-sm']")
	WebElement buttonSubmit;
	
	
	public void entryDataNewChecking(String accountType, String ownership, String nameAccount, String balance) {
		
		if(accountType.equalsIgnoreCase("Standard")) {
			accountTypeStandard.click();
		} else if(accountType.equalsIgnoreCase("Interest")) {
			accountTypeInterest.click();
		}
		
		
		if(ownership.equalsIgnoreCase("Individual")) {
			if(!ownershipIndividual.isSelected()) {
				ownershipIndividual.click();
			}
		}else if(ownership.equalsIgnoreCase("Joint")) {
			if(!ownershipJoint.isSelected()) {
				ownershipJoint.click();
			}
		}
		
		accountName.sendKeys(nameAccount);
		balanceAmount.sendKeys(balance);
		
		buttonSubmit.submit();
		
	}
	
	
	
	
	
	
	
	
	
	
	
} //end class
