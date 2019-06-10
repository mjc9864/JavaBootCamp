import java.util.Scanner;

public class ValidNumber {


    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int userNum;

        do {
            System.out.println("enter a number between 1 and 10");
            userInput = myScanner.nextLine();
            userNum = Integer.parseInt(userInput);
        } while(userNum < 1 || userNum > 10);

        System.out.println(userNum);







    }
}
