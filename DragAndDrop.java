package seleniumbasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.google.common.collect.ImmutableBiMap.Builder;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://material.angular.io/cdk/drag-drop/examples");
		
		
		WebElement from= driver.findElement(By.xpath("//div[@id='cdk-drop-list-0']//div[@class='cdk-drag example-box ng-star-inserted'][contains(text(),'Pick up groceries')]"));
		WebElement to= driver.findElement(By.xpath("//div[@id='cdk-drop-list-1']//div[@class='cdk-drag example-box ng-star-inserted'][contains(text(),'Brush teeth')]"));
		Actions act = new Actions(driver);
		try {
			Thread.sleep(4000);
			Action dragdrop = act.clickAndHold(from).moveToElement(to).release(to).build();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		//act.dragAndDrop(driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]")),driver.findElement(By.xpath("//div[@id='mydropzone']"))).build().perform();
	
		//act.clickAndHold(src)
		 //.pause(Duration.ofSeconds(2))
		//.moveToElement(destination)
		//.release()
		//.build()
		//.perform();
				
				
	}

	

}
