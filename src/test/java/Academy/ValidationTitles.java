package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObects.LandingPage;
import resource.Base;

public class ValidationTitles extends Base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(ValidationTitles.class.getName());
	@BeforeTest
	public void initializeDriver() throws IOException {
		driver=Initialize();
		log.info("Driver is initialized");
		 driver.get(prop.getProperty("URL"));
		 log.info("URl triggered");
	}

 @Test

public void ValidateTitles() throws IOException {
	
	 LandingPage lp= new LandingPage(driver);
	 //lp.getLogin().click();
	 Assert.assertEquals(lp.getTitle().getText(), "FEATURddED COURSES" );
	 log.info("Sucessfully validated text message");
	 
	 
}
 @AfterTest
 public void tearDown() {
	 driver.close();
 }
 }
 


