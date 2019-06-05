package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Hadhi","Jawahir");		
		
		/*
		em1.setMailboxCapacity(1000);
		System.out.println(em1.getMailboxCapacity());

		em1.changePassword("123");
		System.out.println(em1.getChangePassword());
		
		em1.setAlternativeEmail("alternate@email.com");
		System.out.println(em1.getAlternateEmail());
		*/
		
		System.out.println(em1.showInfo());
		
	}

}
