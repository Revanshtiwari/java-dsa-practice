package javaDSA;

import java.util.Scanner;

public class insertelementinarray {
	public static void main(String []args) {
		int a[]= {10,20,30,40,50};
		int i,pos,item;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("elements of array before insertion ");
			for(i=0;i<a.length;i++) {
				System.out.print(a[i]+"",);
			}
	        System.out.println();
			System.out.println("enter the position where you want to insert the element ");
			pos=sc.nextInt();
			System.out.println("entere the element which you nwanna insert ");
			item=sc.nextInt();
			if(pos<0||pos>a.length) {
				System.out.println("invalid position");
			}
			for(i=a.length-1;i<a.length-1;i--) {
				a[i]=a[i-1];
				
			}
			a[pos-1]=item;
			System.out.println("array afyter insertion is ");
			for(i=0;i<a.length-1;i++) {
				System.out.println(a[i]+" ");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			sc.close();
		}
	}
		
}
