import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class BasicArray2 {

    public static void main(String[] args) {
      int a;

     List<Integer> arl = new ArrayList<Integer>();

        Random num = new Random();
        num.nextInt();

        for (int i=0; i< 10; i++)
        {
            a = num.nextInt(100)+1;
               arl.add(a);
        }

        System.out.println("list" + arl);
    }

}
