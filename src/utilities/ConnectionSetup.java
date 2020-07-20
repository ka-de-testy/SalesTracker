package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConnectionSetup extends StaticElements {

	public String chrome_path = "C:\\Users\\Medion\\Downloads\\chromedriver_win32\\chromedriver.exe";

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Medion\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		return driver;
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

}



