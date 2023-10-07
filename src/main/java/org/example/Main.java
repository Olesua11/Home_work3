package org.example;

public class Main {

    public static void main(String[] args) {
        double[] array = {6, -2, -1, 2, 1, 2, -3, 1, 2, 3, 2, -1, -1, 2, 3};
        boolean calculate = false;

        double Positive = 0;
        int countPositive = 0;


        for (double number : array) {
            if (!calculate) {
                if (number < 0) {
                    calculate = true;
                }
            } else {
                if (number > 0) {
                    Positive += number;
                    countPositive++;
                }
            }
        }
        if (countPositive > 0) {
            double averagePositive = Positive / countPositive;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + averagePositive);

        }

    }
}
