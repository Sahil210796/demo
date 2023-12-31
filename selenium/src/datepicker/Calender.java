package datepicker;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\no delete folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("datepicker1")).click();
		Thread.sleep(2000);

		int i = 0;
		while (i == 0) {
			String monthYear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
			if (!(monthYear.equals("July 1996")))
				driver.findElement(By.xpath("//*[text()='Prev']")).click();
			else
				break;
		}
		driver.findElement(By.xpath("//*[text()='21'])")).click();

	}

}
