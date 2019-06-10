import java.util.Arrays;

public class ArrayFunReverseIt {

   public static void main(String[] args) {

      int[] arr = {1,2,3,4,5};
      int[] arr2 = new int[arr.length];

       for (int i = 0; i < arr.length; i++){
           arr2[i]=arr[arr.length-(i+1)];
       }

       System.out.println (Arrays.toString(arr));
       System.out.println (Arrays.toString(arr2));
   }


}

