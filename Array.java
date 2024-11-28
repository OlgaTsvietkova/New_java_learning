package New;

import java.util.Scanner;


public class Array {

    public static void main(String[] args){
        int[] arr = new int [4];
        Scanner scanner = new Scanner(System.in);

        for (int i=0; i< arr.length; i++ ){
            System.out.print("Enter number: ");
            int value = scanner.nextInt();
            arr[i] = value;}

        int x = arr[0];
        for (int i=0; i< arr.length; i++ ){
            if (arr[i] < x)
                x = arr[i];
        }
        System.out.print("Minimal: " + x);

    }
}
