package resource;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	public WebDriver driver;
	public Properties prop;

public WebDriver Initialize() throws IOException {
	 prop= new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\E2EndProject\\src\\main\\java\\Resource\\data.properties");;
	prop.load(fis);
	String BrowserName=System.getProperty("Browser");
	//String BrowserName= prop.getProperty("Browser");
	if (BrowserName.contains("Chrome")) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		if(BrowserName.contains("headless")) {
			options.addArguments("headless");
		}
		 driver = new ChromeDriver(options);
		
	}
	if (BrowserName.equals("Firefox")) {
	
}
	if (BrowserName.equals("IE"))  {
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}


public String getScreenShotPath(String TestCasename, WebDriver driver) throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source= ts.getScreenshotAs(OutputType.FILE);
	String DestinationFile = System.getProperty("user.dir")+ "\\reports\\" + TestCasename +".png";
	FileUtils.copyFile(source, new File(DestinationFile));
	return DestinationFile;
}
	}


