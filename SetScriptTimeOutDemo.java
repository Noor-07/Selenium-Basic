package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetScriptTimeOutDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//very useful when u r working with ajax application
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Timeouts time = driver.manage().timeouts();
		time.pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getCurrentUrl());
	}

}
