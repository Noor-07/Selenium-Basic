package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
		List <WebElement> radio =  driver.findElements(By.xpath("//input[@name='optradio' and @type='radio']"));
		
		for (int i = 0; i < radio.size(); i++) {
			WebElement local_radio = radio.get(i);
			String value = local_radio.getAttribute("value");
			
			System.out.println("values from radio buttons are====>>"+value);
			
			
		}
		driver.findElement(By.xpath("//body/div/div/div/div/div/label[contains(text(),'Male')]/input[1]")).click();
		if(driver.findElement(By.xpath("//body/div/div/div/div/div/label[contains(text(),'Male')]/input[1]"))
				.isSelected()==true) {
			System.out.println("Option Male is selected");
		}
		else {
			System.out.println("test case Failed");
		}
		
		
	}

}
