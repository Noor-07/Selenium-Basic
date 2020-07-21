package seleniumbasic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoITDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tinypng.com/");
		driver.findElement(By.xpath("//p[contains(text(),'Drop your .png or .jpg files here!')]")).click();
		Runtime.getRuntime().exec("E:\\FileUploadScript.exe");
		Thread.sleep(3000);
	}

}
