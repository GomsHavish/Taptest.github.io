package com.tap;

import java.util.*;

 public class Flight implements Comparable<Flight> {//we have 2 class in same file.in java, only one public class is allowed in a source file, and the name of source file should match the name of public class.
    String name;
    int price;
    int duration;

    public Flight(String name, int price, int duration) {
        this.name = name;
        this.price = price;
        this.duration = duration;
    }

    @Override
    public int compareTo(Flight other) {
        if (this.price != other.price) {
            return Integer.compare(this.price, other.price);
        } else if (this.duration != other.duration) {
            return Integer.compare(this.duration, other.duration);
        } else {
            return this.name.compareTo(other.name);
        }
    }

    @Override
    public String toString() {
        return name + "," + price + "," + duration;
    }
}

 class FlightSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Flight> flights = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split(",");
            String name = details[0];
            int price = Integer.parseInt(details[1]);
            int duration = Integer.parseInt(details[2]);
            flights.add(new Flight(name, price, duration));
        }

        Collections.sort(flights);

        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }
}
/*
 * Java program-You are given a list of flight details, and your task is to implement a program that sort the flights base on certain criteria. The sorting should be done in the following order:
First, sort the flights based on the price.
If 2 flights have same price, then sort them based on the duration.
If 2 flights have same price and duration, then sort them based on the name of the flight.
Input format:
The first line of input corresponds to the number of flights ‘n’.
The next ‘n’ lines of input contains flight details in CSV format: name, price, duration of flights.
Output format:
Print the sorted addresses in CSV format.

 * 
 *
 input
 5
 Delta,300,2
 United,200,1
 American,300,3
 Southwest,200,2
 Jetblue,100,1
 
 output
 Jetblue,100,1
 United,200,1
 Southwest,200,2
 Delta,300,2
 American,300,3
*/