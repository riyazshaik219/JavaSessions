
public class merge {
public static void main(String[] args) {
	int a[] = {10,50,30};
	int b[] = {40,30,60,70};
	
	
	int a_length=a.length;
	int b_length=b.length;
	int c_length=a_length+b_length;
	
	int c[]= new int[c_length];
	
	for(int i=0;i<a_length;i++) {
      c[i] = a[i];
}
	for(int i=0;i<b_length;i++) {
		c[a_length+i] = b[i];
		}
	for(int i=0;i<c.length;i++) {
		System.out.print(c[i]+" ");
		}
	
}
}
