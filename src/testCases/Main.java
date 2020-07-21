
package testCases;


import java.io.IOException;

import testData.FormData;
import utilities.StaticElements;

	public class Main extends StaticElements {
		
		
		
		
		static boolean run() {

			utilities.ConnectionSetup.getDriver();
			
			
			try {
				
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



