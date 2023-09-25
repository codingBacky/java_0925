package problem3;
public class Minimums2 {
	   public static void main(String[] args) {
	      System.out.println(min4(4,5,3,2));
	   }
	   public static int min4(int num1,int num2,int num3,int num4) {
	      int min = 0;
	      int[] result = {num1,num2,num3,num4};
	      for(int i = 0; i < result.length; i++) {
	         for(int j = 1; j < result.length; j++) {
	            if(result[i] < result[j]) min = result[i];
	            else break;
	         }
	      }   
	      return min;
	   }
	}