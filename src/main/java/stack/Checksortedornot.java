package stack;

import java.util.Scanner;

public class Checksortedornot {

    static int stack[] = new int[5];
    static int top = -1;

    static void push(int value) {

        if (top == stack.length - 1) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        stack[top] = value;
    }
    static void checksort() {
    	if(top==-1) {
    		System.out.println("stack is empty");
    		return;
    	}
    	boolean sorted=true;
    	for(int i=0;i<top;i++) {
    		if(stack[i]>stack[i+1]) {
    		sorted=false;
    		break;
    		}
    	}
    	if(sorted) {
    		System.out.println("stack is sorted ");
    		
    	}
    	else {
    		System.out.println("stack is not sorted ");
    	}
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values to be added in stack");

        for (int i = 0; i < 5; i++) {

            int value = sc.nextInt();

            push(value);
        }

        System.out.println("Stack elements are:");

        for (int i = 0; i <= top; i++) {

            System.out.println(stack[i]);
        }
        checksort();

        sc.close();
    }
}