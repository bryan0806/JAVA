
class MyOuter {
	private int x = 7;
	public void makeInner(){
		MyInner in=new MyInner();
		in.seeOuter();
	}
	
	class MyInner{
		public void seeOuter(){
			System.out.println("outer x is "+x);
		}
	}
	
}
