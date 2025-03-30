package basicScriptsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutors {

	public static void main(String[] args) {
		{
			System. setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Lenovo\\\\OneDrive\\\\Desktop\\\\Automation&Software\\\\chromedriver-win64\\\\chromedriver.exe");
			WebDriver driver = (WebDriver) new ChromeDriver();
			driver.get("https://www.google.co.in/");
			
			
			driver.findElement(By.xpath("//a[@aria-label='Sign in']"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;


		}

	}

}
