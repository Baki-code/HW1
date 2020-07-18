package ru.gb.catchthedrop;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Main {

    public static void main(String[] args) {
        byte b = 127;
        short s = 123;
        int i = 1000;
        long l = 20000000L;
        float f = 13.4f;
        double d = 134.123543;
        char c = 'c';
        boolean bool = false;
        String st = "Hello world!";
        System.out.println(integer(5, 4));
        System.out.println(computation(2.4f, 3.5f, 1.3f, 2.6f));
        PositiveOrNegative(-5);
        System.out.println(PosOrNeg(4));
        HelloUsername("Тимофей");
        leapYear(2020);
    }

    public static float computation(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }

    public static boolean integer(int num1, int num2) {
        return num1 + num2 >= 10 || num1 + num2 <= 20;
    }

    public static void PositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean PosOrNeg(int a) {
        return a >= 0;
    }

    public static void HelloUsername(String a) {
        System.out.printf("Hello,%s!%n", a);
    }

    public static void leapYear(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}

