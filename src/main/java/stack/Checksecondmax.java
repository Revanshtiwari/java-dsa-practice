package stack;

import java.util.Scanner;

import java.util.Scanner;

public class Checksecondmax {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int s[] = new int[5];
        int top = -1;

        top++;
        System.out.println("Enter the element to be added in stac k");
        s[top] = sc.nextInt();

        top++;
        s[top] = sc.nextInt();

        top++;
        s[top] = sc.nextInt();

        top++;
        s[top] = sc.nextInt();

        top++;
        s[top] = sc.nextInt();
        System.out.println("all elements of stack are");
        for (int i = 0; i < s.length; i++) {
            System.out.println(  s[i]);
        }
        if(top==-1) {
        	System.out.println("stack is empty cant able to find max elements");
        }
        if(top<1) {
        	System.out.println("atlease two elements are needed to find the second max elements ");
        }
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int i=0;i<=top;i++) {
        	if(s[i]>max) {
        		secondmax=max;
        		max=s[i];
        	}
        	else if(s[i]>secondmax && s[i]!=max) {
        		secondmax=s[i];
        	}
        }
        if(secondmax==Integer.MIN_VALUE) {
        	System.out.println("no second value found");
        }
        else {
        	System.out.println("max value = "+max);
        	System.out.println("secondmax value = "+secondmax);
        	
        }
        
        
        
        
        sc.close();
    }
}