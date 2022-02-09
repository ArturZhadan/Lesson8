package com.home;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input number -> ");
        number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= 10; i++ ){
            result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }
}
