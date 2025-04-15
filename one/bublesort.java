package one;

public class bublesort {

    public static void main(String[] args) {
        //bublesort in java
        //7 8 3 1 2 given array
        //for accending order we took condition (i<arr.length-1)
        //for decending order reverse condition of accending order

        int arr[] = {7,8,3,1,2};

        //bubble sort
        //time complexity =O(npow2)//it is very huge
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-i-1;j++) {
                if(arr[j]> arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
for(int i=0;i<arr.length;i++) {
    System.out.print(arr[i]+" ");
}

    }
}
