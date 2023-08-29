package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

import chromedriver.DriverAddress;

public class TakeScreeeeeenshotttt {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chromedriver.driver",
				"C:\\no delete folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);

		File p = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(p, new File("C:\\ss\\mm\\Facebooklogin.png"));

		Thread.sleep(3000);
	}

}
