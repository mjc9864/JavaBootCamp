import java.util.Scanner;

public class BabyNim {

    public static void main(String[] args) {

        int a = 3;
        int b = 3; // <-- piles
        int c = 3;

        System.out.println("A:" + a + " B:" + b + " C:" + c);
        Scanner myScanner = new Scanner(System.in);

        String userInput;
        do {                // while piles are not <= 0
            System.out.println("Choose a pile a, b, or c: ");
            userInput = myScanner.nextLine();

            if (userInput.equals("a")) {                    //   the question process
                        // for exact press                      //
                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
                System.out.println("how many counters to remove: 1,2,or 3:");
                int userNum = Integer.parseInt(myScanner.nextLine());
                                // strings into integers
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
//            if (a <= 0){
//                System.out.println("Game Over");
//                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
//                break;
//            } else if (b <= 0){
//                System.out.println("Game Over");
//                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
//                break;
//            } else if (c <= 0) {
//                System.out.println("Game Over");
//                System.out.println("A:" + a + ",B:" + b + ",C:" + c);
//                break;
//            }

        } while (a != 0 || b != 0 || c != 0);


            if (a < 0){
                System.out.println("g");
                System.out.println();

            } else if (b < 0){
                        System.out.println("g");
                System.out.println();

            } else if (c < 0) {
                System.out.println("g");
                System.out.println();

            }




    }
}