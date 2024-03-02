package Function;
import java.util.*;
public class PrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting of the range");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		Prime(num1,num2);
		sc.close();

	}
	static void Prime(int n1,int n2) {
		int i,j;
		for(i=n1;i<=n2;i++) {
			for(j=2;j<=i;j++) {
				if(i%j==0) {
					break;
				}					
			}
			if(i==j) {
				System.out.print(j+" ");
			}
		}
	}

}
