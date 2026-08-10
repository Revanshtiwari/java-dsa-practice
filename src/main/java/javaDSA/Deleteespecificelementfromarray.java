package javaDSA;

import java.util.Scanner;

public class Deleteespecificelementfromarray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int i,j,position;
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("elements of array before deletion");
			for(i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
				
			}
			System.out.println();
			System.out.println("enter the position from where you wanna delete the element ");
			position=sc.nextInt();
			if(position<=0 || position >a.length) {
				System.out.println("invalid position");
				return;
			}
			for(i=position-1;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
			a[i]=0;
			System.out.println("array after deletion");
			for(i=0;i<a.length-1;i++) {
				System.out.println(a[i]+" ");
				
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
