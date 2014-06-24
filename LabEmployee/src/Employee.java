
public class Employee {
	private Employee boss;
	private String ID;
	private double total_bonus;
	
	public Employee(String ID){
		this.ID=ID;
	}
	
	public Employee(String ID,Employee boss){
		this.ID=ID;
		this.boss=boss;
	}
	
	public void addBonus(double value){
		total_bonus += value/10;
		if(this.boss!=null){
			this.boss.addBonus(value/10);
		}
	}
	
	public double getBonus(){
		return total_bonus;
	}
	
	public String toString(){
		String print = "ID:" + ID + " Totol bonus: " + total_bonus ;
		return print;
	}
}
