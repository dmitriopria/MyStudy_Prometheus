package ua.org.prometheus.courses.studying;

public class Week2 {

    public class SquareRoot {

        public static void main(String[] args) {

            // Task 1

            double a = 3;
            double b = 2.5;
            double c = -0.5;

            double d = b * b - 4 * a * c;
            if (d > 0 & (a != 0 & c != 0)) {
                System.out.println("x1=" + (-b + Math.sqrt(d)) / (2 * a));
                System.out.println("x2=" + (-b - Math.sqrt(d)) / (2 * a));
            } else if (a == 0 & b != 0 & c == 0) {
                System.out.println("x1=" + 0.0);
                System.out.println("x2=" + 0.0);
            } else if (d == 0 & a != 0) {
                System.out.println("x1=" + (-b / (2 * a)));
                System.out.println("x2=" + (-b / (2 * a)));
            } else {
                System.out.println("x1=");
                System.out.println("x2=");
            }

            // Task 2

            int[][] anArray = new int[5][5];
            int e = 1;
            for (int i = 0; i < anArray.length; i++) {
                for (int j = 0; j < anArray.length; j++) {
                    if ((i == j) | (i + j == anArray.length - 1))
                        System.out.print(" * ");
                    else if (e < 10) {
                        System.out.print(" " + e + " ");
                    } else {
                        System.out.print(e + " ");
                    }
                    e = e + 1;
                }
                System.out.println();
            }

            // Task 3

            int[] array = {30, 2, 10, 4, 6};
            int length = array.length;
            for (int i = 0; i < array.length; i++) {
                for (int j = array.length - 1; j > i; j--) {
                    if (array[j] < array[j - 1]) {
                        int tmp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = tmp;
                    }
                }
            }
            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }

            // Task 4

            int[] array2 = {30, 2, 10, 4, 6};
            int length2 = array2.length;

            int step = length / 2;
            while (step > 0) {
                for (int i = 0; i < (length - step); i++) {
                    int j = i;
                    while (j >= 0 && array2[j] > array2[j + step]) {

                        int temp = array2[j];
                        array2[j] = array2[j + step];
                        array2[j + step] = temp;
                        j--;
                    }
                }
                step = step / 2;
            }
            for (int i = 0; i < length; i++) {
                System.out.print(array2[i] + " ");
            }

            // Task 5

            int data[] = {3, 6, 7, 10, 34, 56, 60};
            int numberToFind = 10;

            int index = -1;

            for (int i = 0; i < data.length; i++) {
                if (data[i] == numberToFind) {
                    index = i;
                    break;
                }
            }
            System.out.println(index);

        }

    }

}


