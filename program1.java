package com.tap;



	import java.util.HashMap;
	import java.util.Map;

	public class program1 {

	    public static void main(String[] args) {
	        // Sample transaction data (transactionID, productID, quantity)
	        int[][] transactions = {
	                {1, 101, 5},
	                {2, 102, 3},
	                {3, 101, 2},
	                {4, 103, 4},
	                {5, 102, 1}
	        };

	        // Map to store product quantities
	        Map<Integer, Integer> productQuantityMap = new HashMap<>();

	        // Process transactions and update product quantities
	        for (int[] transaction : transactions) {
	            int productId = transaction[1];
	            int quantity = transaction[2];

	            // Update quantity in the map
	            productQuantityMap.put(productId, productQuantityMap.getOrDefault(productId, 0) + quantity);
	        }

	        // Print the result
	        System.out.println("Product ID\tTotal Quantity");
	        for (Map.Entry<Integer, Integer> entry : productQuantityMap.entrySet()) {
	            System.out.println(entry.getKey() + "\t\t\t" + entry.getValue());
	        }
	    }
	}


 