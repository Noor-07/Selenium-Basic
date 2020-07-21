package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		
		driver.findElement(By.xpath("//input[@placeholder='dd/mm/yyyy']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//td[contains(text(),'12')]")).click();
	}

}
