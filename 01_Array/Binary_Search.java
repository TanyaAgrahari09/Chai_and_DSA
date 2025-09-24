import java.util.Scanner;

public class Binary_Search {
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length -1;
        while(start <= end){
            int mid = (start + end)/ 2;

            //comparison
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid]>key){
                end = mid -1;
            }else{
                start = start + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i =0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int key = sc.nextInt();
        int index = binarySearch(arr,key);
        if(index == -1){
            System.out.println("Element not present!");
 
        }else{
            System.out.println("Element is present at index: "+ index);

        }
        
    }
}
