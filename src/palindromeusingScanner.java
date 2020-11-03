import java.util.Scanner;

public class palindromeusingScanner {
public static void main(String[] args) {
	System.out.print("Enter a number :" );
	int num = new Scanner(System.in).nextInt();
	int rev=0, sum=0;
	int t;
	t=num;
	
	while(num!=0) {
		rev = num%10;
		sum = sum*10+rev;
		num = num/10;
		
		
	}
	
	if(t==sum) {
		System.out.println("palindrome number");
	}
	else
	{
		System.out.println("not palindrome number");
	}

}
}
