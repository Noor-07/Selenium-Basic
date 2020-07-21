package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		String actual_Title = driver.getTitle();
		System.out.println("The Title is = "+actual_Title);
		
		String expected_title = "STORE";
		
		if(actual_Title.equalsIgnoreCase(expected_title)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}

}
