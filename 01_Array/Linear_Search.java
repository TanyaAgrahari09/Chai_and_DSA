import java.util.Scanner;

public class Linear_Search {
    public static int linearSearch(int numbers[], int key){
        for(int i=0; i< numbers.length; i++){
            if(numbers[i] == key){
                return i; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int result = linearSearch(arr, key);
        if(result == -1){
            System.out.print("Element not present.");
        }else{
            System.out.println("Element is present at index: "+ result);
        }
    }
}
