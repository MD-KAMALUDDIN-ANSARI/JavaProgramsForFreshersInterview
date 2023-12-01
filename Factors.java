package Function;
import java.util.*;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int num = sc.nextInt();
		Factorial(num);
		sc.close();

	}
	static void Factorial(int a) {
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact*=i;
			
		}
		System.out.println("The facorial of "+a+" is "+ fact);
	}

}
