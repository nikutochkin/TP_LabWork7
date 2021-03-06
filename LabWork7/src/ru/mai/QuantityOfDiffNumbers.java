package ru.mai;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Дан список чисел, который может содержать до 100000 чисел. Определите, сколько в нем встречается различных чисел.
 * <p>
 * Формат ввода
 * Вводится список целых чисел. Все числа списка находятся на одной строке.
 * <p>
 * Формат вывода
 * Выведите ответ на задачу.
 * <p>
 * В случае ввода некорректных данных программа должна вывести "ERROR!" и корректно завершить работу.
 */

public class QuantityOfDiffNumbers {

    static Scanner in = new Scanner(System.in);
    static final String ERROR_MESSAGE = "ERROR";

    public static void main(String[] args) {

        TreeSet<Integer> mainSet = new TreeSet<>();

        try {
            while (in.hasNextInt()) {
                int buff = in.nextInt();
                mainSet.add(buff);

                //выход для консольного ввода
                if (in.hasNext("~")) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE);
        }

        System.out.println(mainSet.size());
    }
}
