import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Задание 1. Замена элементов массива");
        changeElementsOfArray();
        System.out.println();
        System.out.println("Задание 2. Создать массив и заполнить его значениями");
        fillingArray();
        System.out.println();
        System.out.println("Задание 3. Создать массив и числа меньше 6 умножить на 2");
        multiplication();
        System.out.println();
        System.out.println("Задание 4. Создать квадратный двумерный массив и заполнить диагональ единицами");
        square(); 
        System.out.println();
        System.out.println("Задание 5. Создать массив и найти минимальное и максимальное значение");
        minMax();
    }

    //Задание 1. Создать массив, с помощью цикла и условия заменить "1" на "0" и "0" на "1"
    public static void changeElementsOfArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Old array " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else if (arr[i] == 0) {
                arr[i] = 1;
            }
        }
        System.out.println("New array " + Arrays.toString(arr)); //Если прописать sout внутри цикла for, мы увидим пошаговое изменение каждого элемента массива
    }

    //Задание 2. Создать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21ы
    public static void fillingArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println("Array " + Arrays.toString(arr));
    }

    //Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
    public static void multiplication() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Old array " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println("New array " + Arrays.toString(arr));
    }

    //Задание 4. Создать квадратный двумерный целочисленный массив и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    public static void square() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][i] = 1;
                System.out.println("[" + i + "]" + arr[i][j]); //Возникла трудность. Массив отображается в консоли, но столбиком, а не строками...
            }
            System.out.println();
        }
    }

    //Задание 5. Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    public static void minMax() {
        int[] arr = {-3, 26, -48, 5, 2, 74, 21};
        int min = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Minimal array's element is " + min);
        System.out.println("Maximal array's element is " + max);
    }
}
