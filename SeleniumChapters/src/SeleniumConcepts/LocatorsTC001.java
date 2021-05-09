package SeleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsTC001 {

	public static void main(String[] args) {
		
		
		//Setting up chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		//Initiating the driver
		WebDriver driver=new ChromeDriver();
		
		//Setting up wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/login");
	
		
		//Maximizing the window
		driver.manage().window().maximize();
	
		
		
		
		
		
		//Types of locators
		driver.findElement(By.name("username")).sendKeys("user@phptravels.com");//name
	
		driver.findElement(By.name("password")).sendKeys("demouser");//classname
		//driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();//xpath
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		
		
		//Verifying the title
		String pageTitle=driver.getTitle();
		System.out.println(pageTitle);
		
		if(pageTitle.equals("Login")) {
			System.out.println("Title is same as expected------");
		}
		else {
			System.out.println("not matching!");
		}
		
		//Closing the browsers
		//driver.close();
		
		
		driver.findElement(By.linkText("Wishlist")).click();
		
	}

}
