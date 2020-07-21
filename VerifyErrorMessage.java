package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		Thread.sleep(2000);
		
		String actual_error_msg = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']")).getText();
		
		System.out.println("Actual Msg Is = "+actual_error_msg);
		
		String expected_error_msg = "The email address or phone number that you've entered doesn't match any account. Sign up for an account.";
		
	if(actual_error_msg.equalsIgnoreCase(expected_error_msg)) {
		System.out.println("Error msg Matched");
	}	
	else {
		System.out.println("Error msg MisMatched");
	}
	}

}
