package utilities;

import java.util.Locale;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class StaticElements {

	// static variables used all over the project
	

	protected static WebDriver driver;
	public static String baseUrl;
	protected static boolean result;

	public static Faker faker = new Faker(new Locale("pl"));
	public static Name name = faker.name();
	public static Address address = faker.address();
	public static Random rnd = new Random();
	
	



}
