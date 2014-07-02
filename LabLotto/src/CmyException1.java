
public class CmyException1 extends Exception {
	public CmyException1(){ //constructor
		super();
	}
	
	public void showMessage(){
		System.out.println("例外訊息：陣列大小錯誤");
	}
	
	public int changeSize(){
		System.out.println("例外訊息：陣列大小將被重設為6");
		return 6;
	}
}
