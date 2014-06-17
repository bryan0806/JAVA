/* 此範例可看出java矩陣特性之一 ：二維陣列 每一列的長度可不同*/
public class testArray{
	public static void main(String[] args){
		int r1[]={1,2,3};
		int r2[]={1,2,3,4};
		int r3[]={1,2,3,4,5};
		int array2D[][]=new int[3][];
		array2D[0]=r1;
		array2D[1]=r2;
		array2D[2]=r3;
		for(int i=0;i<array2D.length;i++){
			for(int j=0;j<array2D[i].length;j++){
				System.out.print("array2D["+i+"]["+j+"]="+array2D[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
