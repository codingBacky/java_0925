package ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream outputStream = new FileOutputStream("c:/data/test1.db");
			byte a =10;//1byte씩 출력
			byte b =20;
			byte c =30;
		
			outputStream.write(a);
			outputStream.write(b);
			outputStream.write(c);
			
			outputStream.flush();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
