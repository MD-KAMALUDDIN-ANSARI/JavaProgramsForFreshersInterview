package Function;
import java.util.*;
public class SumOfFirstNnNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range upto where you want to find the sum");
		int num = sc.nextInt();
		Sum(num);
		sc.close();

	}
static void Sum(int n) {
	int sum =0;
	for(int i =1;i<n;i++) {
		sum+=i;
	}
	System.out.println("The sum of first "+n+" natural number is "+ sum);
}
}
