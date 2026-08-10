package twodarrayquestions;

import java.util.Scanner;

import java.util.Scanner;

public class Transposeofmatrix {

    int a[][] = new int[3][3];
    int i, j;
    int transpose[][] = new int[3][3];

    void set(Scanner sc) {
        System.out.println("Enter the matrix elements");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Normal matrix:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    void transpose() {

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                transpose[i][j] = a[j][i];
            }
        }

        System.out.println("Transposed array:");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Transposeofmatrix ob = new Transposeofmatrix();

        ob.set(sc);
        ob.transpose();
    }
}