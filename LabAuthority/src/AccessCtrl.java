
public class AccessCtrl {
	private int height;
	private int weight;
	private int salary;
	
	public int getHeight(){
		return height;
	}
	
	protected int getWeight(){
		return weight;
	}
	
	private int getSalary(){
		return salary;
	}
	
	public void setHeight(int h){
		height = h;
	}
	
	public void setWeight(int myWeight){
		weight = myWeight;
	}
	
	public void setSalary(int mySalary){
		salary = mySalary;
	}
	
	
}
