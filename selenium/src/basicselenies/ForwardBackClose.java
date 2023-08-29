package basicselenies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForwardBackClose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver",
				"C:\\no delete folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward();

		Thread.sleep(2000);

		driver.close();

	}

}
