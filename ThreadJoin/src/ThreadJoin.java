import java.io.*;

public class ThreadJoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCar obj1 = new CCar("Ford");
		CCar obj2 = new CCar("Toyota");
		CCar obj3 = new CCar("Honda");
		
		
		obj2.start();
		//obj1.start();// 如果有此行 會同時印出 obj2 obj1 ...
		try {
			obj2.join();// 等到本執行序完成後才往下執行其他程式
			System.out.println("obj2 執行序已經完成工作");
			obj1.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*try {
			obj1.join();
			System.out.println("obj1 執行序已經完成工作");
			obj3.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

}
