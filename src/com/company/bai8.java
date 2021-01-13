package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        int n;
        float sum = 0;
        do {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        } while (n<0);
        for (int i = 1; i<=n; i++) {
            sum += (float) (2*i+1)/(2*i+2);
        }
        System.out.println("Tong " + df.format(sum));
    }
}
