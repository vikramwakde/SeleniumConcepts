package SeleniumConcepts2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.navigate().to("http://www.londonfreelance.org/courses/frames/index.html");
	    driver.manage().window().maximize();
	 
	    //Switch to main frame with its index (top.html)
	    //top.html is in 3rd frame so its index is 2
	    driver.switchTo().frame(2);
	 
	    //Check the H2 tag's text is "Title bar (top.html)
	    WebElement h2Tag = driver.findElement(By.xpath("//h2[text()='Title bar ']"));
	   System.out.println(h2Tag.getText());

	}

}
