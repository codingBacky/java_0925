package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) {
		try {
			InputStream inputStream = new FileInputStream("c:/data/test1.db");
			while(true) {
				int data = inputStream.read();//1byte씩 읽기
				
				if(data == -1) break;//더이상 읽어올 data가 없으면 -1을 반환한다.-1일 때 while 종료
				
				System.out.println(data);
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
