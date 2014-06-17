/*labs page 45*/
/*執行結果如下：
 * [root@localhost 15:20:50 JAVA]# java ArrayCopy
 * Before (original)       []
 * Before (copy)           [null, null, null, null]
 * Before (original)       []
 * Before (copy)           [A, B, C, D]
 * [root@localhost 15:20:57 JAVA]# java ArrayCopy 1 2 3 4
 * Before (original)       [1, 2, 3, 4]
 * Before (copy)           [1, 2, 3, 4]
 * Before (original)       [1, 2, 3, 4]
 * Before (copy)           [A, B, C, D]
 * [root@localhost 15:21:05 JAVA]# 
 * [root@localhost 15:21:05 JAVA]# java ArrayCopy 1 2 3 4 5
 * Before (original)       [1, 2, 3, 4, 5]
 * Before (copy)           [1, 2, 3, 4]
 * Before (original)       [1, 2, 3, 4, 5]
 * Before (copy)           [A, B, C, D]
 * [root@localhost 15:25:09 JAVA]# 
 *
*/
import java.util.Arrays;
public class ArrayCopy{
	public static void main(String args[]){
		System.out.printf("Before (original)\t%s%n",Arrays.toString(args));
		String copy[]=Arrays.copyOf(args,4);
		System.out.printf("Before (copy)\t\t%s%n",Arrays.toString(copy));
		copy[0]="A";
		copy[1]="B";
		copy[2]="C";
		copy[3]="D";
		System.out.printf("Before (original)\t%s%n",Arrays.toString(args));
		System.out.printf("Before (copy)\t\t%s%n",Arrays.toString(copy));
		
	}
}
