import java.util.Scanner;
class Example
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();	//he34l$lo world

		s = s.toLowerCase();

		int countVowels=0, countCons=0;


		for(int i=0;i<=s.length()-1;i++)
		{
			if(Character.isLetter(s.charAt(i)))
			{
				if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
				{
					countVowels++;
				}
				else
				{
					countCons++;
				}
			}
		}

		System.out.println(countVowels);
		System.out.println(countCons);
	



	}
}