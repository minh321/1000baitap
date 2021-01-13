package com.company;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int T=1;
        int sum = 0;
        System.out.println("Nhap n: ");
        n= sc.nextInt();
        for (int i = 1; i<=n; i++){
            sum += T*=i;
        }
        System.out.println(sum);
    }
}
