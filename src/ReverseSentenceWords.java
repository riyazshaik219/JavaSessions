
public class ReverseSentenceWords {
public static void main(String[] args) {
	String s1 = "I Like  java";
	String result="";
	String[] s2=s1.split(" ");
	for(int i=s2.length-1; i>=0; i--) {
		result=result+s2[i]+" ";
	}
	System.out.println(result);
}
}
