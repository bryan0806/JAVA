import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		Scanner userInputscanner = new Scanner(System.in);
		MaxOverload findmax = new MaxOverload();
		
		System.out.println("Input 2 integer numbers:");
		x= userInputscanner.nextInt();
		y= userInputscanner.nextInt();
		
		System.out.println("The bigger one is " + findmax.maxValue(x, y));
		
		System.out.println("Input 2 double numbers:");
		double i= userInputscanner.nextDouble();
		double j= userInputscanner.nextDouble();
		
		System.out.println("The bigger one is " + findmax.maxValue(i, j));
		
	}

}
