package webelementmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeys {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9860503775");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1316250126");

		driver.findElement(By.name("login")).click();

		driver.findElement(By.xpath("//input[@name='email']")).clear();

		boolean result = driver.findElement(By.name("login")).isEnabled();
		System.out.println(result);

		boolean print = driver.findElement(By.xpath("//img[@class='_97vu img']")).isDisplayed();

		System.out.println(print);
	}

}
