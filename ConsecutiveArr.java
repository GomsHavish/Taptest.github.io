package com.tap;

import java.util.HashMap;
import java.util.Scanner;

public class ConsecutiveArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		consecArr(ar);
	}
		static void consecArr(int[] ar){
			int start=0, end=0, si=0, ei=0;
			for(int i=0;i<ar.length-1;i++) {
				if(ar[i]<=ar[i+1]) {
					 ei++;
					
				}else {
					if(ei-si>end-start) {
						start=si;
						end=ei;
					}
					si=i+1;ei=i+1;
				}
			}
			if(ei-si>end-start) {
				start=si;
				end=ei;
			}
			for(int i=start;i<=end;i++) {
				System.out.print(ar[i]+" ");
			}
		}
		
	}


