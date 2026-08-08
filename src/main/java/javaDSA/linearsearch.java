package javaDSA;

import java.util.Scanner;

public class linearsearch {
public static void main(String args[]) {
	int a[]= {1,2,3,4,5,6,7};
	int i=0,target;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the target ehich you wanna search ");
	target=sc.nextInt();
	for(i=0;i<a.length;i++) {
		if(a[i]==target) {
			System.out.println("number fount at index="+i);
			break;
		}if(i==a.length) {
			System.out.println("number not found");
		}
	}
}
}
