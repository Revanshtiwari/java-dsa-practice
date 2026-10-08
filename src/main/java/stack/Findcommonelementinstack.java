package stack;

public class Findcommonelementinstack {
	 int stack[] = new int[5];
    int top = -1;
    int stack2[] = new int[5];
    int top2 = -1;
    int maxsize=5;

     void push(int value) {

        if (top == maxsize-1) {
            System.out.println("Stack is full");
            return;
        }

        top++;
        stack[top] = value;
    }
   void push2(int value) {

        if (top2 == maxsize-1) {
            System.out.println("Stack is full");
            return;
        }

        top2++;
        stack2[top2] = value;
    }
    void common() {
    	System.out.println("common elements are ");
    	for(int i=0;i<=top;i++) {
    		boolean found=false;
    		for(int j=0;j<=top2;j++) {
    			if(stack[i]==stack2[j]) {
    				found =true;
    				break;
    			}
    		}if(found) {
    			System.out.println(stack[i]);
    		}
    		
    	}
    	
    }
    public static void main(String args[]) {
    	Findcommonelementinstack ob= new Findcommonelementinstack();
    	ob.push(10);
    	ob.push(14);
    	ob.push(13);
    	ob.push(12);
    	ob.push(1);
    	ob.push2(10);
    	ob.push2(14);
    	ob.push2(5);
    	ob.push2(4);
    	ob.push2(3);
    	ob.common();
    	
    }
}
