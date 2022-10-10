package com.gokhankaplan.fibonacciserisi;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String [] args) {
        int n, i=1, k1 = 0, k2 = 1, k3;

        Scanner input = new Scanner(System.in);
        System.out.println("Fibonacci serisini bulmak istediğiniz sayıyı giriniz: ");
        n = input.nextInt();

        while (i<n){
            k3 = k1 + k2;
            System.out.println(k3);
            k1 = k2;
            k2 = k3;
            i++;
        }

    }
}
