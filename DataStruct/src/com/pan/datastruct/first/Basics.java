package com.pan.datastruct.first;

import java.util.Scanner;

/**
 * @author Administrator
 * @time 2015/4/6
 * @description:
 */
public class Basics {


    public static void equal(int num1, int num2, int num3) {
        if (num1 == num2 && num1 == num3) {

            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    public boolean equal2(double num) {
        if (num > 0 && num < 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void Output2() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }

    public static void Output3() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
            System.out.printf("%.5f\n", t);
        }
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
                System.out.println(sum);
            }
        }
        int sum2 = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
                System.out.println(sum2);
            }
        }
    }

    public static void histogram(int M) {
        int[] a = new int[M];
        for (int i = 0; i < M - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                a[i] = i;
                System.out.print(a[i] + ",");
            }
        }
    }

    public static String exR1(int n) {
        if (n <= 0)
            return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    public static int mystery(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mystery(a * a, b / 2);
        }
        return mystery(a * a, b / 2) * a;
    }

    public static long F(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return F(N - 1) + F(N - 2);
    }

    public static void Table() {
        Scanner scanner = new Scanner(System.in);
        String[] name = new String[5];
        int[] num1 = new int[5];
        int[] num2 = new int[5];
        int time = 0;
        while (time < 5) {
            time++;
            System.out.println("name: ");
            name[time] = scanner.next();
            System.out.println("num1: ");
            num1[time] = scanner.nextInt();
            System.out.println("nim2: ");
            num2[time] = scanner.nextInt();
        }
    }

}




