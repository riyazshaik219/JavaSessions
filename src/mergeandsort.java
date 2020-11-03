import java.util.Arrays;

public class mergeandsort {
	public static int[] mergeArray(int[] arrayA, int[] arrayB) {
		
		int[] mergedArray = new int[arrayA.length+arrayB.length];
		int i=0, j=0, k=0;
		
		while(i<arrayA.length) {
			mergedArray[k] = arrayA[i];
			i++;
			k++;
		}
		
		while(j<arrayB.length) {
			mergedArray[k] = arrayB[j];
			j++;
			k++;
		}
		
		Arrays.sort(mergedArray);
		
		return mergedArray;
		
	
	}
public static void main(String[] args) {
	
	int[] arrayA = new int[] {1,3,5,-9,-1};
	int[] arrayB = new int[] {2,4,6,6};
	int[] mergedArray = mergeArray(arrayA,arrayB);
	System.out.println("mergedArray : "+Arrays.toString(mergedArray));
	}
}

