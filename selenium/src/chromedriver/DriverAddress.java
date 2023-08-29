package chromedriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import com.google.common.io.Files;

public class DriverAddress {

private static final TakesScreenshot driver = null;

public static WebDriver browserInit(String browser){	

	System.setProperty("webdriver.chrome.driver","C:\\no delete folder\\chromedriver_win32\\chromedriver.exe");
	if(browser.equals("chrome"));
	WebDriver driver = new ChromeDriver();
	return driver;
}	

	public void screenshot(String fileName) throws IOException {
		TakesScreenshot scrnsht = (TakesScreenshot)driver;
		File source = scrnsht.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\ss\\mm\\Facebooklogin\\"+fileName+".png\".png");
		FileHandler.copy(source, destination);
	}
}