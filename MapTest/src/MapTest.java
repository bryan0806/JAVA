import java.util.*;

class Dog{
	public Dog(String n){name = n; }
	public String name;
	public boolean equals(Object o){
		if((o instanceof Dog) && (((Dog)o).name==name)){
			return true;
		}else{
			return false;
		}
	}
	
	public int hashCode(){return name.length();} //程式判斷是否兩個物件是否相等時會在equals之後自動呼叫
}

class Cat { }

enum Pets { DOG, CAT, HORSE }

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> m = new HashMap<Object,Object>();
		m.put("k1", new Dog("aiko"));   //#1
		m.put("k2", Pets.DOG);   //#2
		m.put(Pets.CAT, "CAT key"); //#3
		
		Dog d1 = new Dog("clover"); // let's keep this reference
		m.put(d1, "Dog key");  //#4
		
		m.put(new Cat(), "Cat key"); //$5
		
		System.out.println(m.get("k1"));
		
		String k2 = "k2";
		System.out.println(m.get(k2));
		System.out.println(m.get("k2"));
		
		Pets p = Pets.CAT;
		System.out.println(m.get(p));
		
		System.out.println(m.get(d1));
		
		System.out.println(m.get(new Cat()));
		
		System.out.println(m.size());
		
		System.out.println("======================================");
		
		d1.name = "magnolia"; // changing name 等於是讓d1控制了不同的物件 在這邊便成了空物件
		System.out.println(m.get(d1));
		
		System.out.println(m.size()); 
		System.out.println("======================================");
		Collection collection = m.values();
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		
	}

}
