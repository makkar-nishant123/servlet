package tutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
		
	public static String inititate()
	{
		WebDriver driver  = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.google.com");
		return driver.getTitle();
		
	}

}
