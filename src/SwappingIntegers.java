
public class SwappingIntegers {
public static void main(String[] args) {
	int x=5; //0101
	int y=10; //1010
	//1.using third or temporary variable swapping
//	int t;
//	t=x;
//	x=y;
//	y=t;
//	System.out.println(x);
//	System.out.println(y);
	
	//2.without using third variable :using + operator
//	x=x+y; //15
//	y=x-y; //5
//	x=x-y; //10
//	System.out.println(x);
//	System.out.println(y);
	
	//3.without using third variable:using * operator
//	x=x*y; //50
//	y=x/y; //5
//	x=x/y; //10
//	System.out.println(x);
//	System.out.println(y);
	//4.using XOR operator
	x=x^y; //15--->1111
	y=x^y; //10-->1010
	x=x^y; //5-->0101
	System.out.println(x);
	System.out.println(y);
	
}
}
