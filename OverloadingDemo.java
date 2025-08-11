package OOPS;
/*
 * Method
 * 
 * */
public class OverloadingDemo {
	/*static int  max(int a,int b) {
		return a>b?a:b;
	}
	static char max(char a,char b) {
		return a>b?a:b;
	}
	static double max (double a , double b) {
		return a>b?a:b;
	}


	public static void main(String[] args) {
	
		System.out.println(max(5,7));
		System.out.println(max('a', 'b'));
		System.out.println(max(7.0,8.0));
	}
}*/

	/* write overloaded method to find average of 2 or 3 number*/


	static double avg(double num, double num2) {
		return(num + num2);
	}
	static double avg(double num3,double num4, double num5) {
		return(num3+num4+num5);
	}
	public static void main(String[] args) {

		double avg2=avg (10.2,20.6);
		System.out.println(avg2);
		double avg3=avg (44.2, 44.1, 66.7);
		System.out.println(avg3);
	} 
}
