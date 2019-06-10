import java.util.Arrays;
import java.util.Scanner;

public class ArrayFun5Words {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String[] arr = new String[5];


        System.out.println("Enter in 5 words: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = myScanner.nextLine();
        }
        System.out.println(Arrays.toString(arr));











    }
}
