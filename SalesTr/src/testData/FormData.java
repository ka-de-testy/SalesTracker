
package testData;

import utilities.StaticElements;

public class FormData extends StaticElements {

	public static void getUrl() {

		baseUrl = "http://serwer1419259.home.pl/tester/index.php/site/form/52";

	}

	public static void goToForm() {

		driver.get(baseUrl);
		driver.manage().window().maximize();
	}
	


	public static String first_name = StaticElements.name.firstName();
			
	public static String last_name = name.lastName();

	public static String generatePesel() {

		String pesel_no = "";
		int suma_psl = 0;

		int[] waga_psl = { 1, 3, 7, 9, 1, 3, 7, 9, 1, 3 };
		int[] max_num = { 10, 10, 1, 2, 2, 9, 10, 10, 10, 10 };
		int[] offset = { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 };

		for (int i = 0; i < 10; i++) {
			pesel_no += (char) (rnd.nextInt(max_num[i]) + 48 + offset[i]);
			suma_psl += waga_psl[i] * (pesel_no.charAt(i) - 48);

		}

		String pesel_wynik = pesel_no + (10 - (suma_psl % 10)) % 10;

		return pesel_wynik;
	}

	public static String generateNip() {

		String nip_wynik = faker.numerify("##########");

		return nip_wynik;

	}

	public static String generateDoctorNo() {

		String doctor_no = faker.numerify("#######");

		return doctor_no;

	}

}