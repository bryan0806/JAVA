
public class CB {
	public void runMethod1(){
		//匿名類別開始
		CA obj1 = new CA (){
			public void show1(){
				System.out.println("這是由匿名類別改寫的show1 函式");
				System.out.println(",Var=" + Var);
			}
			public void show3(){
				System.out.println("這是由匿名類別改寫的show3 函式");
				System.out.println(",Var=" + Var);
			}
		}; // 匿名函式結束
		obj1.Var=50;
		obj1.show1();
		obj1.show2();
		//obj1.show3(); // 無法執行新增的show3函式
		CA obj2 = new CA();
		System.out.println("-------------------------------");
		obj2.Var=30;
		obj2.show1();
		obj2.show2();
	}
}
