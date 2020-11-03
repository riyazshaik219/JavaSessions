import java.util.Scanner;

public class FibobaciinthSeries {
public static void main(String[] args) {
	
	int k=0,a=1,b=1;
	System.out.println("Enter any number:");
	int num= new Scanner(System.in).nextInt();
	System.out.print("1 1 ");
	
	
	while(k<=num) {
		k=a+b;
		System.out.print(k+" ");
		a=b;
		b=k;
		
	}
	
}
}
