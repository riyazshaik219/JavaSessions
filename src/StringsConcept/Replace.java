package StringsConcept;

public class Replace {
public static void main(String[] args) {
	
	String str = "This is demo";
	System.out.println(str.replace("is", "was"));
	
	System.out.println(str.replaceFirst("is", "was"));
	
	System.out.println(str.replaceAll("is(.*)", "was"));
}
}
