import java.io.*;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("What is your name :");
		String name = null;
		try {
			name = console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello " + name);
	}

}
