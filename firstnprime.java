package Function;
import java.util.*;
public class firstnprime
{
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter the Starting point and end point");
		int num2 = sc.nextInt();
		int j,count=0,num1=2;
		while(count<num2){
			for(j=2;j<num1;j++){
				if(num1%j==0){
					break;
				}				
			}
			if(num1==j){
				System.out.print(j+" ");
				count++;
			}
			num1++;
		}
		sc.close();
	}
}

