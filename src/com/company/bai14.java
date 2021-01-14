package com.company;

import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        int sum = 0;
        System.out.println("Nhap x ");
        x = sc.nextInt();
        System.out.println("Nhap n ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, (2 * n + 1));
        }
        System.out.println(sum);
    }
}
