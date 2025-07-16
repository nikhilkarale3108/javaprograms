import java.util.Scanner;
import java.util.Arrays;

class Example
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];	//

		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = sc.nextInt();
		}

		int start = 0, end = a.length-1;

		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i] + " ");
		}
		
		System.out.println();

		while(start<end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

		// System.out.println(Arrays.toString(a));

		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i] + " ");
		}



	}	
}