public class main{
public static void main(String[] args){
	Number mynum=new Number();
	mynum.num1=2;
	mynum.num2=7;

	System.out.println(TestNum.max(mynum.num1,mynum.num2));
	
	TestNum.swap(mynum);
	
	System.out.println("num1:"+mynum.num1+"  num2:"+mynum.num2);

}
}
