package Function;
import java.util.*;
public class PrimeNumBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting range ");
		int num1 =sc.nextInt();
		System.out.println("Enter the ending range ");
		int num2 = sc.nextInt();
		int i,j;
		for(j=num1;j<num2;j++) {
			for(i=2;i<=j;i++) {
				if(j%i==0) {
					break;
				}
			}
			if(i==j) {
				System.out.print(j+" ");
			
			}
			
		}
		sc.close();

	}

}
