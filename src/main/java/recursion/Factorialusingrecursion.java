package recursion;

import java.util.Scanner;

public class Factorialusingrecursion {
     static int fact(int n) {
    	  if(n==0 || n==1) {
		  return 1;
    	  }
    	  else {
    		  return n*fact(n-1);
    	  }
      }
      public static void main(String args[]) {
    	  Scanner sc = new Scanner (System.in);
    	  System.out.println("enter the value of n");
    	  int n=sc.nextInt();
    	  int f=fact(n);
    	  System.out.println("factorial = "+f);
      }
}
