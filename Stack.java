package OOPS;

public class Stack {
	int s[]=new int [10];
	int tos;

	Stack() 
	{
		tos= -1;   //   this line ToP Of Stack IS Decrement
	}

	void push(int item)
	{
		if(tos==9)
			System.out.println("stack is full");
		else
			s[++tos]=item;    //  this line Top of stack increment 

	}
	int pop()
	{
		if(tos>=0)
			return s[tos--];
		else 
			System.out.println("empty");
		return -1;
	}



	//public class Stackdemo {
	public static void main(String[] args) {

		Stack s1=new Stack ();

		s1.push(2);
		s1.push(5);
		s1.push(25);
		System.out.println(s1.pop());

	}
}
