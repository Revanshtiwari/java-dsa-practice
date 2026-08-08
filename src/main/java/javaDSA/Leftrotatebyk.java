package javaDSA;

import java.util.Scanner;

public class Leftrotatebyk {
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
		int first=a[0];
		for(i=0;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		a[a.length-1]=first;
	}
	System.out.println("array after moving k to left");
	for(i=0;i<a.length;i++) {
		System.out.print(a[i]+"");
	}
	
}
}
