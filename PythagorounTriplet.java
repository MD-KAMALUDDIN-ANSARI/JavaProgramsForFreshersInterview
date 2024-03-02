package Function;
import java.util.*;
public class PythagorounTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three sides ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();
		Pythogorean(x,y,z);

	}
static void Pythogorean(int x,int y,int z) {
	int a = x*x;
	int b = y*y;
	int c = z*z;
	if(a+b==c||a+c==b||b+c==a) {
		System.out.println("It is pythogorean triplet");
		
	}
	else {
		System.out.println("It is not pythogorean triplet");
	}
}
}
