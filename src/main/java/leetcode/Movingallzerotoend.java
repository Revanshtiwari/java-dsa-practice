package leetcode;

public class Movingallzerotoend {
    public static void main(String args[]) {

        int i, insertposition = 0;
        int a[] = {1, 0, 2, 0, 3, 4, 5};

       
        for (i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                a[insertposition] = a[i];
                insertposition++;
            }
        }
        while (insertposition < a.length) {
            a[insertposition] = 0;
            insertposition++;
        }

        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}