package com.revature;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] str = new String[100];
        for (int i = 0; i < str.length; i++) {
            str[i] = Integer.toString(i);
        }

        int sum = Arrays.stream(str).mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}