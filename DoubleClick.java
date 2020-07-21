package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://api.jquery.com/dblclick/");
		//the double click div is in the frame,so we need to switch to the frame first
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='demo code-demo']//iframe")));
		Thread.sleep(2000);
		//right click object
		Actions act = new Actions(driver);
		
		 act.doubleClick(driver.findElement(By.xpath("//html//body//div"))).perform();
	}

}
