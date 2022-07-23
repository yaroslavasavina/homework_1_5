import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1+2+3

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        for (int i = 0; i < array.length ; i++) {
            if (i < array.length-1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.println(array[2]);
            }
        }
        for (int i = array.length-1; i >=0 ; i--) {
            if(i<= array.length-1 && i>0 ){
                System.out.print(array[i]+", ");
            }else {
                System.out.print(array[i]);
            }
        }
                System.out.println();

          for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(i + 1);
          } else
                System.out.println(i);{
          }
       }
                System.out.println();

        double[] arr = {1.57, 7.654, 9.986};
        for (int a = 0; a < arr.length; a++) {
            if (a<arr.length-1) {
                System.out.print(arr[a] + ", ");
            }else{
                System.out.print(arr[a]);
            }
        }
                System.out.println();

        for (int a = arr.length-1; a>0 ; a--) {
                System.out.print(arr[a] + ", ");
                System.out.print(arr[0]);
        }
                System.out.println();

        int [] boxes = {5,6,7,8,9};
        for (int y = 0; y < boxes.length ; y++) {
            if (y < boxes.length-1){
                System.out.print(boxes[y] + ", ");
            }else{
                System.out.print(boxes[y]);
            }
        }
                System.out.println();

        for (int y = boxes.length-1; y>=0 ; y--) {
            if (y <= boxes.length-1 && y > 0) {
                System.out.print(boxes[y] + ", ");
            } else {
                System.out.print(boxes[0]);
            }
        }
    }
}