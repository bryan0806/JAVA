import java.lang.*;
import java.util.*;

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CmyClass obj = new CmyClass();
		try{
			obj.setValue();
			obj.printValue();
		}catch(NumberFormatException e){
			System.out.println("例外產生：請輸入數字");
		}catch(ArithmeticException e){
			System.out.println("例外產生：分母為0");
		}catch(Exception e){
			System.out.println("有為考慮到的例外發生");
		}finally{
			System.out.println("finally....");
		}
	}

}
