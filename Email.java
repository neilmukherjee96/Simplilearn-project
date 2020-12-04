/* This project was collaborated on by Neil, Altaf, Aibek */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Email(String emailAddress) {
		super();
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return emailAddress;
	}

	public static final String regex = "^([A-Za-z0-9\\-_.]+)@(.+)$";

	public static void main(String[] args) {

		List<Email> emailList = new ArrayList<Email>();
		emailList.add(new Email("altafmquadri@gmail.com"));
		emailList.add(new Email("helger@att.net"));
		emailList.add(new Email("gator@att.net"));
		emailList.add(new Email("shrapnull@icloud.com"));
		emailList.add(new Email("fraterk@verizon.net"));
		emailList.add(new Email("cisugrad@me.com"));
		emailList.add(new Email("sburke@yahoo.com"));
		emailList.add(new Email("chrwin@sbcglobal.net"));
		emailList.add(new Email("ozhorov@gmail.com"));
		Scanner scanner = new Scanner(System.in);
		Pattern pattern = Pattern.compile(regex);
		int ctr = 0;
		while (ctr != 1) {
			System.out.println("Please enter an email address: ");
			String emailID = scanner.nextLine().toLowerCase();
			System.out.println(emailID);
			Matcher matcher = pattern.matcher(emailID);
			String valid = (matcher.matches() ? "valid" : "invalid");

			System.out.println("\nThe email " + emailID + " is " + valid);

			if (valid.equals("valid"))
				System.out
						.println(emailList.toString().contains(emailID) ? "\nThe email ID exists.\n" : "\n Email not found!\n");
			System.out.println("Do you want to search again? y/n");
			String n = scanner.nextLine().toLowerCase();
			if (n.equals("n"))
				ctr++;

		}

	}
}

