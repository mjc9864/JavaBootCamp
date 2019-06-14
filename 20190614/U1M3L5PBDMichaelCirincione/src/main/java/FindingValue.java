import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class FindingValue {

    public static void main(String[] args) {


        ArrayList<Integer> arl = new ArrayList<Integer>();
        Random num = new Random();
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arl.add(num.nextInt(50)+1);
        }
        System.out.println("list: " + arl);
        System.out.println("what to find: ");
        String userInput = myScanner.nextLine();
        int userNum = Integer.parseInt(userInput);

        for(int i = 0; i < 10; i++){
            if (arl.get(i) == userNum){
                System.out.println(userInput + " yarr - matey");
            }
        }



    }

}
