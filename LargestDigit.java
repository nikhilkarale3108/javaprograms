class LargestDigit
{
	public static void main(String[] args) {
		int n = 126934;
		int largest = 0;

		int temp=n;
		int d=0;

		while(n!=0)
		{
			d = n%10;//1
			if(d>largest) //9>4
			{
				largest = d;	//9
			}
			n = n/10;
		}


	

		int secLargest = 0;

		//126934;
		while(temp!=0)
		{
			d = temp%10;//4
			if(d>secLargest && d!=largest)// 6>4 && 6!=9
			{
				secLargest = d;		//6
			}
			temp = temp/10;
		}
		System.out.println(largest);

		System.out.println(secLargest);
	}
}


Harshad Number

18 is said to harshad number
1+8 = 9

and 18%9==0
