package twodarrayquestions;

public class Diagonalelementsofarray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int i,j;
		int n=a.length;
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
		{
				if (i == j || j == n - 1 - i){
					System.out.println(a[i][j]);
				
			}
		}
		}
	}

}
