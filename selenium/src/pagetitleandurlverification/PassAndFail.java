package pagetitleandurlverification;

import org.openqa.selenium.chrome.ChromeDriver;

import chromedriver.DriverAddress;

public class PassAndFail extends DriverAddress{

	public void checkintitleofpage(String title) {
		String titleofpage = ChromeDriver.gettitle();
		if(titleofpage.equals(title));
	}
	
}
