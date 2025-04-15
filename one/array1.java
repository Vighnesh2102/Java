package one;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={25,55,22,2};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

    }
}
