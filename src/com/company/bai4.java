package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float sum = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        do {
            System.out.println("Moi nhap vao so n: ");
            n = sc.nextInt();
        } while (n<1);
        for (int i = 0; i<=n; i++) {
            if (i % 2 == 0) {
                sum += (float) 1 / 2*i;
            }
        }
        System.out.println("Tong: " + df.format(sum) );
}}
