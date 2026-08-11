package twodarrayquestions;

import java.util.Scanner;

public class Sparsematrix {
int a[][]=new int [3][3];
int count=0;
int i,j;
void set(Scanner sc) {
	System.out.println("enter the matrix elements");
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			a[i][j]=sc.nextInt();
		}
	}
}
void sparse() {
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			if(a[i][j]==0) {
				count++;
			}
		}
	}
		if(count >(i*j)/2){
			System.out.println("Sparse matrix");
		}
		else {
			System.out.println("not a sparse matrix");
		
	}
}
public static void main(String args[]) {
	Scanner sc =new Scanner (System.in);
	Sparsematrix ob=new Sparsematrix();
	ob.set(sc);
	ob.sparse();
	sc.close();
}

}
