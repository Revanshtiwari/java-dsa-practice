package stack;

import java.util.Scanner;

public class Stackbasics {
private int top,i,maxsize,no;
private int stack[]=new int[5];
public Stackbasics() {
	top=-1;
	maxsize=stack.length;
}
void push(Scanner sc) {
	if(top==maxsize-1) {
		System.out.println("Stack is full cannot insert element ");
	return;
	}
	top++;
	System.out.println("enter the number to be add in stack ");
	no=sc.nextInt();
	System.out.println("number inserted="+no);
	
}
void pop() {
	if(top==-1) {
		System.out.println("Stack is empty");
	return;
	}
	no=stack[top];
	System.out.println("number deleted ="+no);
	
}
void peek() {
	if(top==-1) {
		System.out.println("Stack is empty no peek found ");
		return;
	}
	System.out.println(stack[top]);
}
void traverse() {
	if(top==-1) {
		System.out.println("Stack is empty cannot traverse ");
		for(i=top;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}
}
public static void main(String args[]) {
	int ch;
	Scanner sc=new Scanner(System.in);
	Stackbasics ob=new Stackbasics();
	do {
		System.out.println("press 1 to push record in stack");
        System.out.println("press 2 to delete element from stack ");
        System.out.println("press 3 to show the peek element ");
        System.out.println("press 4 to transverse the stack");
        System.out.println("press 5 to exit ");
     ch=sc.nextInt();
     switch(ch){
    	 case 1->ob.push(sc);
    	 case 2->ob.pop();
    	 case 3->ob.peek();
    	 case 4->ob.traverse();
    	 case 5->System.out.println("exit");
    	 default->System.out.println("invalid choices"); 
    	 
     }
	
	}
	while(ch!=5);
	
}
}
