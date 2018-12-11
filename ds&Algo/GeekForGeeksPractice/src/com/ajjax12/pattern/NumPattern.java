package com.ajjax12.pattern;

public class NumPattern {
	
	private static void printPattern(int n) {
		for(int i = 0; i < n; i++) {
			int num = n;
			for(int j = 0; j < (n * n) - (n*i); j++) {
				if(j % (n-i) == 0) {
					num = num -1;
				}
				System.out.print(num+1 + " ");
			}
			System.out.println("");
		}
	}
	
	
	public static void main(String[] args) {
		printPattern(3);
		sol2Rec(3, 3);
	}
	
	private static void sol2Rec(int n, int c) {
		if(c == 0) {
			return;
		}
		int num = n;
		for(int i=n; i > 0; i--) {
			for(int j =0; j < c; j++) {
				System.out.print(num+" ");
			}
			num = num - 1;
		}
		System.out.println("");
		c = c -1;
		sol2Rec(n, c);
	}

}

/**

You a given a number N. You need to print the pattern for the given value of N.
for N=2 the pattern will be 
2 2 1 1
2 1
for N=3 the pattern will be 
3 3 3 2 2 2 1 1 1
3 3 2 2 1 1
3 2 1
*/
