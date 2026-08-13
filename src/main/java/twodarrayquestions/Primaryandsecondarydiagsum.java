package twodarrayquestions;

import java.util.Scanner;

public class Primaryandsecondarydiagsum {
	int i,j,sum=0;
	int a[][]=new int[3][3];
void set(Scanner sc) {
	
	
	System.out.println("enter the matrix elements ");
	for(i=0;i<3;i++) {
		for(j=0;j<3;j++) {
			a[i][j]=sc.nextInt();
		}
		
	} System.out.println("Matrix:");

    for (i = 0; i < 3; i++) {
        for (j = 0; j < 3; j++) {
            System.out.print(a[i][j] + "\t");
        }
        System.out.println();
    }
}
	void diagonal() {
		for( i = 0;i<3;i++) {
			sum=sum+a[i][i];
			sum=sum+a[i][2-i];
			

			
}
		sum=sum-a[1][1];
		System.out.println("sum of diagonals="+sum);
	}
	public static void main(String argas[]) {
		Scanner sc=new Scanner (System.in);
		Primaryandsecondarydiagsum ob=new Primaryandsecondarydiagsum();
		ob.set(sc);
		ob.diagonal();
		sc.close();
	}
	
}

