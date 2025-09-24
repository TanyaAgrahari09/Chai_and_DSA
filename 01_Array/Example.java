

import java.util.Arrays;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        //input using for loop

        for(int i = 0; i < arr.length; i++){
            arr[i]= sc.nextInt();
        }

        //output using for loop
        
        //Method 1.
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        //Method 2.
        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();

        //Method  3.
        System.out.println(Arrays.toString(arr));
    }
}
