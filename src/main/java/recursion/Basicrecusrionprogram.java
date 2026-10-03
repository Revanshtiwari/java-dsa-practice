package recursion;

public class Basicrecusrionprogram {
    static void printdata(int n) {
    	if(n==0) {
    		return;
    	}else {
    		System.out.println("hello");
    		printdata(n-1);//tail recursion
    	}
    }
    public static void main(String args[]) {
    	int n=5;
    	printdata(n);
    }
}
