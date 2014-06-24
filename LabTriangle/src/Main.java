import java.util.Random;;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTriangle [] objArr = new CTriangle[10];
		for(int i=0;i<10;i++){
			int [] tepobjArr = makeThreeNum();
			objArr[i]=new CTriangle(tepobjArr[0],tepobjArr[1],tepobjArr[2]);
			if(i==9){
				objArr[9].edge1=20;
				objArr[9].edge2=21;
				objArr[9].edge3=29;
			}
			String rightAngle = new String();
			if(objArr[i].isRightAngle()){
				rightAngle="是直角三角形";
			}else{
				rightAngle="不是直角三角形";
			}
			System.out.println("三邊為" + objArr[i].edge1 + " " + objArr[i].edge2 + " " + objArr[i].edge3 + " " + rightAngle);
			
		}
		
	}
	// 使用亂數建立三邊長 紀錄在整數陣列edge[3]中
	// 5<=edge[0]<=29 , edge[1] : 9~49 edge[2]: 29~89
	public static int [] makeThreeNum(){
		int [] edge= new int[3];
		Random a = new Random();
		int firstNum = a.nextInt(29);
		while(firstNum < 5){
			firstNum = a.nextInt(29);
		}
		edge[0]=firstNum;
		
		Random b = new Random();
		int secondNum = b.nextInt(49);
		while(secondNum < 9){
			secondNum = b.nextInt(49);
		}
		edge[1]=secondNum;
		
		Random c = new Random();
		int thirdNum = c.nextInt(89);
		while(thirdNum < 29){
			thirdNum = c.nextInt(89);
		}
		edge[2]=thirdNum;
		
		return edge;
	}

}
