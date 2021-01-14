package com.company;

import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        int sum = 0;
        System.out.println("Nhap x");
        x= sc.nextInt();
        System.out.println("Nhap n ");
        n= sc.nextInt();
        int a = 0;
        for(int i = 1; i<=n; i++){
            a += i;
            sum += Math.pow(x,n)/a;
        }
        System.out.println(sum);
    }
}
