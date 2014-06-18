class TestNum{
	static int max(int x,int y){
		if(x>y) return x;
		else return y;
	}

	static void swap(Number num){
		int temp;
		temp=num.num1;
		num.num1=num.num2;
		num.num2=temp;
	}

}
