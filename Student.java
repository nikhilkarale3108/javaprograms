import java.util.Scanner;
public class Student
{
	private int rollNo; //instance variable
	private String name;
	private char grade;
	private static String collegename = "Sipna CoET"; //class variable



	static void change()	//non-static -> static & non static
	{

		collegename = "Sipna";
	}

	public Student()
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your roll number - ");
		rollNo = sc.nextInt();
		sc.nextLine();	//for any leftover
		System.out.println("Enter your name - ");
		name = sc.nextLine();
		System.out.println("Enter your grade - ");
		grade = sc.next().charAt(0);

	}

	public void displayInfo()
	{
		System.out.println("Roll Number = " +this.rollNo);
		System.out.println("Name = " +this.name);
		System.out.println("Grade = " +this.grade);
		System.out.println("College Name = " +this.collegename);
		
	}
}


class Demo
{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.displayInfo();
		s1.change();
		Student s2 = new Student();
		s1.displayInfo();		
		s2.displayInfo();


	}
}