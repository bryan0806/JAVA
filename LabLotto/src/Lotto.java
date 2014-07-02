import java.lang.*;
import java.util.Scanner;
import java.io.*;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("請輸入陣列大小");
		int lottoSize=0;
		try{
			lottoSize=Integer.parseInt(input.nextLine()); // if user enter a non integer, parseInt will throw an exception NumberFormatException NumberFormatException 
			if( (lottoSize>48) || (lottoSize<6) )
				throw new CmyException1();
		}catch(NumberFormatException e){
			System.out.println("球數不為數字，將被設定為六球");
			lottoSize=6;
		}catch(CmyException1 e){
			e.showMessage();
			lottoSize=e.changeSize();
		}finally{
			System.out.println("樂透開獎球數為" + lottoSize);
		}
		
		int lottoAry[] = new int[lottoSize];
		System.out.println("存放樂透開獎的陣列實體產生完畢");
		
	}

}
