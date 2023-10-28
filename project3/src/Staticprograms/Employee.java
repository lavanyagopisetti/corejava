package Staticprograms;

public class Employee {
	//instance variable
	private String name;
	private int id;
	//declare static variables
	static String companyName="TNS";
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ",company=" + companyName+"]";
	}
}
	