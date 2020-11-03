public class Rhombus
{
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) //1st for loop for columns
		{
			for(int k=0; k<=10-i; k++) //3rd for loop for space
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) //for loop for rows
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=9; i>=0; i--) //1st for loop for columns
		{
			for(int k=0; k<=10-i; k++) //3rd for loop for space
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) //for loop for rows
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
