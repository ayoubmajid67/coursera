package arrayandarraylist;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Main {

    public static void main(String[] args) {
     System.out.println("Hello World");
        ArrayAndArrayList myArrayAndArrayList = new ArrayAndArrayList();
     int[] array1 = {0, 1, 0, 2, 0, 0, 5,0};
     int[] testArray1 = {1, 2, 3, 5, 0, 0, 0, 0};
     myArrayAndArrayList.swapZero(array1);
     assertArrayEquals(testArray1, array1);

     int[] array2 = {};
     int[] testArray2 = {};
     myArrayAndArrayList.swapZero(array2);
     assertArrayEquals(testArray2, array2);

     int[] array3 = {0, 1, 0, 2, 0, 3, 0, 10};
     int[] testArray3 = {1, 2, 3, 10, 0, 0, 0, 0};
      myArrayAndArrayList.swapZero(array3);
     assertArrayEquals(testArray3, array3);

 }
}
