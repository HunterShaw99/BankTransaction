
/**
 * Class for representing bank transactions.
 * @author: Hunter M. Shaw
 */

public class BankTransaction implements Comparable<BankTransaction> {
	private int sender, recipient;
	private double amount;


	public BankTransaction(int sender, int recipient, double amount) {
		this.sender = sender;
		this.recipient = recipient;
		this.amount = amount;
	}

	public int getSender() {
		return sender;
	}

	public void setSender(int sender) {
		this.sender = sender;
	}

	public int getRecipient() {
		return recipient;
	}

	public void setRecipient(int recipient) {
		this.recipient = recipient;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int compareTo(BankTransaction o) {
		if(this.getAmount() == o.getAmount()) {
			return 0;
		} else if(this.getAmount() < o.getAmount()) {
			return -1;
		} else {
			return 1;
		}

	}

	//Takes in an object, Check to make sure it is an instance of Bank.
	@Override
	public boolean equals(Object o) {
		if (!(this instanceof BankTransaction && o instanceof BankTransaction)) {
			return false;
		}
		BankTransaction bt = (BankTransaction)o;
		return (this.getAmount() == bt.getAmount() && this.getSender() == bt.getSender() && this.getRecipient() == bt.getRecipient());

	}

	@Override
	public String toString() {
		return "Sender: {"+this.sender+
		"} Recipient: {"+this.recipient+
		"} Amount: {"+this.amount+"}";
	}


}
