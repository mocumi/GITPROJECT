package Exam;

public class Q2 
{
	String str = "default";
	Q2(String s)
	{
		str=s;
	}
	
	void print()
	{
		System.out.print(str);
		
	}

	public static void main(String[] args) 
	{
		new Q2("hello").print();
	}

}
