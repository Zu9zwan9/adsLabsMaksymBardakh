package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Оберіть систему 1-араб-роман, 2-роман-араб");
        int ans = scanner.nextInt();
        if (ans == 1) {
            arabToRoman();
        } else
            RomanToArab.romanToDecimal();
        System.out.println("Success");
    }

    public static void arabToRoman() {
        StringBuilder result = new StringBuilder();
        int[] arabNumbers = new int[]{1, 5, 10, 50, 100, 500, 1000};
        String[] romanNumbers = new String[]{"I", "V", "X", "L", "C", "D", "M"};
                System.out.println("Введіть число від 1 до 3000");
                int x = scanner.nextInt();
                if (x > 1 && x <= 3000) {
                    System.out.println("Success");
                    while (x >= 1) {
                        for (int i = arabNumbers.length - 1; i >= 0; i--) {
                            int a = arabNumbers[i];
                            if (x >= a) {
                                result.append(romanNumbers[i]);
                                x = x - a;
                                break;
                            }
                        }
                    }
                    System.out.println("Результат=" + result);
                } else {
                    System.out.println("Fail");
                }
                System.out.println("End Program");
            }
        }
