import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		System.out.println("輸入名稱（quit結束）");
		
		while(true){
			System.out.println("# ");
			String input = scanner.next();
			if(input.equals("quit"))
				break;
			list.add(input);
		}
		
		System.out.println("顯示輸入:");
		
		/* first way */
		for(int i=0;i<list.size();i++){
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		
		/*second way */
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		/* third way this one I am not familiar */
		
		for(String s : list){
			System.out.print(s + " ");
		}
		
	}

}
