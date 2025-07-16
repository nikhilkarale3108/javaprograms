// import java.util.HashMap;
import java.util.LinkedHashMap;

class Example
{
	public static void main(String[] args) {
		int a[] = {5, 8, 3, 5, 8, 5, 4, 6};

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		for(int i=0;i<=a.length-1;i++)
		{
				if(map.containsKey(a[i]))
				{
					map.put(a[i], map.get(a[i])+1);
				}
				else
				{
					map.put(a[i], 1);
				}
			}
		

		for(Integer key : map.keySet())
		{
			System.out.println(key +": "+ map.get(key));
		}

	}
}







