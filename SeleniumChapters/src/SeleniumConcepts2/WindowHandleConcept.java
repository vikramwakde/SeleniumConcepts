package SeleniumConcepts2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleConcept {
	//window handle stores the unique address and its return type is alphanumeric
	//Each browser will have a unique window handle value with which we can uniquely identify it

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				
				driver.switchTo().window(child_window);
				driver.findElement(By.id("User_Id")).sendKeys("suba");

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}
		// switch to the parent window
		driver.switchTo().window(parent);

	}

}
