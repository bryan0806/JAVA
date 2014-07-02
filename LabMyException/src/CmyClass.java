import java.util.Scanner;
import java.lang.*;

public class CmyClass {
	private int numerator,denominator;
	public Scanner input = new Scanner(System.in);
	
	public void setValue() throws NumberFormatException{
		System.out.println("數入分子");
		numerator = Integer.parseInt(input.nextLine());
		System.out.println("數入分母");
		denominator = Integer.parseInt(input.next());
		System.out.println("資料數入完畢");
	}
	
	public void printValue() throws ArithmeticException{
		System.out.println("除法結束為" + numerator/denominator);
		System.out.println("除法執行完畢");
	}
}
