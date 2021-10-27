public class Main {
    public static void main(String[] args) {
        // NOTE: The following input values will be used for testing your solution.
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2a = {4, 5, 6, 7, 8, 1, 2, 3};
        // isRotation(array1, array2a) should return false.
        int[] array2b = {4, 5, 6, 7, 1, 2, 3};
        // isRotation(array1, array2b) should return true.
        int[] array2c = {4, 5, 6, 9, 1, 2, 3};
        // isRotation(array1, array2c) should return false.
        int[] array2d = {4, 6, 5, 7, 1, 2, 3};
        // isRotation(array1, array2d) should return false.
        int[] array2e = {4, 5, 6, 7, 0, 2, 3};
        // isRotation(array1, array2e) should return false.
        int[] array2f = {1, 2, 3, 4, 5, 6, 7};
        // isRotation(array1, array2f) should return true.
        System.out.println(isRotation(array1, array2a));
        System.out.println(isRotation(array1, array2b));
        System.out.println(isRotation(array1, array2c));
        System.out.println(isRotation(array1, array2d));
        System.out.println(isRotation(array1, array2e));
        System.out.println(isRotation(array1, array2f));
    }

    // Implement your solution below.
    public static Boolean isRotation(int[] array1, int[] array2) {

      // Quick check if the arrays are of the same size
      if(array1.length != array2.length){return false;}

      int p1 = 0; // Pointer 1
      int p2 = 0; // Pointer 2
      int counter = 0;

      // First find pointer2 correct position
      while(array1[p1] != array2[p2]){
        if(counter >= array2.length - 1){return false;}
        p2++;
        counter++;
      }

      // Begin Rotation Check
      while(true){
        if(p1 == array1.length){return true;} // Exit condition 
        if(p2 == (array2.length)){p2 = 0;} // reset p2 to starting position 

        if(array1[p1] != array2[p2]){
          return false;
        }

        p1++;
        p2++;
      }
    }
}
