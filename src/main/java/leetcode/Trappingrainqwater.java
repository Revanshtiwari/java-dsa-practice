package leetcode;

public class Trappingrainqwater {

	public static void main(String[] args) {
		int a[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		int n=a.length ;
		int water=0 ;
		for(int i=0;i<n;i++) {
			int maxleft=0;
			int maxright=0;
			
	for(int j=0;j<=i;j++) {
		maxleft=Math.max(maxleft, a[j]);	
		}
	for(int j=i;j<n;j++) {
		maxright=Math.max(maxright, a[j]);
	}
	water=water + Math.min(maxleft, maxright)-a[i];
	
		}			
		System.out.println("trapped water ="+ water);
		}

}
