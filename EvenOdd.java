package Function;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		if(IsEven(num)) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		sc.close();
	}
    static boolean IsEven(int num1) {
    	return num1%2==0;
    }
}
