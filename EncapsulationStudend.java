package OOPS;

public class EncapsulationStudend {
	int rollNumber;
	String name;
	boolean isAttended;


/*	public EncapsulationStudend (int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	public void setEncapsulationStuden(boolean flag)
	{
		if (isAttended)
		isAttended=flag;
		System.out.println("teacher is Present");
	}
	public boolean getEncapsulationStuden()
	{
		System.out.println("Teacher acessed studend");
		return isAttended;
	}*/
	
	public EncapsulationStudend(int rollNumber) 
	{
		this.rollNumber=rollNumber;
	}
	
	public  EncapsulationStudend(String name)
	{
		this.name=name;
	}
	void setEncapsulationStudend( String vinodh)

	{
		String name="vinodh";
		System.out.println(name);
	}
	String getEncapsulationStudend1()
	{
		return name;
	}
	public void setEncapsulationStudend(boolean vino)
	{
		if(isAttended)
		isAttended=vino;
		System.out.println("Vino is Present");
	}
	public boolean getEncapsulationStudend()
	{
		System.out.println("vino Attendend Acceces");
		return isAttended;
	}
}