package seleniumbasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Setupfiles\\Drivers\\chromedriverFolder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://bongobd.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String actual_URL = driver.getCurrentUrl();
		System.out.println("The Title is = "+actual_URL);
		String expected_URL = "https://bongobd.com/";
		if(actual_URL.contentEquals(expected_URL)) {
			System.out.println("It matches with Expected URL");
		}
		else {
			System.out.println("It Does not match with Expected URL");
		}
		//This command will scroll to the "Just Added" section 
		((JavascriptExecutor)driver).executeScript("scroll(0,800)");
		
		
		Thread.sleep(2000);
		    
		 //It will capture the "Just Added" section 
		 List<WebElement> links = driver.findElements(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[5]/div/div[1]/div/div/div[2]//h6"));
		 Thread.sleep(2000);
		 int i= links.size();
		for(int j=0; j<i; j++) {              
		//Printing the Name of the Video
			System.out.println(links.get(j).getText()); 
			} 
		
		String Video_content= driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div[5]/div/div[1]/div/div/div[2]/div/div/div/div/div[7]/div/div/div/a/div[1]/div[1]/div/div/div")).getText();
		System.out.println("The content of the video is : "+Video_content);
	}

}
