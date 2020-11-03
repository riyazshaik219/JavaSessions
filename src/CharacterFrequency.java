
public class CharacterFrequency {
public static void main(String[] args) {
	
	String s="madam";
	char[] ch = s.toCharArray();
	int sz= ch.length;
	int counter=0;
	
	for(int i=0; i<sz; ++i) {
		counter=0;
		for(int j=0;j<sz;++j) {
			
			if(j<i && ch[i]==ch[j]) {
				break;
			}
			if(ch[j]==ch[i]) {
				counter++;
			}
			if(j==sz-1) {
				System.out.println("the character "+ ch[i]+ " is present "+counter+" times") ;
				
			}
		}
		
	}
}
}
