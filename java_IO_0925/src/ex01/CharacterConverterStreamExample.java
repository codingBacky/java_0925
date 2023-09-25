package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConverterStreamExample {
	public static void main(String[] args) throws IOException {
		String str = "상위 클래스가 가지고 있는 멤버변수가 하위 클래스로 상속되는 것처럼 상위 클래스가 가지고 있는 메서드도 하위 클래스로 상속되어 하위 클래스에 사용할 수 있습니다.";
		write(str);
		String data = read();
		System.out.println(data);
	}
	static void write(String str) throws IOException {
		OutputStream outputStream = new FileOutputStream("c:/data/test2.txt");//문자열 바이트로만 작성할 수 있음
		Writer writer = new OutputStreamWriter(outputStream, "utf-8");//바이트 단위를 문자열로
		writer.write(str);
		writer.flush();
		writer.close();
	}
	static String read() throws IOException {
		FileInputStream inputStream = new FileInputStream("c:/data/test2.txt");
		Reader reader = new InputStreamReader(inputStream, "utf-8");
		char[] data = new char[100];
		int num = reader.read(data);
		reader.close();
		String str = new String(data, 0, num);
		return str;
	}
		
}
