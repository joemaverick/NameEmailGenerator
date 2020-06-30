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
		System.out.println("Name: " + fullName);
		System.out.println("Email:  " + email);
		
		Integer total_visits = rand.nextInt(20);
		System.out.println("Total Visits: " + total_visits);
		
		String lead_source[] = new String[] {"Google","Olark Chat","Direct Traffic","Organic Search","Referral Site"};
		System.out.println("Lead Source: " + lead_source[rand.nextInt(4)]);
		
		String percentage_completion[] = new String[] {"25%", "50%","75%","100%"};
		System.out.println("Form Completion: " + percentage_completion[rand.nextInt(3)]);
		
		Integer total_time_spent = rand.nextInt(30);
		System.out.println("Total Time Spent: " + total_time_spent + " minutes");
		
		String new_business[] = new String[] {"Yes","No"};
		System.out.println("New Business: " + new_business[rand.nextInt(1)]);
		
		String get_updates[] = new String[] {"Yes","No"};
		System.out.println("Get Updates: " + get_updates[rand.nextInt(1)]);
		
		String lead_origin[] = new String[] {"API","Landing Page Submission"};
		System.out.println("Lead Origin: " + lead_origin[rand.nextInt(2)]);
		
		String do_not_email[] = new String[] {"Yes","No"};
		System.out.println("Email: " + do_not_email[rand.nextInt(1)]);
	
		String do_not_call[] = new String[] {"Yes","No"};
		System.out.println("Call: "+ do_not_call[rand.nextInt(1)]);
		
		Integer page_views = rand.nextInt(50);
		System.out.println("Page Views: " + page_views);
		
		String[] last_activity = new String[] {"Page Visited on Website","Email Opened","Unreachable","Converted to Lead","Olark Chat Conversation","SMS Sent","Email Link Clicked","Form Submitted on Website","Email Bounced","Unsubscribed"};
		System.out.println("Last Activity: " + last_activity[rand.nextInt(9)]);
		
		String[] page_type = new String[] {"Product","Career","Pricing","Promotion"};
		System.out.println("Page Type: " + page_type[rand.nextInt(3)]);
		
		String[] lead_quality = new String[] {"Not Sure","Low","Worst","High"};
		System.out.println("Lead Quality: " + lead_quality[rand.nextInt(3)]);
		
		String[] last_notable_activity = new String[] {"Email Opened", "Page Visited on Website", "Had a Phone Coversation", "Email Link Clicked","Unreachable",
				"Olark Chat Conversation","Email Bounced","SMS Sent","Unsubscribed","Form Submitted on Website","Had a Pone Conversation","SMS Sent"};
		System.out.println("Last Notable Activity: " + last_notable_activity[rand.nextInt(11)]);

		
	}

}
