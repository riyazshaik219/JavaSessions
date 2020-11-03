import java.util.*;
public class swapping {
	public static void main(String[] args) {
		String x = "pankaj";
		String y = "sir";
		System.out.println("Before Swapping");
		System.out.println("The value of x is:" +x);
		System.out.println("The value of y is:" +y);
		
		//append x and y
		x=x+y;
		//System.out.println(x); //it will become pankajsir
		//store initial string x in string y
		y=x.substring(0, x.length()-y.length());
		//System.out.println(y); //so it will print pankaj in this step
		//store string y in string x
		x=x.substring(y.length());
		//System.out.println(x); // here it will print sir
		System.out.println("After swapping");
		System.out.println(x);
		System.out.println(y);
		
		
		
		
		
	}

}
