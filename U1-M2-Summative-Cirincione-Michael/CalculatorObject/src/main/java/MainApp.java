public class MainApp {

    public static void main(String[] args) {


        CalculatorApp calculator = new CalculatorApp();

        System.out.println("1 + 1 = " + calculator.add(1,1));
        System.out.println("23 - 52 = " + calculator.subtract(23,52));
        System.out.println("34 * 2 = " + calculator.multiply(34,2));
        System.out.println("12 / 3 = " + calculator.divide(12,3));
        System.out.printf("12 / 7 = %.2f %n", + calculator.divide2(12,7));
        System.out.printf("3.4 + 2.3 = %.2f %n", + calculator.add2(3.4,2.3));
        System.out.printf("6.7 * 4.4 = %.2f %n", + calculator.multiply2(6.7,4.4));
        System.out.printf ("5.5 - 0.5 = %.2f %n", + calculator.subtract2(5.5,0.5));
        System.out.printf("10.8 / 2.2 = %.2f %n", + calculator.divide2(10.8,2.2));


    }






}
