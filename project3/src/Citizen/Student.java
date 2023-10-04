package Citizen;

public class Student extends Citizen {
 
	public Student() {
		super();
		//ToDo Auto-generated Constructor stub
		}
	private int rollno;
	private String collegename;
	public Student(int rollno,String collegename) {
		super();
		this.rollno=rollno;
		this.collegename=collegename;
	}
	public Student(String name,long aadharno,String address,long phno) {
		super(name,aadharno,address,phno);
	}
	public int getRollno() {
		return rollno;
		}
	public void setRollno(int rollno) {
		this.rollno=rollno;
	}
	public String getCollegename() {
		return collegename;
		}
	public void setcollegename(String collegename) {
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegename=" + collegename + "]";
	}
	}
		
	
	

