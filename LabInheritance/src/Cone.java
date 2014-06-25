
public class Cone extends Circle {
	int height;
	
	public Cone(){
		super();
		height=0;
	}
	
	public Cone(int x, int y, int r, int h){ // 這邊我忘了打上int 造成其他錯誤訊息（函數名稱與type名稱一樣） 有時錯誤訊息不是真的那邊錯誤
		super(x,y,r);
		height = h;
	}
	
	public void draw(){
		super.draw();
		System.out.println("height : " + height);
	}
	
	
}
