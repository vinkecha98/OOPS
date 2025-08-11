package OOPS;

public class Fibonacci {
	public static void main(String[] args) {
		int n=10, Firstnum=0, secondnum=1;
		//int sum;
		System.out.println("This IS FIBONACCI NUMBER");
		for (int i=1;i<=n;i++) {
			
		System.out.print(Firstnum+" , ");
			int sum=Firstnum + secondnum;
			Firstnum=secondnum;
			secondnum=sum;
		}
	}
}
