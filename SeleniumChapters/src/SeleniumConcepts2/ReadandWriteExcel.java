package SeleniumConcepts2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadandWriteExcel {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFCell cell;
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.facebook.com/"); 

		driver.manage().window().maximize(); 


		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		// Import excel sheet. 

		File src=new File("F:\\TestData.xlsx"); 

		// Load the file. 

		FileInputStream finput = new FileInputStream(src); 

		// Load the workbook. 

		workbook = new XSSFWorkbook(finput); 

		// Load the sheet in which data is stored. 

		sheet= workbook.getSheetAt(0); 

		for(int i=1; i<=sheet.getLastRowNum(); i++) { 

		// Import data for Email. 

		cell = sheet.getRow(i).getCell(1); 

		cell.setCellType(CellType.STRING);
		
		driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue()); 

		// Import data for password. 

		cell = sheet.getRow(i).getCell(2); 

		cell.setCellType(CellType.STRING); 

		driver.findElement(By.id("pass")).sendKeys(cell.getStringCellValue()); 

		} 

		} 

		}
