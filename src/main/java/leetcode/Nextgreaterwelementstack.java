package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class Nextgreaterwelementstack {
   public static int []NGE (int arr[]){
	   int n=arr.length;
	   int[] result=new int [n];
	   Arrays.fill(result, -1);
	   Stack<Integer> s = new Stack<>();
	   for(int i=n-1;i>=0;i--) {
		   while(! s.isEmpty() && s.peek()<=arr[i]) {
			   s.pop();
		   }
		   if(!s.isEmpty()) {
			   result[i]=s.peek();
		   }
		   s.push(arr[i]);
	   }
	   return result;
	   
   }
   public static void main(String args[]) {
	   int arr[]= {4,5,2,10,8};
	   int[] result=NGE(arr);
	   System.out.print(Arrays.toString(result));
	   
   }
}
