package basicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://leafground.com/home.html");
		Thread.sleep(3000);

	}

}
