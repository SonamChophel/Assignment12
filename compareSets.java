import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class compareSets 
{
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) 
	{
		Set<Integer> c1 = new HashSet<>();
		Set<Integer> c2 = new HashSet<>();
		
		System.out.println("Enter values for first set");
		for(int i=1 ; i<=5 ; i++)
		{
			int val = ip.nextInt();
			c1.add(val);
		}
		System.out.println("Enter values for second set");
		for(int i=1 ; i<=5 ; i++)
		{
			int val = ip.nextInt();
			c2.add(val);
		}
		c1.retainAll(c2);
		System.out.println("Elements that are common in both sets :");
		System.out.println(c1);
	}

}
