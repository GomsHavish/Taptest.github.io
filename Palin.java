package com.tap;

import java.util.Scanner;
import java.util.TreeSet;

public class Palin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		longPalin(s);
		allDistinctPalin(s);
	}
		static boolean isPalindrom(String s) {
			int i=0, j=s.length()-1;
			while(i<j) {
				if(s.charAt(i)==s.charAt(j)) {
					i++;j--;
				}else {
					return false;
				}
			}
			return true;
			
		}
		static void longPalin(String s) {
			
			for(int size=s.length()-1;size>0;size--) {
				for(int i=0;i<=s.length()-size;i++) {
					String t="";
					for(int j=i;j<i+size;j++) {
						
						t=t+s.charAt(j);
					}   
					if(isPalindrom(t)) {
						System.out.println(t);return;
						}
				}}
			}
			
			static void allDistinctPalin(String s) {
				TreeSet<String> dp=new TreeSet<>();//distinct
				for(int size=1;size<=s.length();size++) {
					for(int i=0;i<=s.length()-size;i++) {
						String t="";
						for(int j=i;j<i+size;j++) {
							t=t+s.charAt(j);
						}
						if(isPalindrom(t)) {
							dp.add(t);
							
						}
					}
				}
				System.out.println(dp);
				
			
		}
	}


