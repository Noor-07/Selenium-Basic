package seleniumbasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
		Thread.sleep(2000);
		
		//Alert alt= driver.switchTo().alert();
		
		//alt.accept();
		
		String actual_msg=driver.switchTo().alert().getText();
		System.out.println("Alert message is===> "+actual_msg);
		driver.switchTo().alert().accept();
		String expected_msg="Please select start place.";
		if(actual_msg.equalsIgnoreCase(expected_msg)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case Failed");
		}
	}

}
