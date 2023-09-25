package ex03;

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
class Box {
	private Object obj;
	
	void setObj(Object ap) {
		this.obj = ap;
	}
	Object getObj(){
		return obj;
	}
}
public class Generices2 {
	public static void main(String[] args) {
		Box abox = new Box();//사과
		Box obox = new Box();//오렌지
		abox.setObj(new Apple());
		obox.setObj(new Orange());
		
		Object o1= abox.getObj();
		Apple a1= (Apple)abox.getObj();
		System.out.println(o1);
		System.out.println(a1);
		
	}
}
