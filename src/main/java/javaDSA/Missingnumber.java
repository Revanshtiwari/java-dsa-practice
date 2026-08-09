package javaDSA;

public class Missingnumber {
public static void main(String args[]) {
    int a[]= {1,2,4,5,6};
    int totalsum=0,arraysum=0,n,missingno;
    
    n=a[a.length-1];
	totalsum=n*(n+1)/2;
	for(int i=0;i<a.length;i++) {
		arraysum=arraysum+a[i];
	}
	missingno=totalsum-arraysum;
    System.out.println(missingno);
	

	
}
}
