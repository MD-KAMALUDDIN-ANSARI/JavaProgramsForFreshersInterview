package Function;
import java.util.*;
public class CircumferenceAndAreaofCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle ");
		float r = sc.nextFloat();
		AreaAndCircumference(r);
		sc.close();

	}
	static void AreaAndCircumference(float a) {
		System.out.println("Area of circle is "+String.format("%.2f",(3.14*a*a)));
		System.out.println("Cicrcumference of the circle is "+ String.format("%.2f",(2*3.14*a)));
	}

}
