package leetcode;

public class Invertamatrix {

    public static void rotate(int a[][]) {

        int n = a.length;

        for (int i = 0; i < (n + 1) / 2; i++) {

            for (int j = 0; j < n / 2; j++) {

                // bottom left -> temp
                int temp = a[n - 1 - j][i];

                // bottom right -> bottom left
                a[n - 1 - j][i] = a[n - 1 - i][n - 1 - j];

                // top right -> bottom right
                a[n - 1 - i][n - 1 - j] = a[j][n - 1 - i];

                // top left -> top right
                a[j][n - 1 - i] = a[i][j];

                // temp -> top left
                a[i][j] = temp;
            }
        }
    }

    public static void main(String args[]) {

        int a[][] = {
            {5, 1, 9, 11},
            {2, 4, 8, 10},
            {13, 3, 6, 7},
            {15, 14, 12, 16}
        };

        rotate(a);

        // Print the rotated matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}