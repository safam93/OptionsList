package authentication;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practical {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("http://127.0.0.1:5500/index.html");

		String myTitle = driver.getTitle();
		System.out.println(myTitle);

List <WebElement> myOptions = driver.findElements(By.tagName("option"));


for(int i =0 ; i<myOptions.size() ; i++) {
	
	
	System.out.println(myOptions.get(i).getText());

	}
	
	
}
}
