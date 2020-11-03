
public class ReturnsFirstHalfString {
public static void main(String[] args) {
	System.out.println(FirstHalf("shaik riyaz"));
}
	
	public static String FirstHalf(String myString) {
		int  FirstHalfEnd = myString.length()/2;
		String FinalResult = myString.substring(0,FirstHalfEnd);
		return FinalResult;
		
	}
}

