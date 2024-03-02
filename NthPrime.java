package Function;
import java.util.*;
public class NthPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many prime number you want");
		int num = sc.nextInt();
		Prime(num);
		sc.close();

	}
static void Prime(int n) {
	int count = 0,i,n1=2;
	while(count<n) {
		for(i=2;i<n1;i++) {
			if(n1%i==0) {
				break;
			}
		}
		if(i==n1) {
			System.out.print(n1+" ");
			count ++;
		}
		n1++;
	}
}
}
