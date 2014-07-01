
public class Outer {
	private int x =7;
	public void makeInner(){
		Inner in = new Inner();
		in.seeOuter();
	}
	
	class Inner{
		public void seeOuter(){
			System.out.println("Oooooooooooooooouter x is " + x);
			System.out.println("Inner class ref is " + this);
			System.out.println("Outer class ref is " + Outer.this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner inner = new Outer().new Inner();
		inner.seeOuter();
	}

}
