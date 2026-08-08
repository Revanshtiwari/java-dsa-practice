package javaDSA;

public class Arrayintersection {
       public static void main(String args[]) {
    	   int a[]= {1,2,3,4,5};
    	   int b[]= {2,3,7,5,3,8,9};
    	   int i,j;
    	   System.out.println("intetrsection is ");
    	   for(i=0;i<a.length;i++) {
    		   for(j=0;j<b.length;j++) {
    			   if(a[i]==b[j]) {
    				   System.out.println(a[i]+"");
    			   }
    		   }
    	   }
    	  
       }
}
