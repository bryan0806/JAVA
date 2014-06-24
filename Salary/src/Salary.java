
public class Salary {
	int hour;
	double fee;
	
	void setValue(int hour,double fee){
		this.hour = hour;
		this.fee = fee;
	}
	
	Double compute(){
		return hour*fee;
	}
}
