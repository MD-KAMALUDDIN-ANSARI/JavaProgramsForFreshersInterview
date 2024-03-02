package Function;
import java.util.*;
public class FirstNPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many prime number you want ");
		int num = sc.nextInt();
		int count=0;
		int num1=2,i;
		while(count<num) {
			for(i=2;i<num1;i++) {
				if(num1%i==0) {
					break;
				}
			}
			if(i==num1) {
				System.out.print(i+" ");
				count++;
			}
		num1++;
		}
		sc.close();

	}

}
