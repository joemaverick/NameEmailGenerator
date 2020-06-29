
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class nameCreator {

	public static Random rand = new Random();

	public static String names[] = new String[21985];

	public static String fullName, firstName, lastName, email;

	public static String emailServices[] = new String[] { "@Hotmail.com", "@Yahoo.com", "@Gmail.com", "@Outlook.com" };

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new File("names.txt"));
			int count = 0;
			while (scanner.hasNextLine()) {
				names[count] = (scanner.nextLine());
				count++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		firstName = names[rand.nextInt(21984)];
		lastName = names[rand.nextInt(21984)];
		fullName = firstName + " " + lastName;
		email = firstName + lastName + emailServices[rand.nextInt(3)];
		System.out.println("Name = " + fullName);
		System.out.println("Email = " + email);

	}

}
