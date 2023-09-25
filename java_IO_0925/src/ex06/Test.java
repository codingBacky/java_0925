package ex06;


//가변길이로 매개변수 받기
public class Test {
	static int eng = 10;
	static int kor = 100;
	static int sum = eng+kor;
	static{
		kor = 10;
		eng = 10;
		sum = eng+kor;
	}
	public static void main(String[] args) {
		//Test test = new Test();
//		System.out.println("sum(1,2,3,4,5) : " + sum(1,2,3,4,5));
//		System.out.println("sum(1,3,5,7,9) : " + sum(1,3,5,7,9));
//		System.out.println("sum(1,2,3,4,5,6,7,8,9,10) : " + sum(1,2,3,4,5,6,7,8,9,10));
		
//		System.out.println(age);
//		System.out.println(name);
//		System.out.println(address);
		
		eng = 1000;
		System.out.println(eng);
		System.out.println(sum);
	}
	static int sum(int ...values) {
		int sum = 0;
		for(int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}

class A{
	void func() {
		Test.sum(1,2,3,4);
	}
}