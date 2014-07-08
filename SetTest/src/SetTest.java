import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[] returnSetAdd = new boolean[5];
		Set s = new HashSet();
		int i=0;
		returnSetAdd[i++]=s.add("a");
		returnSetAdd[i++]=s.add(new Integer(42));
		returnSetAdd[i++]=s.add("b");
		returnSetAdd[i++]=s.add("a");
		returnSetAdd[i++]=s.add(new Object());
		
		for(int x=0;x<returnSetAdd.length;x++){
			System.out.println(returnSetAdd[x]+" ");
		}
		System.out.println("\n");
		for(Object o : s)
			System.out.println(o + " ");
		
	}

}
