import java.util.Scanner;

public class Nim {

    public static void main(String[] args) {


        int a = 3;
        int b = 3;
        int c = 3;

        System.out.println("A:" + a + " B:" + b + " C:" + c);
        Scanner myScanner = new Scanner(System.in);

        String userInput;
        do {
            System.out.println("Player 1 Choose a pile a, b, or c: ");
            userInput = myScanner.nextLine();

            if (userInput.equals("a")) {

                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                System.out.println("how many counters to remove: 1,2,or 3:");
                int userNum = Integer.parseInt(myScanner.nextLine());

                if (userNum == 1) {
                    a--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 2) {
                    a--;
                    a--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 3) {
                    a--;
                    a--;
                    a--;
                }
            }
            if (userInput.equals("b")) {

                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                System.out.println("how many counters to remove: 1,2,or 3:");
                int userNum = Integer.parseInt(myScanner.nextLine());
                if (userNum == 1) {
                    b--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 2) {
                    b--;
                    b--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 3) {
                    b--;
                    b--;
                    b--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                }
            }
            if (userInput.equals("c")) {

                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                System.out.println("how many counters to remove: 1,2,or 3:");
                int userNum = Integer.parseInt(myScanner.nextLine());
                if (userNum == 1) {
                    c--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 2) {
                    c--;
                    c--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 3) {
                    c--;
                    c--;
                    c--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                }
            }

            System.out.println("Player 2 Choose a pile a, b, or c: ");
            userInput = myScanner.nextLine();

            if (userInput.equals("a")) {

                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                System.out.println("how many counters to remove: 1,2,or 3:");
                int userNum = Integer.parseInt(myScanner.nextLine());

                if (userNum == 1) {
                    a--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 2) {
                    a--;
                    a--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 3) {
                    a--;
                    a--;
                    a--;
                }
            }
            if (userInput.equals("b")) {

                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                System.out.println("how many counters to remove: 1,2,or 3:");
                int userNum = Integer.parseInt(myScanner.nextLine());
                if (userNum == 1) {
                    b--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 2) {
                    b--;
                    b--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 3) {
                    b--;
                    b--;
                    b--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                }
            }
            if (userInput.equals("c")) {

                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                System.out.println("how many counters to remove: 1,2,or 3:");
                int userNum = Integer.parseInt(myScanner.nextLine());
                if (userNum == 1) {
                    c--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 2) {
                    c--;
                    c--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                } else if (userNum == 3) {
                    c--;
                    c--;
                    c--;
                    System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                }
            }

        } while (a > 0 || b > 0 || c > 0);

        if ()


    }

}