package stack;

import java.util.Scanner;

public class Countelementofstack {
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
	        int count=0;
	        for(int i=0;i<=top;i++) {
	        	count ++;
	        		        }
	        System.out.println("count= "+count);

}
}
