package SuperDemo;
//super keyword example program
class parent
{
	int var=100;
}

public class SuperDemo extends parent {
	int var=50;
	void display() {
		System.out.println("the values"+var);
		System.out.println("the values"+super.var);
	}
	public static void main(String[]args) {
		//Tool auto-generated method stub
		SuperDemo ob=new SuperDemo();
		ob.display();
	}

}
