
package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import utilities.StaticElements;

public class FileUpload extends StaticElements {

	// JavascriptExecutor is a workaround in cases where WebElement's .click() does
	// not work

	public static void scrollToBtn() {

		WebElement ele = driver.findElement(By.id("id_1_43"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", ele);

	}

	public static void clickOnDiploma() {

		WebElement dipl = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div[1]/div[9]/div/input[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", dipl);
	}

	public static void uploadFile() throws IOException {

		/*
		 * This is an AutoIT file, used for managing Windows 10 GUI. The file is also
		 * attached in the repository. In order to use it, the below directory should be
		 * altered accordingly.
		 */

		Runtime.getRuntime().exec("C:\\Users\\Medion\\eclipse-workspace\\SalesTr\\FileUpload.exe");

	}

}
