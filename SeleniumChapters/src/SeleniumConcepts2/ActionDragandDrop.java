package SeleniumConcepts2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragandDrop {

	public static void main(String[] args) {
		
		//Actions class is a collection of individual Action that you want to perform

		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// Open webpage
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		driver.manage().window().maximize();
		
		
		// Create object of actions class
		Actions act=new Actions(driver);
		 
		// find element which we need to drag
		WebElement drag=driver.findElement(By.id("draggable"));
		 
		// find element which we need to drop
		WebElement drop=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(drag, drop).build().perform();

		
		//driver.close();
		
	
		 
	}

}
