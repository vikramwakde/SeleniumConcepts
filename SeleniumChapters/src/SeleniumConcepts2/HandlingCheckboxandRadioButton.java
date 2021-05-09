package SeleniumConcepts2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxandRadioButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.get("https://techcanvass.com/examples/register.html");

		WebElement TxtFname = driver.findElement(By.xpath("//input[@value='First Name']"));
		WebElement TxtLname = driver.findElement(By.xpath("//input[@value='Last Name']"));

		WebElement male = driver.findElement(By.xpath("//input[@value='male']"));
		WebElement female = driver.findElement(By.xpath("//input[@value='female']"));

		TxtFname.sendKeys("Subasri");
		TxtLname.sendKeys("Ravichandran");

		if (male.isSelected()) {

			female.click();

		}

		if (female.isSelected()) {
			male.click();

		}

		WebElement Checkbx = driver.findElement(By.name("DeliveryLoc"));
		System.out.println(Checkbx.isEnabled());
		Checkbx.click();
		System.out.println(Checkbx.isSelected());

		//driver.close();

	}

}
