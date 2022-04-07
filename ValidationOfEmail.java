package Code2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Code by Abhishek Mukherjee

public class ValidationOfEmail {
	public static boolean isValidEmail(String email) {
		 String regex = "^(.+)@(.+)$*";
		 
		 //initialize the Pattern object
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 return matcher.matches();
		 
		 }
		 public static void main(String[] args) {
		 List<String> emails = new ArrayList<String>();
		 System.out.println("By");
		 System.out.println(" ");
		 System.out.println("Abhishek Mukherjee");
		 System.out.println(" ");
		 
		 // valid email addresses
		 emails.add("Abhishek@yahoo.com");
		 emails.add("Abhi15@gmail.com");
		 emails.add("Rahul45@rao.me.org");
		 
		 //invalid email addresses
		 emails.add("Gaurav.Gmail.com");
		 emails.add("Babu@..bob@Yahoo.com");
		 emails.add("Priya@.Gmail.com");
		 for (String value : emails) {
	     System.out.println("The Email address " + value + " is " + (isValidEmail(value) ?"valid":"invalid"));
		 }
		 System.out.println(" ");
		 
		 System.out.println("Enter any email address to check its Validity");
		 try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();
			 System.out.println("The Email address " + input + " is " + (isValidEmail(input) ?"valid":"invalid"));
		}

		 }
	}
