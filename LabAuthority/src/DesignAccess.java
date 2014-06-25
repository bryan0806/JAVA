
public class DesignAccess {
	private int chinese;
	private int english;
	private int math;
	
	public void setChi(int chi){
		chinese = chi;
	}
	
	protected void setEng(int eng){
		english = eng;
	}
	
	private void setMath(int ma){
		math=ma;
	}
	
	public void setMath2(int mat){
		this.setMath(mat);
	}
	
	public int getChi(){
		return chinese;
	}
	
	public int getEng(){
		return english;
	}
	
	public int getMath(){
		return math;
	}
}
