package OOPS;

public class Passingrefdemo {
	static void increment(int a)
	{
		a++;
	}
	static void increment1(int b)
	{
		b++;
	}

	public static void main(String[] args) {
		int a=10;
		int b=21;
		increment(a);
		increment1(b);
		System.out.println(a);
		System.out.println(b);
	}
}
