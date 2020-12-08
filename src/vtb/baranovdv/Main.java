package vtb.baranovdv;

public class Main {
    public static void reverseArr(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = tmp;
        }
    }

    public static void shiftLeft(int[] arr) {
        int lastIndex = arr.length - 1;
        int tmp = arr[0];
        for (int i = 0; i < lastIndex - 1; i++) arr[i] = arr[i + 1];
        arr[lastIndex] = tmp;
    }

    public static void main(String[] args) {

        //Д3 4_2 Реверс массива

        int[] array1 = {6, 4, 6, 48, 59, 55, 87, 98, 86}; //создаем первый массив и выводим его на экран
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i] + " ");
        }

        System.out.println();

        reverseArr(array1); //создаем второй массив равный по длине первому
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i] + " ");
        }
    }
}
