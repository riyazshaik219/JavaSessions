import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Given number is:");
	int no = new Scanner(System.in).nextInt();
	
	 //prime number will be divisible by 1 and itself.
	int temp=0;
	for(int i=2; i<=no-1; i++) {
		if(no%i==0) {
			temp=temp+1;
		}
	}
	if(temp==0) {
		System.out.println(no+"is prime no");
	}
	else
	{
		System.out.println("not prime no");
	}
}
}
