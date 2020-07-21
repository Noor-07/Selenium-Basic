package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//it works after get method
		
	//ImplicitWait only checks element presence
		
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	driver.manage().window().maximize();
		
		
		
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //it waits 10 second and will find xpath given below
	System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("alvee")).click();  //wrong xpath given.so it shows error after 10 scnds
	}

}
