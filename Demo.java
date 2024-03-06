package com.tap;


public class Demo{
static void add(int a, double b){
System.out.println("Method 1");
}
static void add(int a, float b){
System.out.println("Method 2");
}
static void add(float a, float b){
System.out.println("Method 3");
}
public static void main(String[] args){
int a=10;
int b=20;
add(a,b);
}}

