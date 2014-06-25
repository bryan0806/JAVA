
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessCtrl john = new AccessCtrl();
		
		john.setHeight(170);
		john.setWeight(60);
		john.setSalary(20000);
		
		System.out.println("john's height is " + john.getHeight());
		System.out.println("john's weight is " + john.getWeight());
		//System.out.println("john's salary is " + john.getSalary()); // error happened
		
		DesignAccess student = new DesignAccess();
		student.setChi(60);
		student.setEng(90);
		student.setMath2(99);
		
		System.out.println("student's chinese score : " + student.getChi());
		System.out.println("student's english score : " + student.getEng());
		System.out.println("student's math score : " + student.getMath());
		
	}

}
