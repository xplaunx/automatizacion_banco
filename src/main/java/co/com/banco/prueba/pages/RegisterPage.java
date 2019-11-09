package co.com.banco.prueba.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import co.com.banco.prueba.utils.TestBase;
import junit.framework.Assert;

public class RegisterPage extends TestBase{

	WebDriver driver;
	
	/* Constructor e inicializacion de elementos del Page Object */
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	/* Localizacion de elementos */
	
	@FindBy(id="title")
	WebElement dropdownTitle;
	
	@FindBy(id="firstName")
	WebElement firstNameUser;
	
	@FindBy(id="lastName")
	WebElement lastNameUser;
	
	@FindBy(xpath="//input[@id='gender'][@value='M']")
	WebElement genderM;
	
	@FindBy(xpath="//input[@id='gender'][@value='F']")
	WebElement genderF;
	
	@FindBy(id="dob")
	WebElement dateBirthUser;
	
	@FindBy(id="ssn")
	WebElement socialNumberUser;
	
	@FindBy(id="emailAddress")
	WebElement emailAddressUser;
	
	@FindBy(id="password")
	WebElement passwordUser;
	
	@FindBy(id="confirmPassword")
	WebElement confirmPassUser;
	
	@FindBy(xpath="//button[contains(text(), 'Next')]")
	WebElement buttonNext;
	
	@FindBy(id="address")
	WebElement addressUser;
	
	@FindBy(id="locality")
	WebElement localityUser;
	
	@FindBy(id="region")
	WebElement regionUser;
	
	@FindBy(id="postalCode")
	WebElement postalCodeUser;
	
	@FindBy(id="country")
	WebElement countryUser;
	
	@FindBy(id="homePhone")
	WebElement homePhoneUser;
	
	@FindBy(id="mobilePhone")
	WebElement mobilePhoneUser;
	
	@FindBy(id="workPhone")
	WebElement workPhoneUser;
	
	@FindBy(id="agree-terms")
	WebElement acceptTerms;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement register;
	
	@FindBy(xpath="//*[contains (text(), 'Registration Successful')]")
	WebElement checkStatus;
	
	public void dataRegister(String userTitle, String name, String lastname, String gender, String birth, String socialN, String email, String pass, String address, String locality, String region, String postalCode, String country, String homePhone, String mobilePhone, String workPhone) {
		
		/* Seleccionar un valor del combobox de title */
	    Select titleUser = new Select(dropdownTitle);
	    titleUser.selectByVisibleText(userTitle);
	    
	    firstNameUser.sendKeys(name);	
		lastNameUser.sendKeys(lastname);
		
	    /* Seleccionamos un genero del radio Button */
	    if(gender.equalsIgnoreCase("M")) {
	    	genderM.click();
	    } else
	    	  genderF.click();
	    
	    dateBirthUser.sendKeys(birth);
	    socialNumberUser.sendKeys(socialN);
	    emailAddressUser.sendKeys(email);
	    passwordUser.sendKeys(pass);
	    confirmPassUser.sendKeys(pass);
		buttonNext.click();
		
		TestBase.esperaImplicita();
		addressUser.sendKeys(address);
		localityUser.sendKeys(locality);
		regionUser.sendKeys(region);
		postalCodeUser.sendKeys(postalCode);
		countryUser.sendKeys(country);
		homePhoneUser.sendKeys(homePhone);
		mobilePhoneUser.sendKeys(mobilePhone);
		workPhoneUser.sendKeys(workPhone);
		
		if(!acceptTerms.isSelected()) {
			acceptTerms.click();
		}
		
		register.submit();
	}
	
	public void validateRegister() {
		Assert.assertEquals(true, checkStatus.isDisplayed());
	}
	
	
}//end class
