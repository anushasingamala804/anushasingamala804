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
import pageObects.loginPage;
import resource.Base;

public class ValidationNavBars extends Base {
	public WebDriver driver;
	public static Logger log= LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void initializeDriver() throws IOException {
		driver=Initialize();
		 driver.get(prop.getProperty("URL"));
	}

 @Test

public void validateAppNavBars() throws IOException {
	 
	 LandingPage lp= new LandingPage(driver);
	 //lp.getLogin().click();
	 Assert.assertTrue(lp.getNavBar().isDisplayed());
	 log.info("Navigation bar displayed");
	 
}
 
 @AfterTest
 public void tearDown() {
	 driver.close();
}

 }
 


