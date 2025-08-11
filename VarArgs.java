package OOPS;

public class VarArgs {
	static	int minValue(int... vals)
	{
		int min= Integer.MAX_VALUE;
		for (int K:vals)
		{
			if (K<min)
				min=K;

		}
		return min;
	}
	public static void main(String[] args) {
		int m=minValue();
		System.out.println(m);
		int n=minValue(4,2,5,2,6);
		System.out.println(n);
	}
}
