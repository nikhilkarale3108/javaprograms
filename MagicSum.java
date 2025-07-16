class Example
{
	public static void main(String[] args) {
		int n = 1729;
		int s = 0;

		while(n>9)	//19
		{
			s = 0;
			while(n!=0) //19
			{
				int d = n%10;	//9
				s = s + d;	//0 + 9
				n = n / 10; //0
			}
			n = s;	//19-> n

		}


		System.out.println(s);
			// s = 19
	}
}