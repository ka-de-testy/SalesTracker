
package testCases;


import java.io.IOException;

import testData.FormData;
import utilities.StaticElements;

	public class Main extends StaticElements {
		
		
		public static void getUrl() {

			baseUrl = "http://serwer1419259.home.pl/tester/index.php/site/form/52";

		}

		public static void goToForm() {

			driver.get(baseUrl);
			driver.manage().window().maximize();
		}
		
		
		static boolean run() {

			utilities.ConnectionSetup.getDriver();
			
			
			try {
				FormData.getUrl();
				FormData.goToForm();
				FillTheForm.writeIntoForm();

	// I'm not sure why this method has to be separately invoked from main
				FileUpload.uploadFile();

			} catch (Exception e) {
				e.printStackTrace();
				result = false;
			}

			return result;

		}

		public static void main(String[] args) throws IOException {
			run();
			System.out.println();

		}

	}



