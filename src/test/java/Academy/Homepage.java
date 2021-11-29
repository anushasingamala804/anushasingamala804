package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.Message;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObects.ForgotPassword;
import pageObects.LandingPage;
import pageObects.loginPage;
import resource.Base;

public class Homepage extends Base {
	public WebDriver driver;
	
	public static Logger log= LogManager.getLogger(Homepage.class.getName());
	@BeforeTest
	public void initializeDriver() throws IOException {
		driver=Initialize();
		
	}
 @Test(dataProvider ="getData")

public void basePageNavigations(String Username, String password, String text) throws IOException {

	 driver.get(prop.getProperty("URL"));
	 LandingPage lp= new LandingPage(driver);
	 lp.getLogin().click();
	 
	 loginPage logn=new loginPage(driver);
	 logn.getEmail().sendKeys(Username);
	 logn.getPassword().sendKeys(password);
	 log.info(text);
	 logn.getLogin().click();
ForgotPassword fp =logn.forgotpassword();
fp.getEmail().sendKeys("anusha@gmail.com");
fp.SendmeInstructions().click();
	
	 
} 
 @AfterTest
 public void tearDown() {
	 driver.close();
 }
 @DataProvider
 public Object[][] getData() {
	 Object[][] data = new Object[2][3];
	 data[0][0]="Anusha.singamala@gmail.com";
	 data[0][1]="abcdfe";
	 data[1][0]="Anusha.s@gmail.com";
	 data[1][1]="abcdfe";
	return data;
 }
 
}

