package leetcode;

public class Besttimetosellandbuystock {
public static void main(String args[]) {
	int price[]= {7,1,5,3,6,4};
	int minprice=price[0];
	int maxprofit=0;
	for(int i=0;i<price.length;i++) {
		if(price[i]<minprice) {
			minprice=price[i];
		}
		else {
			int profit=price[i]-minprice;
			if(profit>maxprofit) {
				maxprofit=profit;
			}
		}
	}
	System.out.println(maxprofit);
}
}
