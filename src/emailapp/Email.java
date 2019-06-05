package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "abccompany.com";
	
	// Constructor to receive first and last names
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		// System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department
		this.department = setDepartment();
		// System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
		// System.out.println("Your email is: " + email);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("New Worker: " + firstName + " " + lastName + "\nDepartment codes:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department Code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) { return "sales"; }
		else if(deptChoice == 2) { return "dev"; }
		else if(deptChoice == 3) { return "acct"; }
		else { return ""; }
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) { this.mailboxCapacity = capacity; }
	
	// Set the alternative email
	public void setAlternativeEmail(String altEmail) { this.alternateEmail = altEmail; }
	
	// Change the password
	public void changePassword(String password) { this.password = password; }
	
	public int getMailboxCapacity() { return mailboxCapacity; }
	public String getAlternateEmail() { return alternateEmail; }
	public String getChangePassword() { return password; }
	
	// Show Information
	public String showInfo() {
		return "NAME: " + firstName + " " + lastName +
			   "\nCOMPANY EMAIL: " + email +
			   "\nEMAIL CAPACITY: " + mailboxCapacity + "mb";
	}
	
}
