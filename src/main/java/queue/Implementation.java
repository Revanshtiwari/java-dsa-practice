package queue;

import java.util.Scanner;

public class Implementation {

	int a[];
	int f,r,size;
	int data;
	Implementation(int size){
		a=new int [size];
		this.size=size;
		f=-1;
		r=-1;
	}
	void enqueue(Scanner sc) {
		if(r==size-1) {
			System.out.println("queue is full");
		
		return;}
	System.out.println("enter the data");
	 data=sc.nextInt();
	if(f==-1) {
		f=0;
	}
	r++;
	a[r]=data;
	System.out.println("element inserted "+ data);
	}
	void dequeue() {
		if(f==-1 || f>r) {
			System.out.println("queue is empty");
			return;
		}
		data=a[f];
		System.out.println("element deleted ="+data);
		f++;
		if(f>r) {
			r=-1;
			f=-1;
		}
	}
	void display() {
		if(f==-1) {
			System.out.println("queue is empty");
			return;
		}
		for(int i=f;i<=r;i++) {
			System.out.print(a[i]+"");
		}
		System.out.println();
	}
	public static void main(String args[]) {
		Implementation ob=new Implementation(5);
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true) {
			System.out.println("press 1 to insert");
			System.out.println("press 2 to delete");
			System.out.println("press 3 to dislpay");
			System.out.println("press 4 to exit");
			ch=sc.nextInt();
			switch(ch) {
			case 1->ob.enqueue(sc);
			case 2->ob.dequeue();
			case 3->ob.display();
			case 4->ob.display();
			default->System.out.println("invalid choice");
			
			}
		}
	}
	
}
