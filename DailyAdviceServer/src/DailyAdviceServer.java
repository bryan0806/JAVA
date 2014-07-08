import java.io.*;
import java.net.*;

public class DailyAdviceServer {
	String[] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.", "One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think", "YOuuuuuuuuuuuuuuuu might want to rethink haircut."};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyAdviceServer server = new DailyAdviceServer();
		server.go();
	}
	
	public void go(){
		try{
			ServerSocket serverSocket = new ServerSocket(4200);
			while(true){
				Socket sock = serverSocket.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.println(advice);
				writer.close(); // must have THIS or flush() or it never writes
				System.out.println(advice);
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	private String getAdvice(){
		int random = (int)(Math.random()*adviceList.length);
		return adviceList[random];
	}

}
