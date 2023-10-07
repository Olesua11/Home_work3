package org.example;

public class HW_2 {


        public static void main(String[] args) {
            int[] arr = { -7, -4, -2, 2, 3, 6, 8 };
            int n = arr.length;

            for (int step = 0; step < n - 1; step++) {
                int minIndex = step;

                for (int j = step + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = arr[step];
                arr[step] = arr[minIndex];
                arr[minIndex] = temp;

                int[] tempArr = new int[n - step];
                for (int i = step; i < n; i++) {
                    tempArr[i - step] = arr[i];
                }
                selectionSort(tempArr);
                for (int i = 0; i < tempArr.length; i++) {
                    System.out.print(tempArr[i] + " ");
                }
                System.out.println();
            }
        }

        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int minIndex = i;

                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }

                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
