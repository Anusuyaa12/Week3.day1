package Week3.day1;

public class AxisBank extends BankInfo {
	
	public void deposit()

	{

		System.out.println("My deposit account");
	}

	public static void main(String[] args) {
		
	
		AxisBank money = new AxisBank();
		money.deposit();
		money.saving();
		money.fixed();
		
		}
		
		
	}


