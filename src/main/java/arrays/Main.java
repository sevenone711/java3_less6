package arrays;

import java.util.Arrays;

public class Main {
//    1. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив. Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
//    Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//    Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//    2. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы, то метод вернет false; Если есть элементы отличные от 1 и 4 то вернуть false. Написать набор тестов для этого метода (по 3-4 варианта входных данных).
//            [ 1 1 1 4 4 1 4 4 ] -> true
//            [ 1 1 1 1 1 1 ] -> false
//            [ 4 4 4 4 ] -> false
//            [ 1 4 4 1 1 4 3 ] -> false


    public static void main (String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int arr2[] = {1,4,4,4,4};
        int arr3[] = {1,4,23,43,2};
        int arr4[] = {1,4,1,1,5};
        int arr5[] = {1,1,1,1,4,5,6,7};

        boolean result;
        System.out.println("Вх: ->" + Arrays.toString(arr) + "Вых.: -> " + Arrays.toString(getLeterFour(arr)));
        System.out.println("Вх: ->" + Arrays.toString(arr2) + "Вых.: -> " + Arrays.toString(getLeterFour(arr2)));
        System.out.println("Вх: ->" + Arrays.toString(arr3) + "Вых.: -> " + Arrays.toString(getLeterFour(arr3)));
        System.out.println("Вх: ->" + Arrays.toString(arr4) + "Вых.: -> " + Arrays.toString(getLeterFour(arr4)));
        System.out.println();
        System.out.println(Arrays.toString(arr) + " -> " +  gettOneAndFourArrays(arr));
        System.out.println(Arrays.toString(arr2) + " -> " +  gettOneAndFourArrays(arr2));
        System.out.println(Arrays.toString(arr3) + " -> " +  gettOneAndFourArrays(arr3));
        System.out.println(Arrays.toString(arr4) + " -> " +  gettOneAndFourArrays(arr4));
        System.out.println(Arrays.toString(arr5) + " -> " +  gettOneAndFourArrays(arr5));


    }

    private static boolean gettOneAndFourArrays (int[] arr) {
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


    private static int[] getLeterFour (int[] arr) throws RuntimeException {
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
