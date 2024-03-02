package Function;
import java.util.*;
public class MaxnMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first threee number ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int max = MAX(num1,num2,num3);
		int min = MIN(num1,num2,num3);
		System.out.println("The greatest number is "+max);
		System.out.println("The smallest number is "+min);

	}
	static int MAX(int a,int b,int c) {
		int max =Math.max(c,Math.max(a, b));
		return max;
		
	}
	static int MIN(int a,int b,int c) {
		int min =Math.min(c,Math.min(a, b));
		return min;
		
	}

}
