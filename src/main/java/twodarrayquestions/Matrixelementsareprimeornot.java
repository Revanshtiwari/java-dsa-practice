package twodarrayquestions;

public class Matrixelementsareprimeornot {
	

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int i,j,k;
		System.out.println("matrix elements are");
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				System.out.print(a[i][j]+" ");
			}
		}
		for(i=0;i<=2;i++) {
			for(j=0;j<=2;j++) {
				for(k=2;k<=a[i][j];k++) {
					if(a[i][j]%k==0) {
						break;
					}
				}
				if(k==a[i][j]) {
					System.out.println(a[i][j]+" ");
				}
			}
		}
		
	}

}
