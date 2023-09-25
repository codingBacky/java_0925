package ex01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample02 {
	public static void main(String[] args) throws IOException {
		
		OutputStream outputStream = new FileOutputStream("c:/data/test2.db");
		byte[] array = {10,20,30,40,50,60,70};
		
		outputStream.write(array);
		outputStream.flush();//버퍼 클리어
		outputStream.close();
		
	}
}
