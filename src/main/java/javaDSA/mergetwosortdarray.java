package javaDSA;

public class mergetwosortdarray {
      public static void main(String args[]) {
    	  int a[]= {1,2,3};
    	  int b[]= {2,6,7};
    	  int result[]=new int[a.length+b.length];
    	  int i,j,k=0;
    	  for(i=0;i<a.length;i++) {
    		  result[k]=a[i];
    		  k++;
    	  }for(i=0;i<a.length;i++) {
    		  result[k]=b[i];
    		  k++;
    	  }System.out.println("merged arrasy is ");
    	  for(Integer x: result) {
    		  System.out.print(x+"");
    	  }
      }
}
