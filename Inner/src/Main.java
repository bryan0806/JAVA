
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyOuter.MyInner inner = new MyOuter().new MyInner();
		inner.seeOuter();
	}

}
