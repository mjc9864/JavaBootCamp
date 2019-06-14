import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ThereOrNot {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; arrayList.size() < 10; i++) {
            Random num = new Random();
            arrayList.add(num.nextInt(50) + 1);

        }
            Scanner myScanner = new Scanner(System.in);
            int a[] = new int[10];
            int in = 0;
            boolean there = false;
            System.out.print("array list " + arrayList);

            System.out.print("Value to find: ");
            int value = myScanner.nextInt();
            for (int j = 0; j < a.length; j++) {
                if (a[j] == value && !there) {
                    in = j;
                    there = true;
                }
            }
            System.out.println();
            if (there) {
                System.out.println(value + "is in " + in);
            } else {
                System.out.println(value + "is not there");
            }


        }

    }

