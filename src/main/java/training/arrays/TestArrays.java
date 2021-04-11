package training.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class TestArrays {
    public static void main(String[] args) {
        int numbers[][] = {{0, 1, 2}, {3, 4, 5, 6}};
        String[] names1 = {"Mary", "Ann", "Jane", "Tom"};

        System.out.println(numbers[0].length);
        System.out.println(numbers[1].length);
        Arrays.fill(names1, 2, 4, "Carlos");
        printArray(names1);
        printArray(numbers);
        System.out.println(names1.length);
        int x = Arrays.binarySearch(names1, "Carlota");
        System.out.println("BinarySearch:" + x);
        if (x > 0) {
            int x2 = Arrays.binarySearch(names1, x + 1, names1.length, "fefefe");
            System.out.println("BinarySearch2:" + x2);


        }

        System.out.println("//--------------------");
        String[] names = {"Mary", "Jane", "Elizabeth", "Jo", "An"};
        String[] names2 = {"Mary", "Jane", "Elizabeth", "Jo", "An"};
        Arrays.sort(names, new Compare());
        printArray(names);
        System.out.println("//--------------------");
        Arrays.sort(names2);
        printArray(names2);

    }

    private static void printArray(int[][] numbers) {
        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers[a].length; b++) {
                System.out.println("A:" + a + "| B:" + b + "| V:" + numbers[a][b]);
            }
        }

    }


    private static void printArray(String[] numbers) {
        for (int a = 0; a < numbers.length; a++) {
            System.out.println("A:" + a + "| V:" + numbers[a]);
        }
    }
}

class Compare implements Comparator<String> {
    public int compare(String s1, String s2) {
        return s2.length() - s1.length();
    }
}

