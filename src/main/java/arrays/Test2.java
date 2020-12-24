package arrays;

import java.util.Arrays;

public class Test2 {
    public static boolean gettOneAndFourArrays (int[] arr) {
        boolean result;
        String arrString = Arrays.toString(arr);
        if(arrString.indexOf(String.valueOf(4)) != -1 && arrString.indexOf(String.valueOf(1)) != -1){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 1 && arr[i] != 4){

                    result = false;
                    return result;
                }
                else {
                    continue;
                }

            } return true;
        }else {
            return false;
        }
    }
}
