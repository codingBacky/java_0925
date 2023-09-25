package ex08;



abstract class A{
	abstract void funcA();
}
class B extends A{
	void funcA() {
		System.out.println("BBB");
	}
}
class C extends A{

	@Override
	void funcA() {
		System.out.println("CCC");
	}

	
}
class D{
	void funcA() {
		System.out.println("DDD");
	}
	
}
public class MainClass {
	public static void main(String[] args) {
//		A a = new A();
//		a.funcA();
//		
//		A b = new B();
//		b.funcA();
//		
//		A c = new C();
//		c.funcA();
//		
//		Object d = new D();
//		
		
		
		conver(new MainClass());
		conver(new C());
	}
	static void conver(Object obj) {
		if (obj instanceof A) {
			A a = (A) obj;
			a.funcA();
		}
		System.out.println("conver");
	}

}
