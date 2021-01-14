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
        long sum =0;
        for (int i = 1; i <= n; i++){
            sum += Math.pow(x,i);
        }
        System.out.println(sum);
    }
}

