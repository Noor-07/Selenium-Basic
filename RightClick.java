package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		//right click object
		Actions act = new Actions(driver);
		
		//right click method
		act.contextClick(driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"))).perform();
		
		driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[3]/span[1]")).click();
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}

}
