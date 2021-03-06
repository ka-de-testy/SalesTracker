
package testCases;


import java.io.IOException;

import pageObjects.RadioButtons;
import pageObjects.TextFields;
import testData.FormData;

	public class FillTheForm extends FormData {
		
		public static void getUrl() {

			baseUrl = "http://serwer1419259.home.pl/tester/index.php/site/form/52";

		}

		public static void goToForm() {

			driver.get(baseUrl);
			driver.manage().window().maximize();
		}
		

		public static void provideEmploymentData() {

			String employ_id = RadioButtons.chooseEmployment().getAttribute("id");

			if (employ_id.equals("id_1_7_9"))

				TextFields.getEmploymentField().sendKeys("asd");

		}

		public static void writeIntoForm() throws IOException {

			FormData.getUrl();
			FormData.goToForm();
			TextFields.getImieField().sendKeys(first_name);
			TextFields.getNazwiskoField().sendKeys(last_name);
			RadioButtons.choosePlec().click();
			TextFields.getPeselField().sendKeys(FormData.generatePesel());
			TextFields.getNipField().sendKeys(FormData.generateNip());
			RadioButtons.chooseEducation().click();
			FileUpload.scrollToBtn();
			FileUpload.clickOnDiploma();
			TextFields.getDoctorNoField().sendKeys(FormData.generateDoctorNo());
			RadioButtons.chooseEmployment().click();
			//provideEmploymentData();

		}
	}



