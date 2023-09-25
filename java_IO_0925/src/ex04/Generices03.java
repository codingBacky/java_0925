package ex04;

class Apple {
	public String toString() {
		return "im an apple";
	}
}
class Orange {
	public String toString() {
	return "im an orange";
	}
}
//제네릭 클래스
class Box<T> {
	private T obj;
	
	void setObj(T ap) {
		this.obj = ap;
	}
	T getObj(){
		return obj;
	}
}
public class Generices03 {
	public static void main(String[] args) {
//		Box abox = new Box();
//		abox.setObj(new Apple());
//		System.out.println(abox.getObj());
		
		Box<Apple> abox = new Box<Apple>();
		abox.setObj(new Apple());
		//abox.setObj(new Orange()); 안됨 
		
		Box<Orange> obox = new Box<Orange>();
		obox.setObj(new Orange());
		
		Orange orange = obox.getObj();
		System.out.println(orange);
		
		
		
	}
}


