package seleniumbasic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		System.out.println("The title of the main window is = "+driver.getTitle());
		
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"))
		.click();
		
		Thread.sleep(4000);
		
		Set<String> windowId = driver.getWindowHandles();
		
		Iterator<String> iter = windowId.iterator();
		
		String mainwindow = iter.next();
		String childwindow = iter.next();
		
		driver.switchTo().window(childwindow);
		
		System.out.println ("The tilte of the child window = "+driver.getTitle());
		
		String actual_title=driver.getTitle();
		String expected_title="Sakinalium | Home";
		if(actual_title.equalsIgnoreCase(expected_title)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		
		
		
		
	}

}
