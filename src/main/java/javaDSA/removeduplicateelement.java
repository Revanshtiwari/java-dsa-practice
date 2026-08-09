package javaDSA;

public class removeduplicateelement {
   public static void main(String args[]) {
	   int a[]= {1,2,3,3,4,4,5};
	   int i,j;
	   for(i=0;i<a.length;i++) {
		   boolean duplicate=false;
		   for(j=i+1;j<a.length;j++) {
			   if(a[i]==a[j]) {
				   duplicate=true;
			   }
			   
			   
		   }
		   if(!duplicate) {
			   System.out.println(a[i]);
		   }
		  
	   }
	   
   }

}
