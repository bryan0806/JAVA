
class Circle extends Shape {
	int radius;
	
	public Circle(){
		//Shape();// can not do this ..
		//super(); // 用此函數代表呼叫老爸的建構子 但若沒寫 程式會自動執行此行
		radius=0;
	}
	
	public Circle(int x,int y,int r){
		//Shape(x,y);// 會有錯誤
		super(x,y); // 老爸的建構子用super（）代替
		radius = r;
	}
	
	public void draw(){
		super.draw();
		System.out.println("the radius: " + radius);
	}
	
}
