package basicScriptsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeRedbus {

	public static void main(String[] args)
	{
		System. setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Account']"));
		driver.findElement(By.xpath("//span[normalize-space()='Login/ Sign Up']"));
//		WebElement el = driver.findElement(By.xpath("//iframe[@class = 'modalIframe']"));
//		driver.switchTo().frame(el);
//		
	//	driver.findElement(By.id("mobileNoInp")).sendKeys("1234567890");

		

		
		
	}

}
