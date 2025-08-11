package OOPS;

public class overloding2 {
	/*static void test () {
		System.out.println("first Method");
	}
	static void test (int a) {
		System.out.println("second Method");
	}
	static void test (int a, int b) {
		System.out.println("Third Method");
	}
	static void test(int a,int b,int c) {
		System.out.println("Fourth Method");
	}
	public static void main(String[] args) {
		test();
		test(2,2);
		test(4);
		test(1,2,3);
	}
}
*/
	
	class overload{
		static int num1;
		static int num2;
		static int result;
		
		static void sum(int a,int b) {
			num1=a;
			num2=b;
			result=num1+num2;
			System.out.println(result);
					
		}
	static	void sum(int a, double b) {
			num1=a;
			num2=(int)b;
			result=num1+num2;
			System.out.println(result);
		}
		
		static void sum1(int a, double b) {
			num1=a;
			num2=(int)b;
			result=num1+num2;
			System.out.println(result);
		}
	public static void main(String[] args) {
		//overload obj=new overload();
		sum(10,20);
		sum1(2, 4.0);
		sum(4, 2.0);
		
		
	}
	}
}