

public class Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendThread et = new ExtendThread();
		et.start();
		
		// second way to start thread, but failed .... do not know why
		/* FooRunnable fr = new FooRunnable();
		Thread t  = new Thread(fr);
		t.start();*/
		
		
	}

}
