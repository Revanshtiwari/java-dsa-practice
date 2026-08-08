package javaDSA;

public class Missingno {
	public static void main(String args[]) {
		int a[]= {1,2,3,5,6};
		int n,totalsum=0,arraysum=0,missingno;
		n=a[a.length-1];
		totalsum=n*(n+1)/2;
		for(int i=0;i<a.length;i++) {
			arraysum=arraysum+a[i];
		}
		missingno=totalsum-arraysum;
		System.out.println("missing no="+missingno);
	}
	
}

