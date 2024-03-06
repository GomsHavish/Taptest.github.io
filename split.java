package com.tap;

import java.util.Scanner;

public class split {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] res=split(s);
		for(int i=0,j=res.length-1;i<j;i++,j--) {
			System.out.print(res[i]+" "+res[j]+" ");
//			System.out.println();
//			System.out.print(res[j]+" "+res[i]+" ");
//			System.out.println();
//			System.out.print(res[j]+res[j].length()+" "+res[i]+res[i].length()+" ");	
		}
		
	}
	
		static int count(String s) {
			
			int count=0;
			for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ') {
				count++;
			}
				
			}
			return (s.charAt(0)!=' ') ? count+1 : count;
		}
	static String[] split(String s) {
		int n=count(s);
		String[] ar=new String[n];
		int j=0;
		String t="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
			t=t+s.charAt(i);
		}else if(t.length()>0) {
			ar[j]=t;j++;
			t="";
		}
	}
		ar[j]=t;
		return ar;
	}
		
}


