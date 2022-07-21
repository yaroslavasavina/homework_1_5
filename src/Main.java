import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     // Task 1_1
        int [] array = new int [3];
         array[0] = 1;
         array[1] = 2;
         array[2] = 3;
        System.out.println(Arrays.toString(array));

        // Task 1_2
        double[] array2 = {1.57, 7.654, 9.986};
        array2[0] = 1.57;
        array2[1] = 7.654;
        array2[2] = 9.986;
        System.out.println(Arrays.toString(array2));

        // Task 1_3

        int [] boxes = {2,4,7};
        int applesBox = boxes[0];
        int orangesBox = boxes[1];
        int lemonBox = boxes[2];
        System.out.println(applesBox);
        System.out.println(orangesBox);
        System.out.println(lemonBox);


    }
}