
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a1 = new Employee("001");
		Employee a2 = new Employee("002",a1);
		Employee a3 = new Employee("003",a2);
		Employee a4 = new Employee("004",a3);
		
		a1.addBonus(10000);
		a2.addBonus(20000);
		a3.addBonus(30000);
		a4.addBonus(40000);
		System.out.println(a1.toString()+"\n"+a2.toString()+"\n"+a3.toString()+"\n"+a4.toString());
	}

}
