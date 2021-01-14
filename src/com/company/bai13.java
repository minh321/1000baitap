package com.company;

import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x, n;
        long sum = 0;
        System.out.println("Nhap x ");
        x = sc.nextInt();
        System.out.println("Nhap n ");
        n = sc.nextInt();
        for(int i = 1 ; i<=n;i++){
            sum += Math.pow(x,2*i);
        }
        System.out.println(sum);
    }
}
