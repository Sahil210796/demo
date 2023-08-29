package basicloginprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\no delete folder\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();

 WebElement username = driver.findElement(By.name("email"));
 username.sendKeys("9860503775");
 
 Thread.sleep(1000);
 
 WebElement password = driver.findElement(By.name("pass"));
 password.sendKeys("1316250126");
 
 WebElement loginbtn = driver.findElement(By.name("login"));
 loginbtn.click();
 

		
	}
}
