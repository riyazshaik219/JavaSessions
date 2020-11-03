import java.util.HashSet;
import java.util.Set;

public class DuplicateString {
public static void main(String[] args) {
	String[] names = {"Java","Javascript","Ruby","C","Python","C","Java"};
	
	//2.using hashset : it stores unique values, set is interface and hashset is class
	//this hashset is implementing set interface
	//new HashSet<String>() is child-class object and store is parent interface reference variable
	HashSet<String> store = new HashSet<String>();
	for(String name : names) {
		if(store.add(name)==false) {
			System.out.println("duplicate element is:" +name);
		}
	}
	
}
}
