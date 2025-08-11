package OOPS;
/* Single 
 * Multiple
 * multilevel
 * Hierarchical
 * Hybrid
 * 
 *   This are Inheritance  
 */

class Employee {
  	 private String name;
	private double salary;
	Employee(String n,double s)
	{
		name =n;
		salary =s;
	}
	public String getname(){
		return name;
	}
	public void setname(String n )
	{
		name =n;
	}
	public double getsalary()
	{
		return salary;
	}
	public void setsalary(double s)
	{
		salary=s;
	}
	void raisesalary(double percent)
	{
		salary=salary*percent/100;
	}
}
 class manager extends Employee{
	private double bonus;
	 manager(String n,double s,double b){
		super(n,s);
		//name=n;
		//salary=s;
		bonus=b;
		//super manager;		 
	 }
	public void setbonus(double b) {
		 bonus=b;
	 }
	  
 }
public class InheritanceDemo {
	public static void main(String[] args) {
		Employee emp=new Employee("vinodh",45000);
		emp.setname("vinodh");
		System.out.println(emp.name);
		emp.raisesalary(10);
		System.out.println(emp.getsalary());
		manager m1=new manager("vino",150252,0.0);
		m1.setname("VINO");
		System.out.println(m1.name);
		m1.setbonus=44444;
		System.out.println(m1.getsalary);
	}
}
