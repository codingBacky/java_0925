package ex05;

class A{}
class B extends A{}
class C extends B{}

//제네릭 클래스
class Box<T extends A> {
	private T obj;
	
	void setObj(T ap) {
		this.obj = ap;
	}
	T getObj(){
		return obj;
	}
}
public class Generices04 {
	public static void main(String[] args) {
		Box<A> abox = new Box();
		Box<B> bbox = new Box();
		Box<C> cbox = new Box();
		
		
	}
}


