package pageObects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
public WebDriver driver;

By EmailId = By.cssSelector("[id='user_email']");
By SendMeInstructions = By.cssSelector("[type='submit']");

		public ForgotPassword(WebDriver driver) {
			this.driver=driver;
		}
		
		public WebElement getEmail(){
			return driver.findElement(EmailId);
			
		}
		public WebElement SendmeInstructions(){
			return driver.findElement(SendMeInstructions);
			
		}
		
		
		
}
