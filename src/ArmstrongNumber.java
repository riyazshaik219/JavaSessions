import java.util.Scanner;

public class ArmstrongNumber {
public static void main(String[] args) {
		System.out.print("Given number is:");
		int num = new Scanner(System.in).nextInt();
		int cube=0;
		int r=0;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
		}
		if(t==cube) {
			System.out.println("this is an armstrong number");
		}
		else
		{
			System.out.println("this is not an armstrong number");
		}
}
}

