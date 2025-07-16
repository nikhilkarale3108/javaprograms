import java.util.Arrays;
class AnagramExample
{
	public static void main(String[] args) {
		String s1 = "nice listen";
		String s2 = "CiNe  siLenT";


		s1 = s1.replaceAll(" ","");
		s2 = s2.replaceAll(" ","");

		if(s1.length()==s2.length())
		{
			s1 = s1.toLowerCase();	//nice
			s2 = s2.toLowerCase();	//cine

			


			char ch1[] = s1.toCharArray();	//n   i  c  e
			char ch2[] = s2.toCharArray(); // c   i  n  e

			Arrays.sort(ch1);	//c e i n
			Arrays.sort(ch2);	//c e i n


			boolean f = Arrays.equals(ch1, ch2);

			if(f)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not Anagram string");

			}

		}
		else
		{
				System.out.println("Not Anagram");
		}
	}
}
