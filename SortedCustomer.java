package com.tap;

import java.util.*;

class Customer implements Comparable<Customer> {
    int customerId;
    String firstName;
    String lastName;
    String city;

    public Customer(int customerId, String firstName, String lastName, String city) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
    }

    @Override
    public int compareTo(Customer other) {
        if (this.customerId != other.customerId) {
            return Integer.compare(this.customerId, other.customerId);
        } else if (!this.lastName.equals(other.lastName)) {
            return this.lastName.compareTo(other.lastName);
        } else if (!this.firstName.equals(other.firstName)) {
            return this.firstName.compareTo(other.firstName);
        } else {
            return this.city.compareTo(other.city);
        }
    }

    @Override
    public String toString() {
        return customerId + ", " + firstName + ", " + lastName + ", " + city;
    }
}

public class SortedCustomer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Customer> customers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] details = scanner.nextLine().split(",");
            int customerId = Integer.parseInt(details[0]);
            String firstName = details[1];
            String lastName = details[2];
            String city = details[3];
            customers.add(new Customer(customerId, firstName, lastName, city));
        }

        Collections.sort(customers);

        Set<Customer> uniqueCustomers = new TreeSet<>(customers);
        for (Customer customer : uniqueCustomers) {
            System.out.println(customer);
        }
    }
}
/*Java program- you are assigned to task of organizing a list of customer details based on certain criteria.
Given an integer value N and N lines of customer information, your objective is to print the details in ascending order of Customer ID.
 If the IDs are same, sort alphabetically by last name; if the last names are same, sort alphabetically by first name; ; 
if the first names are same, sort alphabetically by city; and if all details are same , consider it a duplicate and print it only once.
Input format:
The first line of input corresponds to the number of customers ‘n’.
The next ‘n’ lines of input contain customer details in CSV format. Customer ID, FirstName, LastName, City.
Output format:
Print the sorted customer details in CSV format.

 * 
 * Sample Input
 *
4
101, john, doe, newyork
102, alice, smith, losangeles
101, john, doe, newyork
104, bob, johnson, Chicago

Sample output
101, john, doe, newyork
102, alice, smith, losangeles
104, bob, johnson, Chicago
*/