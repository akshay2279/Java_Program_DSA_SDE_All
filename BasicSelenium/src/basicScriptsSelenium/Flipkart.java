package basicScriptsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args)
	{
		System. setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\OneDrive\\\\Desktop\\\\Automation&Software\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
		WebElement searchfield = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		searchfield.click();
		
	}

}
