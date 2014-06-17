/* 此範例使用原始方式 讀取字串 可看出使用Console物件較方便*/

import java.io.*;
public class HelloWorld{
	public static void main(String argv[]) throws IOException{
		BufferedReader console=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("What is your name?");
		String name=null;
		name=console.readLine();
		System.out.println("Hello "+name);
	}
}
