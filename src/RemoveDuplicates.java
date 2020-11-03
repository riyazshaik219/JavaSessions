import java.util.HashSet;

public class RemoveDuplicates {
public static void main(String[] args) {
	//both sorted and un-sorted array same program
	int a[] = {1,2,2,3,4,4,5,5}; //sorted
	
	HashSet<Integer> hs = new HashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		hs.add(a[i]);
	}
	for(int num:hs) {
		System.out.print(num+" ");
	}
	
	
	
	
	

	
	
	}
	
	
}

