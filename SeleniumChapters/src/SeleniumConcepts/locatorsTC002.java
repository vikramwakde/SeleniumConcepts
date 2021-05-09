package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsTC002 {

	public static void main(String[] args) {
		//Setting up chrome driver path
				System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
				
				//Initiating the driver
				WebDriver driver=new ChromeDriver();
				
				//Setting up wait
				driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
				driver.get("https://www.phptravels.net/login");
				
				//Maximizing the window
				driver.manage().window().maximize();
				
				driver.findElement(By.linkText("Contact")).click();

	}

}
