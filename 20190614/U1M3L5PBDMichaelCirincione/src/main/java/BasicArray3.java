import java.util.ArrayList;
import java.util.Random;

public class BasicArray3 {

    public static void main(String[] args) {

        ArrayList<Integer> arl = new ArrayList<Integer>();

        Random num = new Random();

        for (int i= 0; i < 1000; i++){
            arl.add(num.nextInt(90)+10);

        }
        System.out.println(arl);

    }


}
