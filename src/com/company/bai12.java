package com.company;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int x;
        System.out.println("Nhap x: ");
        x= sc.nextInt();
        System.out.println("Nhap n: ");
        n= sc.nextInt();
        int sum =0;
        long T = 1;
        for (int i = 0; i < n; i++){
            sum += T *= x;
        }
        System.out.println(sum);
    }
}

