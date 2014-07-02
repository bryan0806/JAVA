import java.lang.Runnable;

public class FooRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int x=1;x<6;x++){
			System.out.println("Runnable running");
		}
	}

}
