package javaDSA;

public class Mergetwosorted {

	public static void main(String[] args) {
	int a[]= {2,5,8};
	int b[]= {1,3,6};
	int result[]=new int [a.length+b.length];
	int i=0,j=0,k=0;
	 while(i<a.length && j<b.length) {
		 if(a[i]<=b[j]) {
			 result[k]=a[i];
			 k++;
			 i++;
			 
		 }else {
			 result[k]=b[j];
			 k++;
			 j++;
			 
		 }
	 }while(i<a.length) {
		 result[k]=a[i];\	 i++;
		 k++;
	 }while(j<b.length) {
		 result[k]=b[j];
		 j++;
		 k++;
	 }
	System.out.println("mergede sorted array ");
	for(Integer x:result) {
		System.out.println(x+"");
		
	}
	
	}

}
