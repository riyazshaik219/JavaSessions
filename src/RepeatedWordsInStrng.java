import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RepeatedWordsInStrng {
public static void main(String[] args) {
	
	FindDuplicateWords("Hey java is  java best language is java");

	
}
public static void FindDuplicateWords(String inputstring) {
	//split
	 String[] words = inputstring.split(" ");
	 
	 //create one hashmap
	 Map<String,Integer> wordcount = new HashMap<String,Integer>();
	 
	 //to check each word in given array
	 for(String word : words) {
		 //if word is present
		 if(wordcount.containsKey(word)) {
			 wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
		 }
		 else
		 {
			 wordcount.put(word, 1);
		 }
}
	 //extracting all the keys of map- wordcount
	 Set<String> wordsInString = wordcount.keySet();
	 
	 //loop through all the words in wordcount
	 for(String word : wordsInString) {
		 if(wordcount.get(word)>1) {
			 System.out.println(word+": "+wordcount.get(word));
		 }
	 }
}
}