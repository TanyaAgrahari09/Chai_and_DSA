import java.util.Scanner;

public class Largest_Number {
    public static int largestNumber(int numbers[]){
        int max= Integer.MIN_VALUE;
        for(int i =0; i< numbers.length;i++){
            if(numbers[i] > max){
                max= numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = largestNumber(arr);
        System.out.println("Largest number is: "+ max);
    }
}
