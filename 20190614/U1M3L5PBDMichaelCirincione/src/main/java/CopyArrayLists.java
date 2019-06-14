import java.util.ArrayList;
import java.util.Random;

public class CopyArrayLists {

    public static void main(String[] args) {


        ArrayList<Integer> arl = new ArrayList<Integer>();

        Random num = new Random();

        for (int i = 0; i < 10; i++){
            arl.add(num.nextInt(100)+1);

        }


        System.out.println("arl 1: " + arl);


        ArrayList<Integer> arl2 = new ArrayList<Integer>();
         for (int element : arl){
             arl2.add(element);
         }
        System.out.println("ar2" + arl2);

         arl.set(9, -7);

        System.out.println(arl);

        System.out.println(arl2);





    }

}
