
public class BankDriver {

	public static void main(String[] args) {
		BankTransaction b1 = new BankTransaction(123, 234, 771.67);
		System.out.println("Wire#1 "+b1.toString()); //Print out initial bank transaction information b1
		b1.setSender(512); //Should change Sender to 512
		b1.setRecipient(1024); //Should change Recipient to 1024
		b1.setAmount(1337.01); //Should change Amount to 1337.01
		System.out.println("Edited Wire: "+b1.toString()); //Print out the edited information
		BankTransaction b2 = new BankTransaction(1, 2, 12.47); 
		System.out.println("Wire#2 "+b2.toString()); //Print out initial bank transaction information b2
		b2.setSender(128); //Should change Sender to 128
		b2.setRecipient(64); //Should change Recipient to 64
		b2.setAmount(32.01); //Should change Amount to 32.01
		System.out.println("Edited Wire: "+b2.toString()); //Print out the edited information
		System.out.println(b1.compareTo(b2));
		System.out.println(b1.equals(b2));
		b1.setSender(444);
		b1.setRecipient(555);
		b1.setAmount(650);
		b2.setSender(444);
		b2.setRecipient(555);
		b2.setAmount(650);
		System.out.println(b2.compareTo(b1));
		System.out.println(b2.equals(b1));
	}

}
