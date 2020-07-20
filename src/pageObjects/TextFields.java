
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.StaticElements;

	public class TextFields extends StaticElements {

		public static By imie = By.id("id_1_1");
		public static By nazwisko = By.id("id_1_2");
		public static By pesel_field = By.xpath("//*/input[@data-key='pesel']");
		public static By nip_field = By.xpath("//*/input[@data-key='nip']");
		public static By doctor_no_field = By.xpath("//*/input[@data-key='doctor_no']");
		public static By employment_data = By.xpath("//*[@id='id_1_9']");

		public static WebElement getImieField() {
			return driver.findElement(imie);
		}

		public static WebElement getNazwiskoField() {
			return driver.findElement(nazwisko);
		}

		public static WebElement getPeselField() {
			return driver.findElement(pesel_field);

		}

		public static WebElement getNipField() {
			return driver.findElement(nip_field);
		}

		public static WebElement getDoctorNoField() {
			return driver.findElement(doctor_no_field);
		}

		public static WebElement getEmploymentField() {
			return driver.findElement(employment_data);
		}
	}





