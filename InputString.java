import java.io.Console;
public class InputString{
	public static void main(String args[]){
		Console console = System.console(); // 大寫Console 為物件名稱 小寫console 為"參考變數" java裡面唯一可控制物件的為參考變數 （類似c的指標概念）
		String str1,str2;

		System.out.println("請輸入第一個字串:");
		str1=console.readLine();
		System.out.println("請輸入第二個字串:");
		str2=console.readLine();
		System.out.println("你輸入的字串如下:");
		System.out.println(str1);
		System.out.println(str2);
		
		
	}
}
