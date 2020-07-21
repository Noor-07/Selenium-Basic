package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEvent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("selenium");
		
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("webdriver")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("2324234")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("sadasdsa")
		.build().perform();
	}

}
