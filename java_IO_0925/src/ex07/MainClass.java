package ex07;

class A{
	private int age;
	private String name;
	
	public A(String name2, int age2) {
		this.name = name2;
		this.age = age2;
	}
	public void info() {
		System.out.println(name);
		System.out.println(age);
	}
}
class B extends A{
	private String address;
	private String phoneNum;
	
	public B(String name, int age, String address) {
		super(name, age);
		this.address = address;
	}

	public B(String name, int age, String address, String phoneNum) {
		this(name, age, address);
		this.phoneNum = phoneNum;
	}

	public void info() {
		super.info();
		System.out.println(address);
	}

	public void info2() {
		System.out.println(address);
	}

}

public class MainClass {

	public static void main(String[] args) {
		A b = new B("mimi", 30, "장안구");
		b.info();
		
		B bb = (B)b;
		bb.info2();
	}
	

}
