package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Insert integer number: ");
	int a = scanner.nextInt();
	boolean flag = Ex(a);
	if (flag == true) {
	    System.out.println("Your number is negative!");
    }
    }
    public static boolean Ex (int a) {
        boolean flag = false;
        if (a < 0) {
            flag = true;
        }
        return flag;
    }
}
