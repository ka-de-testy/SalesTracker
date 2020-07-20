package pageObjects;

	
	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utilities.StaticElements;

	public class RadioButtons extends StaticElements {

		public static WebElement choosePlec() {
			List<WebElement> wybierz_plec = driver.findElements(By.xpath("//*/input[@data-key='sex']"));
			int indeks = rnd.nextInt(wybierz_plec.size());
			WebElement k_lub_m = wybierz_plec.get(indeks);
			String id = k_lub_m.getAttribute("id");
			return driver.findElement(By.xpath("//*[@id='" + id + "']"));

		}

		public static WebElement chooseEducation() {
			List<WebElement> wybierz_edukacje = driver.findElements(By.xpath("//*/input[@data-key='education']"));
			int indeks = rnd.nextInt(wybierz_edukacje.size());
			WebElement edu = wybierz_edukacje.get(indeks);
			String id = edu.getAttribute("id");
			return driver.findElement(By.xpath("//*[@id='" + id + "']"));

		}

		public static WebElement chooseEmployment() {
			List<WebElement> czy_pracuje = driver.findElements(By.xpath("//*/input[@data-key='poz']"));
			int indeks = rnd.nextInt(czy_pracuje.size());
			WebElement zatrudnienie = czy_pracuje.get(indeks);
			String id = zatrudnienie.getAttribute("id");
			return driver.findElement(By.xpath("//*[@id='" + id + "']"));
		}

	}



