
class Shape {
	int x;
	int y;
	
	public Shape(){ // 通常需要建立一個無參數建構子 讓程式自動執行
		x=0;
		y=0;
	}
	
	public Shape(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public void draw(){
		System.out.println("x: " + x +", y: " + y);
	}
}
