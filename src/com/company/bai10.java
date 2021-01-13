package com.company;

import java.util.Scanner;

public class bai10 {
    static int x, n;
    public  static long tinhLuyThua(int x, int n){
        long T = 1;
        for (int i = 0; i < n; i++){
            T *= x;
        }
        return T;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap x: ");
        x= sc.nextInt();
        System.out.println("Nhap n: ");
        n= sc.nextInt();
        System.out.println(x + "^" + n + "=" + bai10.tinhLuyThua(x,n));


    }
}
