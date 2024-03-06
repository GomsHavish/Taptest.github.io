package com.tap;

import java.util.Scanner;

public class ConsecutiveChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		consChar(s);
		
	}
		public static void consChar(String s) {
		int start=0;
		int end=0;
		int si=0;
		int ei=0;
		for(int i=0;i<s.length()-1;i++) {
			
			if(s.charAt(i)==s.charAt(i+1)) {
				ei=i+1;
			}else {
				if(ei-si>end-start) {
					start=si;
					end=ei;
				}
				si=i+1;
				ei=i+1;
				
			}
		}
		if(ei-si>end-start) {
			start=si;
			end=ei;
		}
		for(int i=start;i<=end;i++) {
			System.out.print(s.charAt(i));return;
		}
	}

}
/*output

mississipppi
p*/
