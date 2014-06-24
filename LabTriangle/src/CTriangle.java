
class CTriangle {
	public int edge1,edge2,edge3; // 紀錄三邊長
	
	public CTriangle(){ //預設建構函數 預設三邊長為3,4,5
		edge1=3;
		edge2=4;
		edge3=5;
	}
	
	public CTriangle(int a,int b,int c){ //建構函數 給定三邊
		edge1=a;
		edge2=b;
		edge3=c;
	}
	
	private boolean isLegal(int a,int b,int c){ //判斷是否為合法的三邊長
		if(a+b > c) return true;
		else if(a+c > b) return true;
		else if(b+c > a) return true;
		else return false;
	}
	
	public boolean isRightAngle(){ //判斷是否為直角三角型
		if(isLegal(edge1,edge2,edge3)){
		if(((edge1*edge1) + (edge2*edge2))== (edge3*edge3)) return true;
		else if(((edge1*edge1) + (edge3*edge3))== (edge2*edge2)) return true;
		else if(((edge2*edge2) + (edge3*edge3))== (edge1*edge1)) return true;
		else return false;
		}else{
			System.out.println("not a legal triangle length");
			return false;
		}
	}
	
}
