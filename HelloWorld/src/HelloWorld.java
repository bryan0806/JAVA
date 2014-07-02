import java.io.*;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("What is your name :");
		String name = null;
		name = console.readLine();
		System.out.println("Hello " + name);
	}

}
