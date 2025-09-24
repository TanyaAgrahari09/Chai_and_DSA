import java.util.Scanner;

public class Reverse_Array {
    public static void reverseArray(int numbers[]){
        int start = 0 , end = numbers.length -1;
        while(start< end){

            //swap
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
