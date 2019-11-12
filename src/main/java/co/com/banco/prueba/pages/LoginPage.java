package co.com.banco.prueba.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import co.com.banco.prueba.utils.TestBase;
import junit.framework.Assert;

public class LoginPage extends TestBase{
    

	/* Constructor. inicializamos los page objects */ 
    public LoginPage(WebDriver driver) {
    	this.driver = driver;
    	PageFactory.initElements(driver, this);
    }
	

    /* Localizadores */
    
    @FindBy(xpath = "//*[contains(text(), 'Sign Up Here')]")
    WebElement buttonRegister;
    
    @FindBy(id = "username")
    WebElement username;
    
    @FindBy(id = "password")
    WebElement password;
    
    @FindBy(id = "submit")
    WebElement buttonSubmit;
    
    @FindBy(xpath="//*[@class='sufee-alert alert with-close alert-danger alert-dismissible fade show']")
    WebElement messageError;
    
    
    
    /* Metodo para ingresar al formulario de registro de usuario */
    public void clicRegisterUser() {
    	buttonRegister.click();
    	TestBase.esperaImplicita();
    	
    } 
    
    /* Metodo para ingresar al home del banco con los datos de usuario */
    public void enterHomePage(String user, String pass) {
    	username.sendKeys(user);
    	password.sendKeys(pass);
    	buttonSubmit.click();
    }
    
    public void verifyHomePage() {
    	String linkHomePage = driver.getCurrentUrl(); 
    	Assert.assertEquals("http://dbankdemo.com/home", linkHomePage);
    }
    
    public void verifyStatusLogin() {
    	Assert.assertTrue(messageError.getText().contains("Invalid credentials"));
    }
    
    
    
    
} //end class Base
