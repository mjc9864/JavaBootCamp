import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WhereIsIt {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        for (int i = 0; arrayList.size() < 10; i++) {
            Random num = new Random();
            arrayList.add(num.nextInt(50) + 1);

        }
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[10];
        int s = 0;
        boolean n = false;
        System.out.print("Array: " + arrayList);

        System.out.print("find: ");
        int v = scanner.nextInt();
        for (int j = 0; j < a.length; j++) {
            if (a[j] == v && !n) {
                s = j;
                n = true;
            }
        }
        System.out.println();
        if (n) {
            System.out.println(v + s);
        } else {
            System.out.println(v);
        }


    }
}
