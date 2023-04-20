

/**
 * HomeWork1
 */
public class HomeWork1 {

    public static void main(String[] args) {

        int []array1 = new int[]{1,3,5,7,9};
        int []array2 = new int[]{2,4,6,8,10,12};
        int []array3 = new int[]{2,0,6,0,8};
        int []array4 = new int[]{5,6,15,14,81};
        printArray(Difference(array4, array1));
        printArray(Difference(array2, array1)); // Пример ошибки (несоответствующая длина)
        printArray(Division(array4, array1));
        printArray(Division(array4, array2));   // Пример ошибки (несоответствующая длина)
        printArray(Division(array4, array3));   // Пример ошибки (деление на ноль)
    }

    /*
     Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
     и возвращающий новый массив, каждый элемент которого равен разности элементов 
     двух входящих массивов в той же ячейке. Если длины массивов не равны, 
     необходимо как-то оповестить пользователя.
     */

     public static int []Difference(int[]array1, int[]array2){
        if (array1.length != array2.length)
        {
            throw new RuntimeException("Невозможно вычислить разность, т.к. длины массивов не равны");
        }
        int []array = new int[array1.length];
        for (int i=0; i<array1.length; i++)
        {
            array[i] = array1[i] - array2[i];
        }

        return array;
     }

     /*
      Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
      и возвращающий новый массив, каждый элемент которого равен частному элементов 
      двух входящих массивов в той же ячейке. Если длины массивов не равны, 
      необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
      которое пользователь может увидеть - RuntimeException, т.е. ваше
      */

     public static int []Division(int []array1, int []array2) {
        if (array1.length != array2.length)
        {
            throw new RuntimeException("Невозможно вычислить частное, т.к. длины массивов не равны");
        }
        int []array = new int [array1.length];
        for(int i=0; i<array1.length; i++)
        {
            if (array2[i] != 0)
            {
                array[i] = array1[i] / array2[i];
            }
            else
            {
                throw new RuntimeException("Невозможно вычислить частное, т.к. делить на 0 нельзя! " + i + " элемент в массиве-делителе");
            }
        }

        return array;
     }

     public static void printArray(int []array) {
        for (int i=0; i<array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
     }
}