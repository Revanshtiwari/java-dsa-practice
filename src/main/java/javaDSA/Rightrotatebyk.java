package javaDSA;

import java.util.Scanner;

public class Rightrotatebyk {
public static void main(String args[]) {
	int a[]= {1,2,3,4,5};
	int i,j,k;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of k");
	k=sc.nextInt();
	if(k<0 || k>a.length) {
		System.out.println("invalid position");
	return;
	}for(j=0;j<k;j++) {
		int last=a[a.length-1];
		for(i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[i]=last;
	}
	System.out.println("array after moving k to right");
	for(i=0;i<a.length;i++) {
		System.out.print(a[i]+"");
	}
	
}
}
