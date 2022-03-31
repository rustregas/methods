package com.company;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] arr = new int[] {1, 2, 7, 4, 7};

        checkLeapYear(1984);
        getInstallMessage(1, 2022);
        countDeliveryDays(150);
        checkCharDuplicates("afg1233");
        //task5
        inverseArray(arr);
        System.out.println(Arrays.toString(arr));
        //task6
        System.out.printf( "Среднее значение массива - %.2f%n", getAverageArrayValues(generateRandomArray()) );
    }

    //task1
    public static void checkLeapYear(int year) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        if (isLeapYear) {
            System.out.printf("%d год является високосным%n", year);
        } else {
            System.out.printf("%d год не является високосным%n", year);
        }
    }

    //task2
    public static void getInstallMessage(int clientOS, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean isOldDevice = deviceYear < currentYear;
        boolean isClientIOS = clientOS == 0;

        if (isClientIOS) {
            if (isOldDevice) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (isOldDevice) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    //task3
    public static void countDeliveryDays(int deliveryDistance) {
        int deltaDistance = 40;
        int cntDeliveryDays = (((deliveryDistance - 20) / deltaDistance) + 2);

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + 1);
        } else {
            System.out.println("Потребуется дней: " + cntDeliveryDays);
        }
    }

    //task4
    public static void checkCharDuplicates(String sortedString) {
        for (int i = 0; i < sortedString.length()-1; i++) {
            if (sortedString.charAt(i) == sortedString.charAt(i + 1)) {
                System.out.printf("Символ %s дублируется в строке.%n", sortedString.charAt(i));
                return;
            }
        }
        System.out.println("Дублирование символов в строке не обнаружено");
    }

    //task5
    public static void inverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; ++i) {
            int elem = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = elem;
        }
    }

    //task6
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static float getAverageArrayValues(int[] arr) {
        float summ = getSumArrayValues(arr);
        return summ / arr.length;
    }

    public static int getSumArrayValues(int[] arr) {
        int summ = 0;
        for (int i : arr) {
            summ += i;
        }
        return summ;
    }
}