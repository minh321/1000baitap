package com.company;

import java.util.Scanner;

public class bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float sum = 1;
        System.out.println("Nhap n ");
        n = sc.nextInt();
        float a=0;
        for (int i = 1; i<=n;i++){
            a += i;
            sum += 1/a;
        }
        System.out.println(sum);
    }
}
