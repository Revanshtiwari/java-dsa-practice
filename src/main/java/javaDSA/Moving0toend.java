package javaDSA;

public class Moving0toend {
   public static void main(String args[]) {
	   int a[]= {1,0,2,0,3,0,4};
	   int i,insertposition = 0;
	   for(i=0;i<a.length;i++) {
		   if(a[i]!=0) {
			   a[insertposition]=a[i];
			   insertposition++;
		   }
		   }while(insertposition<a.length) {
			   a[insertposition]=0;
			   insertposition++;

		   }
		   for(i=0;i<a.length;i++) {
			   System.out.println(a[i]+"");
		   }
	   
   }
}
