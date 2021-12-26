package com.geekbrains;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();

    }

        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;


        public static void invertArray () {
            System.out.println("Задание 1");
            int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                } else {
                    arr[i] = 1;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        //2. Задать пустой целочисленный массив длиной 100.
        // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

        public static void fillArray() {
            System.out.println("Задание 2");
            int[] arr = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = i + 1;
            }
            System.out.println(Arrays.toString(arr));
        }

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
        // и числа меньшие 6 умножить на 2;

        public static void changeArray() {
            System.out.println("Задание 3");
            int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] *= 2;
                }
            }
            System.out.println(Arrays.toString(arr));
        }

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами
        // (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей
        // можно по следующему принципу: индексы таких элементов равны,
        // то есть [0][0], [1][1], [2][2], …, [n][n];

        public static void fillDiagonal() {

            System.out.println("Задание 4");
            int[][] arr = new int[5][5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    arr[0][0] = 1;
                    arr[1][1] = 1;
                    arr[2][2] = 1;
                    arr[3][3] = 1;
                    arr[4][4] = 1;
                    arr[0][4] = 1;
                    arr[1][3] = 1;
                    arr[3][1] = 1;
                    arr[4][0] = 1;

                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();

            }
        }

        }














