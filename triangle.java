public class triangle{
	public static void main(String[] args){
		int[] array={1,0,0,0,0,0,0,0,0};
		
		for(int j=0;j<9;j++){
			for(int n:array)
				System.out.print(n+" ");
				
		for(int i=0;i<array.length;i++){
			//System.out.print(array[i]+" ");
			if(i<8){
			array[8-i]=array[8-i]+array[7-i];
			}	
		}	
			System.out.println("");
		}

	}
}
