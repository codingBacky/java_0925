package ex02;

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
class AppleBox {
	private Apple ap;
	
	void setApple(Apple ap) {
		this.ap = ap;
	}
	Apple getApple(){
		return ap;
	}
}
class OrangeBox {
	private Orange og;
	
	void setOrange(Orange og) {
		this.og = og;
	}
	Orange getOrange(){
		return og;
	}
}
public class Generices1 {
	public static void main(String[] args) {
		AppleBox abox = new AppleBox();
		OrangeBox obox = new OrangeBox();
		
		abox.setApple(new Apple());//(인자값) => Apple이거나 Apple을 상속한 것만 넣어줄수 있다.
		obox.setOrange(new Orange());
		Apple a = abox.getApple(); //Apple이거나 Apple의 상위
		Orange o = obox.getOrange();
		System.out.println(a);
		System.out.println(o.toString());
	}
}
