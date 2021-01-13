package com.company;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 1;
        System.out.println("Nhap n: ");
        n= sc.nextInt();
        for (int i = 1; i<=n; i++){
            sum *= i;
        }
        System.out.println(sum);

    }
}
