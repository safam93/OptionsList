package authentication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Booking_Registration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Eclipse\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.booking.com");
		driver.findElement(By.xpath("(//a[@class='bui-button bui-button--secondary js-header-login-link'])[1]"))
				.click();
		driver.findElement(By.id("username")).sendKeys("safaalhabarneh93@gmail.com");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("new_password")).sendKeys("P@ssw0rd.123");
		driver.findElement(By.id("confirmed_password")).sendKeys("P@ssw0rd.123");

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();

		Thread.sleep(5000);

		Actions actions = new Actions(driver);

		WebElement element = driver.findElement(By.xpath("//*[@id=\"yhhmhowcHlIxScn\"]"));

		// actions.moveToElement(element);

		// actions.clickAndHold().perform();
		actions.clickAndHold(element).perform();

	}

	private static void Thread(int i) {
		// TODO Auto-generated method stub

	}

}
