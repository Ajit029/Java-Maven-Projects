package com.ajit;

public class App {
    public static void main(String[] args) {
        System.out.println("Hi, ");
        System.out.println("The sum is: " + add(23, 45, 67, 89, 90, 94));
    }

    public static int add(int... s){
        int sum = 0;
        for (int i: s){
           sum += i; 
        }
        return sum;
    }
}
