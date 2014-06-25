
public class Main {

	public static void main(String[] args) {
		Circle c = new Circle(3,4,5);
		System.out.println("I created a circle with 3 parameters");
		c.draw();
		System.out.println("I created a Cone with no parameters");
		Cone co = new Cone();
		co.draw();
		
	}

}
