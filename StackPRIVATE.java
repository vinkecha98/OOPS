package OOPS;

public class StackPRIVATE 
{
	private int s[]=new int[10];
	private int tos;
	void Stack()
	{
		tos=-1;
	}
	void push(int item)
	{
		if(tos==9)  /// wrong
			System.out.println("Stack is full");
		else

			s[++tos]=item;

	}
	int pop()
	{
		if (tos>=0)
			return s[tos--];
		else 
			System.out.println("Empty");
		return -1;
	}

	public static void main(String[] args)
	{
		Stack s1=new Stack ();
		s1.push(2);
		s1.push(4);
		s1.s[7]=100;
		System.out.println(s1.pop());
	}
}
