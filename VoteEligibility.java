package Function;
import java.util.*;
public class VoteEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age = sc.nextInt();
		if(IsEligible(age)) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not eligible to vote ");
		}
		
		sc.close();
	}
	static boolean IsEligible(int num) {
		return (num>=18);
	}

}
