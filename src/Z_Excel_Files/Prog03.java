package Z_Excel_Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog03 {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException  {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement fnameTextbox = driver.findElement(By.xpath("//input[@id='fullname']"));
		WebElement currentemailTextbox = driver.findElement(By.xpath("//input[@id='emailid']"));
		WebElement NewPassTextbox = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement retypePassTextbox = driver.findElement(By.xpath("//input[@id='repass']"));
		WebElement genderRadioButton = driver.findElement(By.xpath("//input[@id='sex']"));
		WebElement dob_days_ListBox = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select s1 = new Select(dob_days_ListBox);
		WebElement dob_Months_ListBox = driver.findElement(By.xpath("//select[@id='date_mon']"));
		Select s2 = new Select(dob_Months_ListBox);
		WebElement dob_Years_ListBox = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s3 = new Select(dob_Years_ListBox);
		WebElement location_TextBox = driver.findElement(By.xpath("//input[@id='signup_city']"));
		WebElement schoolTextBox = driver.findElement(By.xpath("//input[@id='school']"));
		WebElement collegeTextBox = driver.findElement(By.xpath("//input[@id='college']"));
		WebElement CaptchaTextBox = driver.findElement(By.xpath("//input[@id='fld_captcha']"));
		WebElement SignUpButton = driver.findElement(By.xpath("//input[@id='btn_register']"));
		
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\VelocityJava\\ExcelFiles\\Book1.xlsx");
		Sheet exceldata = WorkbookFactory.create(file).getSheet("Sheet3");
		String a = exceldata.getRow(0).getCell(0).getStringCellValue();
		fnameTextbox.sendKeys(a);
		String b = exceldata.getRow(1).getCell(0).getStringCellValue();
		currentemailTextbox.sendKeys(b);
		
		NewPassTextbox.sendKeys(exceldata.getRow(2).getCell(0).getStringCellValue());
		
		String c = exceldata.getRow(3).getCell(0).getStringCellValue();
		retypePassTextbox.sendKeys(c);
		
		genderRadioButton.click();
		String d = exceldata.getRow(4).getCell(0).getStringCellValue();
		s1.selectByVisibleText(d);
		String e = exceldata.getRow(5).getCell(0).getStringCellValue();
		s2.selectByVisibleText(e);
		String f = exceldata.getRow(6).getCell(0).getStringCellValue();
		s3.selectByVisibleText(f);
		String g = exceldata.getRow(7).getCell(0).getStringCellValue();
		location_TextBox.sendKeys(g);
		String h = exceldata.getRow(8).getCell(0).getStringCellValue();
		schoolTextBox.sendKeys(h);
		String i = exceldata.getRow(9).getCell(0).getStringCellValue();
		collegeTextBox.sendKeys(i);
		String j = exceldata.getRow(10).getCell(0).getStringCellValue();
		CaptchaTextBox.sendKeys(j);
		Thread.sleep(1500);
		SignUpButton.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
