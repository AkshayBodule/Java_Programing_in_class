package Z_Excel_Files;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog04 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst"); // home
		
//		WebElement home = driver.findElement(By.xpath("//a[@title='w3schools.com Home']"));
//		home.click();
		driver.switchTo().frame(0);
		WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
		button.click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
