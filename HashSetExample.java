import java.util.HashSet;
import java.util.Arrays;

class HashSetExample
{
	public static void main(String[] args) {

		int a[] = {4, 6, 1, 3, 6, 9, 1};
		
		HashSet<Integer> set = new HashSet<>();
	
		for(int i=0;i<=a.length-1;i++)
		{
			if(!set.add(a[i]))
			{
				System.out.print(a[i] + " ");
			}
		}

	}
}