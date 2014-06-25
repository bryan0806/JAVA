
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings john = new Savings();
		Savings mary = new Savings();
		Savings tom = new Savings();
		
		john.deposit(200);
		mary.deposit(300);
		tom.deposit(400);
		
		System.out.println("john's balance is " + john.getBalance());
		System.out.println("mary's balance is " + mary.getBalance());
		System.out.println("tom's balance is " + tom.getBalance());
		
		john.withdraw(200);
		mary.withdraw(300);
		tom.withdraw(100);
		
		System.out.println("john's balance is " + john.getBalance());
		System.out.println("mary's balance is " + mary.getBalance());
		System.out.println("tom's balance is " + tom.getBalance());
		
	}

}
