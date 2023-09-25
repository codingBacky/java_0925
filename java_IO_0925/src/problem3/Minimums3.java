package problem3;

public class Minimums3 {
    public static void main(String[] args) {
        System.out.println(min4(4,5,3,2));
    }
    
    public static int min4(int num1, int num2, int num3, int num4) {
        int min = num1;
        
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        if (min > num4) {
            min = num4;
        }
        
        return min;
    }
}