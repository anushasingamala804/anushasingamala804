package pageObects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
public WebDriver driver;
By Signin=By.cssSelector("a[href*= 'sign_in']");
By Title=By.cssSelector(".text-center>h2");
By Navbar = By.cssSelector(".nav.navbar-nav.navbar-right");
		public LandingPage(WebDriver driver) {
			this.driver=driver;
		}
		
		public WebElement getLogin(){
			return driver.findElement(Signin);
			
		}
		public WebElement getTitle(){
			return driver.findElement(Title);
			
		}
		public WebElement getNavBar(){
			return driver.findElement(Navbar);
			
		}
}
