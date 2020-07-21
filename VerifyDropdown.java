package seleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		driver.manage().window().maximize();
		
		WebElement country_dropdown = driver.findElement(By.id("country"));
		Select country = new Select(country_dropdown);
		List<WebElement> country_list = country.getOptions();
		int total_country = country_list.size(); 
		
	
		
		System.out.println("Totall country count is"+total_country);
		Thread.sleep(3000);
		for(WebElement ele:country_list) {
			String country_name=ele.getText();
			System.out.println("Countries are==="+country_name);
		}
		//it will select Bangladesh from dropdown
		
		country.selectByValue("Bangladesh");
		
	}

}
