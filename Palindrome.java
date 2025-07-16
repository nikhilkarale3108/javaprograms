import java.util.Scanner;
import java.util.Arrays;

class Example
{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int a[] = new int[size];	

		for(int i=0;i<=a.length-1;i++)
		{
			a[i] = sc.nextInt();
		}	//1 2 3 2 1

		int start=0, end = a.length-1;
		boolean f = true;
		
		while(start<end)
		{
			if(a[start] != a[end])
			{
				f = false;
				break;
			}
			start++;
			end--;
		}

		if(f)
		{
			System.out.println("Palindrome Array");
		}
		else
		{
			System.out.println("Not Palindrome Array");
		}
		}

		
	}	


