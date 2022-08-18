package ua.org.prometheus.courses.studying;

public class Week4 {

    public class Comparator {
        public int compare(int a, int b) {
            if (a > b) {
                return 1;
            } else if (a == b) {
                return 0;
            } else {
                return -1;
            }
        }
    }

    public class Sort {
        private static void sort(int[] array, Comparator comp) {
            for (int gap = array.length / 2; gap > 0; gap /= 2) {
                for (int i = gap; i < array.length; i++) {
                    int val = array[i];
                    int j;
                    for (j = i; j >= gap && comp.compare(array[j - gap], val) > 0; j -= gap) {
                        array[j] = array[j - gap];
                    }
                    array[j] = val;
                }
            }
        }

        public void main(String[] args) {
            int[] array = {1, 5, 2, 4, 10, 6, 0, 3, 10};
            Comparator comp = new Comparator();

            sort(array, comp);
            for (int i = 0, j = 8; i < j; i++, j--) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }

    }

}
