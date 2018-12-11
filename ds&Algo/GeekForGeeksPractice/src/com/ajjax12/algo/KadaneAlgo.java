package com.ajjax12.algo;

import java.util.LinkedList;
import java.util.Queue;

public class KadaneAlgo {
	
	public static void getLargeSumInBunch(int[]a, int n) {
		Queue<Integer> q = new LinkedList<Integer>(); 
		int max_ending_here = 0; int max_so_far = 0;
		
		for(int i=0; i < a.length; i++) {
			if(i < n) {
				max_so_far = max_so_far + a[i];
				q.add(a[i]);
			}else {
				max_ending_here = max_ending_here + a[i] - q.remove();
				if(max_so_far < max_ending_here) {
					max_so_far = max_ending_here;
				}
				q.add(a[i]);
			}
		}
		System.out.println("getLargeSumInBunch : " + max_so_far );
		
	}
	
	private static void getLargeSum(int[] a) {
		int max_ending_here = 0; int max_so_far = 0;
		for(int i=0; i < a.length; i++) {
			max_ending_here = max_ending_here + a[i];
			
			if(max_so_far < max_ending_here) {
				max_so_far = max_ending_here;
			}
			if(max_so_far < 0) {
				max_so_far = 0;
			}
		}
		
		System.out.println("getLargeSum : " + max_so_far );
	}
	
	public static void main(String[] args) {
		
		int n = 3;
		//int[] a = {3, 4, 1, 5, -1, 6, 7  };
		//int[] a = {-1, -2, -3, -4};
		int[] a = { 9, 4, 1, -5, -1, 6, 7  };
		
		getLargeSumInBunch(a, n);
		getLargeSum(a);
	}
}


/*
Given an array containing both negative and positive integers. Find the contiguous sub-array with maximum sum.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.
 
Output:
Print the maximum sum of the contiguous sub-array in a separate line for each test case.
 
Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 1000
-100 ≤ A[i] <= 100
 
Example:
Input
2
3
1 2 3
4
-1 -2 -3 -4
Output
6
-1

*/