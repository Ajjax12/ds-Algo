package com.ajjax12.pattern;

public class NumPattern2 {

	/**
	 * 
55555
55 55
5   5
55 55
55555
 
999999999
9999 9999
999   999
99     99
9       9
99     99
999   999
9999 9999
999999999
	 */
	public static void main(String[] args) {
		int n = 9;
		int mid = n/2;
		int start =0, end =0;
		for(int i=0; i < n; i++) {
			if(mid < i) {
				start = start +1;
				end = end - 1;
			}else {
				start = mid - i;
				end = mid +i;
			}
			for(int j=0; j < n; j++) {
				if(start < j && end > j)  {
					System.out.print(" ");
				}else {
					System.out.print(n+"");
				}
			}
			System.out.println("");
		}
	}

}
