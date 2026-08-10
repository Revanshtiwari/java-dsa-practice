package leetcode;

public class Intersectionoftwoelements {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {3,4,5,6,7};
		int i,j;
		System.out.println("intersection of both arrays are");
		for(i=0;i<a.length;i++) {
			for(j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]+" ");
				}
			}
			
		}
		

	}

}
