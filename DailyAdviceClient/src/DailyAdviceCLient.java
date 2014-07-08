import java.io.*;
import java.net.*;

public class DailyAdviceCLient {

	public void go(){
		try {
			Socket s = new Socket("127.0.0.1",4200);
			InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			String  advice = reader.readLine();
			System.out.println("Today you should: " + advice);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyAdviceCLient client = new DailyAdviceCLient();
		client.go();
	}

}
