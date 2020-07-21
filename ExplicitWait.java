package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.facebook.com/");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		List<WebElement> element=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='email']")));
	
	boolean status = ((WebElement) element).isDisplayed();
	
	if(status) {
		System.out.println("Element is displayed");
	}
	else {
		System.out.println("Element is not displayed");
	}
	}

}
