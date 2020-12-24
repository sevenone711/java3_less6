package arrays;

import java.util.Arrays;

public class Test1 {
    public static int[] getLeterFour (int[] arr) throws RuntimeException {
        int temp = 0;

        String arrString = Arrays.toString(arr);

        if(arrString.indexOf(String.valueOf(4)) != -1){ //Проверка есть ли в массиве значение 4
            for (int i = 0; i < arr.length; i++){
                if (arr[i] == 4){
                    temp = i; //определяем позицию четверки

                }

            }
            int[] outArra = new int[arr.length - temp - 1]; //создаем массив что бы длина его была от следующей ячейки входящего массива

            System.arraycopy(arr,temp + 1,outArra,0,outArra.length);  //скопировали весь массив после четверки в новый массив
            return outArra;
        }else {
            throw new RuntimeException("В массиве нет четверки!");
        }
    }
}
