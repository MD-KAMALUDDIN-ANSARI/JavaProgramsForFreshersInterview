package Function;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		
		System.out.println(IsPrime(num));
		sc.close();

	}
	static boolean IsPrime(int a) {
		if(a==1) {
			return true;
		}
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
}
