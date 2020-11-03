package StringsConcept;

public class QualiTestQuestion {

	public static void main(String[] args) {
		
		String sentence="How have many subjects you have been passed";
		boolean checkword=sentence.contains("subjects");//true
		System.out.println(checkword);
		
		boolean checkword2=sentence.contains("hello");//false
		System.out.println(checkword2);
	}
}