package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Github_signup_screen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String testEmail = "safa.m.93@hotmail.com";
		String testPassword = "123456789";
		String testPassword2 = "hello";
		

		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys(testEmail);
		driver.findElement(By.id("pass")).sendKeys(testPassword);
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.id("pass")).sendKeys(testPassword2);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		//driver.findElement(By.xpath("//*[@id=\"initiate_interstitial\"]/div[3]/div/div[1]/button")).click();
		
		
		
		

	}

}
