package com.tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

class BookList implements Comparable<BookList>
{
	String title;
	String author;
	int year;
	
	public BookList(String title, String author, int year) {
		this.title = title;
		this.author = author;
		this.year = year;
	}
	@Override
	public int compareTo(BookList o) {
		if(this.year!=o.year) {
			return Integer.compare(this.year,o.year);
		}else if(!this.author.equals(o.author)) {
			return this.author.compareTo(o.author);
		}else {
		return this.title.compareTo(o.title);
		}
	}
	public String toString() {
		return title+", "+author+", "+year;
	}
}
public class Book {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N =Integer.parseInt(sc.nextLine());
		List<BookList> books=new ArrayList<>();
		
		for(int i=0;i<N;i++) {
			String[] details=sc.nextLine().split(",");
			String title=details[0];
			String author=details[1];
			int year=Integer.parseInt(details[2]);
			books.add(new BookList(title,author,year));
			
		}
		Collections.sort(books);
		TreeSet<BookList> uniquebooks=new TreeSet<>(books);
		for(BookList book:uniquebooks) {
			System.out.println(book);
		}
	}
}
/*ip
 * 5
thehobit,jrrtol,1937
tolkiensworld,jrrtol,1977
thegreatgat,fscottfit,1925
tolkilamock,harperlee,1960
tolkiensworld,jrrtol,1977


op
thegreatgat, fscottfit, 1925
thehobit, jrrtol, 1937
tolkilamock, harperlee, 1960
tolkiensworld, jrrtol, 1977

*/


