package one;
import java.util.*;
public class array2 {
    public static void main(String[] args) {
        //2d array
        Scanner sc = new Scanner(System.in);
        int matrix1[][] =new int[3][3];
        int matrix2[][] =new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j]= sc.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int matrix = matrix1[i][j]+ matrix2[i][j];
                System.out.print(matrix+" ");
            }
            System.out.println();
        }
    }
}
