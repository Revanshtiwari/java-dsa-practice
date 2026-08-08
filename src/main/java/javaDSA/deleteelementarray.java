package javaDSA;

import java.util.Scanner;

//om sam saraswati swaha 
public class deleteelementarray {
public static void main(String []args) {
	int a[]= {10,20,30,40,50};
	int i,pos;
	Scanner sc=new Scanner(System.in);
	try {
		System.out.println("elements of array before deltion ");
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]+"");
		}
        System.out.println();
		System.out.println("enter the position where you want to delete the element ");
		pos=sc.nextInt();
		if(pos<0||pos>a.length) {
			System.out.println("invalid position");
		}
		for(i=pos-1;i<a.length-1;i++) {
			a[i]=a[i+1];
			
		}
		a[i]=0;
		System.out.println("array afyter deletion is ");
		for(i=0;i<a.length-1;i++) {
			System.out.println(a[i]+" ");
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
	
}
