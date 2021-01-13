package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        float sum = 0;
        DecimalFormat df = new DecimalFormat("#,##");
        do {
            System.out.println("Nhap n: ");
            n = sc.nextInt();
        } while (n<1);
        for(int i = 1; i<=n; i++){
            sum += (float) 1/(i*(i+1));
        }
        System.out.println("Tong: " + df.format(sum));
    }
}
