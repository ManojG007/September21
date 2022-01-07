package selenium_java_sep21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//tr[2]//td[2]//input")).sendKeys("12345");
		driver.findElement(By.xpath("//tr[3]//td[2]//input[1]")).click();
		
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//tr[3]//td[2]//input[1]")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		
		
	}

}
////input[@name='cusid']
////input[@name='submit']
