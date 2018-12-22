import java.util.Arrays;
import java.util.Scanner;

public class Functions {

    public static boolean arraysAreEqual(int[] array, int[] array2){
        boolean isEqualLength = array.length == array2.length;

        if(!isEqualLength){
            return false;
        }

        for(int i = 1; i < array.length; i++)
        {
            if(array[i] != array2[i]){
                return false;
            }
        }

        return true;
    }

    public static String arrayIntToString(int[] array){
        Scanner sc = new Scanner(Arrays.toString(array)).useDelimiter("\\D");
        String str = "";

        while(sc.hasNext()){
            str = str.concat(sc.next());
        }


        return str;
    }

    // Converts character array to int array
    public static int[] charToIntArr(char[] charInputA) {
        int[] arr = new int[charInputA.length];

        for(int i = 0; i < arr.length; i++){
            arr[i] = charInputA[i] - '0';
        }

        return arr;
    }

}