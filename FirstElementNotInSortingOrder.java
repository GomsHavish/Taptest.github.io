package com.tap;

import java.util.Scanner;

public class FirstElementNotInSortingOrder {
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<ar.length-1;i++) {
			if(ar[i]>ar[i+1]) {
				System.out.println(ar[i+1]);
				return;
			}
	}
		
		System.out.println(ar[ar.length-1]);

	}}
/*
output
7
1 2 3 6 4 5 7
4
*/
