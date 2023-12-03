package Function;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();
		Palindrome(num);
		sc.close();

	}
static void Palindrome(int num1) {
	int rem =0,rev=0;
	int original =num1;
	while(num1>0) {
		rem=num1%10;
		rev = (rev*10)+rem;
		num1=num1/10;
		
	}
	if(original==rev) {
		System.out.println("It is palindrome");
	}
	else {
		System.out.println("It is not palindrome");
	}
}
}
