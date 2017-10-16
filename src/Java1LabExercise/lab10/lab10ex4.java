package Java1LabExercise.lab10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.function.Predicate;

public class lab10ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int count = 0;
        while (true) {
            int a = random.nextInt(21) - 10;
            if (a == 0) {
                break;
            } else if (a == 1) {
                integers.removeIf(new Predicate<Integer>() {

                    @Override
                    public boolean test(Integer t) {
                        if (t > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                });
                printIntegers(integers);
            } else if (a == -1) {
                integers.removeIf(new Predicate<Integer>() {

                    @Override
                    public boolean test(Integer t) {
                        if (t < 0) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                });
                printIntegers(integers);
            } else if (a == 10) {
                integers.sort(new Comparator<Integer>() {

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o1 - o2;
                    }
                });
                printIntegers(integers);
            } else if (a == -10) {
                System.out.println(integers.size());
            } else {
                integers.add(a);
                printIntegers(integers);
            }
            count++;
        }
        System.out.println(count);
    }

    private static void printIntegers(ArrayList<Integer> integers) {
        for (Integer integer : integers) {
            System.out.print(integer);
            System.out.print(" ");
        }
        System.out.println();
    }
}
