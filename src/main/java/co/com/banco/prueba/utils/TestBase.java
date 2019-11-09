package co.com.banco.prueba.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static WebDriver startBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}  else if (browserName.equalsIgnoreCase("chrome")) {
			  System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
			  driver = new ChromeDriver();
		   } else if (browserName.equalsIgnoreCase("ie")) {
			   System.setProperty("webdriver.ie.driver", "src/test/resources/drivers/msedgedriver.exe");
			    driver = new InternetExplorerDriver();  
		     }
		
		driver.manage().window().maximize();
		driver.get("http://dbankdemo.com/login");
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		return driver;
		
	} //end startBrowser()
	
	/* Metodo de espera implicita de 8 segundos */
	public static void esperaImplicita() {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	}
	
	public static void closeDriver() {
		driver.close();
	} 
	
} // end BrowserFactory 
