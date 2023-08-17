import java.util.Scanner;
public class Bank{
	public static void main(String[] args){
	Account acc = null;
	Scanner sc = new Scanner(System.in);

	while(true)
	{
	System.out.println("1. Create Account ");
	System.out.println("2. Deposit ");
	System.out.println("3. Withdraw ");
	System.out.println("4. Details ");
	System.out.println("5. Exits ");

	System.out.println("Enter an Option: ");
	int opt = sc.nextInt();

	switch(opt)
	{
		case 1: // Create Account
			if(acc == null ){
				System.out.print("Enter account number: ");
				long acno = sc.nextLong();
				sc.nextLine();

				System.out.print("Enter account holder's name: ");
				String name = sc.nextLine();

				System.out.print(" ENter initial deposit: ");
				float amt = sc.nextFloat();

				acc = new Account(acno, name, amt);
				System.out.println("Account Created !");
			}else{
				System.out.println("FYI : Account is already created ! ");
			}
		break;
		case 2: // Deposit
			if(acc != null){
				System.out.print("Enter amount to deposit: ");
				float amt = sc.nextFloat();
				acc.deposit(amt);
			}
			else{
				System.out.println("FYI: Create Account First!");
			}
		break;
		case 3: // Withdraw
			if(acc != null){
				System.out.print("Enter amount to Withdraw");
				float amt = sc.nextFloat();
				acc.withdraw(amt);
			}else{
				System.out.println("FYI : Create Account First!");
			}
		break;
		case 4: // Details
			if(acc != null){
				acc.getBalance();
			}else{
				System.out.println("FYI: Create Account First !");
			}
		break;
	    case 5: // terminate application
	    	System.out.println("----BYE BYE----");
	    	System.exit(0);
	    	break;
	    default:
	    	System.out.println("Invalid Option.. Try Again..");

	}//switch
		    	System.out.println("----BYE BYE----");



	}//while
	}
}