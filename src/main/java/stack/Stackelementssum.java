package stack;

import java.util.Scanner;

public class Stackelementssum {
	int stack[]=new int[5];
    
    int top=-1;
	void push(Scanner sc) {
		
		int sum=0;
		int maxsize=stack.length;
		if(top==maxsize-1) {
			System.out.println("stack is full cant insert element");
			return;
		}
		top++;
		System.out.println("enter the element to be add in a stack");
		stack[top]=sc.nextInt();
		System.out.println("no inserted="+stack[top]);
		for(int i=0;i<=top;i++) {
			sum=stack[i]+sum;
			
		}
		System.out.println("sum of elements are "+sum);
	}
	void checkmaxmin() {
		if(top==-1) {
			System.out.println("stack is empty");
			return;
			
		}
		int min=stack[0];
		int max=stack[0];
		for(int i=1;i<=top;i++) {
			if(stack[i]>max) {
				max=stack[i];
			}
			if(stack[i]<min) {
				min=stack[i];
			}
		}
		System.out.println("max element ="+max);
		System.out.println("min element ="+min);
		
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner (System.in);
		Stackelementssum ob=new Stackelementssum();
		ob.push(sc);
		ob.push(sc);
	    ob.push(sc);
	    ob.push(sc);
	    ob.push(sc);
		ob.checkmaxmin();
		sc.close();
		
	}
	
}














