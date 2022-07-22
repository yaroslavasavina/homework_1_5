import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1+2+3

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
            System.out.println(Arrays.toString(array));
  //      for (int i = array.length - 1; i > 0; i--)
  //          System.out.print(array[i] + ",");
  //          System.out.println(array[0]);

          for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
            System.out.println(i + 1);
          } else {
            System.out.println(i);
          }
       }
            System.out.println();

        double[] arr = {1.57, 7.654, 9.986};
            System.out.println(Arrays.toString(arr));
        for (int y = arr.length-1; y>0 ; y--)
            System.out.print(arr[y]+", ");
            System.out.print(arr[0]);

            System.out.println();

        int [] boxes = {5,6,7,8,9};
            System.out.println(Arrays.toString(boxes));
        for (int a = boxes.length-1; a>0 ; a--)
            System.out.print(boxes[a]+", ");
            System.out.print(boxes[0]);

    }
}