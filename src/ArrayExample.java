import java.util.Random;
import java.util.Scanner;


public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("List of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i]+ " ");
        }
        return arr;
    }
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr  = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n INPUT 1 number");
        int x = scanner.nextInt();
        try{
            System.out.println("arr[x] = " + arr[x] );
        } catch(IndexOutOfBoundsException e){
            System.err.println("Out of array.length");
        }
    }
}
