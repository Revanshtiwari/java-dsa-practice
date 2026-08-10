package twodarrayquestions;

import java.util.Scanner;

public class Add2matrix {
	int a[][]=new int[2][3];
	int i,j;
	void set(Scanner sc) {
		System.out.println("enter thre matrix elements");
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				a[i][j]=sc.nextInt();
			}
		}
	}
	void max() {
		int max=a[0][0];
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
			if(a[i][j]>max) {
				max=a[i][j];
			}
			}
		}
		System.out.println("max ="+ max);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Add2matrix ob=new Add2matrix();
		ob.set(sc);
		ob.max();

	}

}
