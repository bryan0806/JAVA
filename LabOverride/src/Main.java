
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		Child c = new Child();
		Father f2 = new Child();
		//Child c2 = new Father(); // can not do this 
		
		f.kao();
		c.kao();
		f2.kao();
		
	}

}
