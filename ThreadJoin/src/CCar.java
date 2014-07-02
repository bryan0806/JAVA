
public class CCar extends Thread {
	String manufacturer;
	public CCar(String str){ manufacturer = str; }
	
	public void run(){ // JVM自動執行
		
		for(int i=1;i<=20;i++){
			
			/*try { // sleep 似乎中間沒被中斷
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			
			for(int j=1;j<1000000000;j++)
				; // empty loop
			System.out.println(manufacturer + " is running");
			
		}
		
	}
}
