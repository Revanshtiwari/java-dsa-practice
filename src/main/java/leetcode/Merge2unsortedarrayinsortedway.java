package leetcode;

import java.util.Arrays;

public class Merge2unsortedarrayinsortedway {
	public static void main(String[] args) {
		int a[]= {5,2,7};
        int b[]= {6,1,3};
        int result[]=new int[a.length+b.length];
        int i,j,k=0;
        for(i=0;i<a.length;i++) {
        	result[k]=a[i];
            k++;	
        }       for(j=0;j<a.length;j++) {
        	result[k]=b[j];
        	k++;
        }
        Arrays.sort(result);
        
        System.out.println("merge sorted array is ");
        for(Integer x:result) {
        	System.out.println(x+"");
        	
        }
     }
}
