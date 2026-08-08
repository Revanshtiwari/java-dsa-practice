package javaDSA;

public class Bubblesort {

	public static void main(String[] args) {
		int i,j,temp;
		int a[]= {50,40,10,20,30};
		for(i=0;i<a.length;i++) {
			Boolean swapped=false;
			for(j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println("sorted array");
		for(Integer x:a) {
			System.out.println(x+" ");
		}
	}

}
