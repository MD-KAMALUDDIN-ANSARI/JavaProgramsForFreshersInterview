package Function;
import java.util.*;
public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks to know grade");
		int marks = sc.nextInt();
		Grade(marks);
		sc.close();

	}
	static void Grade(int mark) {
		if((mark>=91) && (mark<=100)) {
			System.out.println("Your grade is AA");
		}
		else if((mark>=81) && (mark<=90)) {
			System.out.println("Your grade is AB");
		}
		else if((mark>=71) && (mark<=80)) {
			System.out.println("Your grade is BB");
		}
		else if((mark>=61) && (mark<=70)) {
			System.out.println("Your grade is BC");
		}
		else if((mark>=51) && (mark<=60)) {
			System.out.println("Your grade is CD");
		}
		else if((mark>=41) && (mark<=50)) {
			System.out.println("Your grade is DD");
		}
		else {
			System.out.println("Oops you are fail!!");
		}
	}

}
