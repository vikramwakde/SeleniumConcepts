package SeleniumConcepts2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		String URL = "https://selenium08.blogspot.com/2019/07/alert-test.html";

		driver.get(URL);
		driver.manage().window().maximize();

		//Simple alert
		//WebElement simple = driver.findElement(By.xpath("//input[@id='simple']"));
		//simple.click();
		
		//Confirmation alert
		WebElement element1 = driver.findElement(By.id("confirm"));
		element1.click();
		Thread.sleep(1000);

	
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

		//alert.accept();
		//String getText = driver.switchTo().alert().getText();
		//System.out.println(getText);
		
		

		/*if (getText.equalsIgnoreCase("Hello! I am a simple alert box!")) {

			System.out.println("It worked, the expected simple alert was shown");
		} else {
			System.out.println("Something went wrong, expected simple alert was not shown");
		}

		alert.accept();
		
		driver.close();*/

	}

}
