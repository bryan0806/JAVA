
public class Savings {
	static int balance;
	
	void deposit(int money){
		balance += money; 
	}
	
	void withdraw(int money){
		balance -= money;
	}
	
	int getBalance(){
		return balance;
	}
}
