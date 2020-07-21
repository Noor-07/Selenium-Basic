package seleniumbasic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrokenLinks2 {
public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium-java\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/");
		//wait
		Thread.sleep(5000);
		//capture links from webpage
		List<WebElement> links= driver.findElements(By.tagName("a"));
		//Number of links
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
			//by using href attribute we can get URL of requred link
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			URL link=new URL(url);
			//create connection by using this URL object
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			//wait for 2 seconds
			Thread.sleep(4000);
			//establish Connection
			httpConn.connect();
			int rescode=httpConn.getResponseCode(); //if response code above 400 its a broken link
			if(rescode>=400) {
				System.out.println(url +" - "+ " is broken link");
			}
			else {
				System.out.println(url +" - "+ " is valid link");
			}
			
		}

}
	
	
	
}
