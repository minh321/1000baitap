package com.company;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        do {
            System.out.println("Moi ban nhap vao so n");
            n = sc.nextInt();

        } while (n < 1);
        for (int i = 1 ; i <= n; i++) {
            sum = sum + i*i;
        }
        System.out.println("Tong = "+ sum);
    }

}
