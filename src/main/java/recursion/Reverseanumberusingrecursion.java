package recursion;

public class Reverseanumberusingrecursion {
    static int sum=0;
    public static int reverse(int n,int rev) {
    	if(n==0) {
    		return rev;
    	}
    	return reverse(n / 10, rev * 10 + n % 10);
    }
    public static void main(String args[]) {
    	int n=256;
    	int result=reverse(n,0);
    	  System.out.println("Reverse = " + result);
    }
}
