package com.company;

public class Main {

    public static void main(String[] args) {
        double firstX = 1;
        double finishResult = sumIterative(firstX);
        System.out.println(finishResult);

        System.out.println(sumRecursive(firstX, 2));
    }

    public static double sumIterative(double a) {
        double result = 0;
        double prevX = a;
        for (int n = 2; n < 100; n++) {

            result = n / (Math.sin(prevX));
            prevX = result;
        }
        return result;
    }

    public static double sumRecursive(double prevX, int n) {
        System.out.println(prevX);
        if (n >= 100) {
            return prevX;
        }
        return sumRecursive(n / Math.sin(prevX), n + 1);


    }
}

