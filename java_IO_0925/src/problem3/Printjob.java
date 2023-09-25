package problem3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Printjob {

	private int colorType;
	private int paperSize;
	private int count;
	private int total;

	public int computPrintJobCost(String ct, String ps, String count) {
		if (ct.equals("Grayscale"))
			this.colorType = 5;
		else if(ct.equals("Color")) this.colorType = 15;
		
		if(ps.equals("A4")) this.paperSize = 40;
		else if(ps.equals("A5")) this.paperSize = 20;
		else if(ps.equals("Letter")) this.paperSize = 30;
		else if(ps.equals("Legal")) this.paperSize = 25;
		
		this.count = Integer.parseInt(count);
		
		total = (colorType + paperSize) * this.count;
		if (total % 10 == 5)total += 5;
		
		return total;
	}
	
	public static void main(String[] args) throws IOException {
		 BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	     String[] line = bf.readLine().split(" ");
	     String colorType = line[0];
	     String paperSize = line[1];
	     String count = line[2];
	     
	     Printjob printjob = new Printjob();
	     
	     System.out.println("Enter colortype papersize and count:" + colorType + " " + paperSize + " " + count);
	     System.out.println("Print job cost:" + printjob.computPrintJobCost(colorType, paperSize, count));
	}
	
}	

