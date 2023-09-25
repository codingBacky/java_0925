package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minimums {
	public static int min4(int num1, int num2, int num3, int num4) {
		int min = 100000000;
		
		
		if(num1 < min) min = num1;
		else if(num2 < min) min = num2;
		else if(num3 < min) min = num3;
		else if(num2 < min) min = num4;
		
		return min;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("정수를 입력하세요");
		String[] line = bf.readLine().split(" ");
		int num1 = Integer.parseInt(line[0]);
		int num2 = Integer.parseInt(line[1]);
		int num3 = Integer.parseInt(line[2]);
		int num4 = Integer.parseInt(line[3]);
		System.out.println(min4(num1, num2, num3, num4));
	}
}