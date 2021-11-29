package pageObects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
public WebDriver driver;

By EmailId = By.cssSelector("[id='user_email']");
By Password = By.cssSelector("[id='user_password']");
By Login = By.cssSelector("[value='Log In']");
By forgotPassword = By.cssSelector("[href*='password/new']");

		public loginPage(WebDriver driver) {
			this.driver=driver;
		}
		public WebElement getEmail(){
			return driver.findElement(EmailId);
			
		}
		public WebElement getPassword(){
			return driver.findElement(Password);
			
		}
		public WebElement getLogin(){
			return driver.findElement(Login);
			
		}
		public ForgotPassword forgotpassword(){
			 driver.findElement(forgotPassword).click();
			 return new ForgotPassword(driver);
			 
			
		}
}
