
//Arrays are passed as 'pass by reference'

import java.util.Scanner;

public class ArrayAsArguments {
    public static void update(int marks[]){
        for(int i = 0;i<marks.length; i++){
            marks[i]= marks[i] + 1;
        }
    }
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[5];
        for(int i =0; i< marks.length; i++){
            marks[i]= sc.nextInt();
        }
        update(marks);
        for(int num : marks){
            System.out.print(num + " ");
        }
    }
}
