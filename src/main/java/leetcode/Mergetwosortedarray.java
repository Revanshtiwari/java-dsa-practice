package leetcode;

public class Mergetwosortedarray {
public static void main(String args[]) {
	int a[]= {1,2,3};
	int b[] ={6,7,8};
	int result[]=new int[a.length+b.length];
	int i,j,k=0;
	for(i=0;i<a.length;i++) {
		result [k]=a[i];
		k++;
	}for(j=0;j<a.length;j++) {
		result [k]=b[j];
		k++;
	}System.out.println("merged array=");
	for(Integer x: result) {
		System.out.print(x+" ");
	}
}
}
