package one;

import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        //update the 2nd bit (position =1)  of a number n to 1.(n =0101)<
        //for 0 Bit mask : 1<<i / operation : AND with NOT / for 1 :BitMask : 1<<i/ Operation :or
        Scanner sc =new Scanner(System.in);
        int oper =sc.nextInt();
        //oper 1: set oper =0:clear
        int n =5;
        int pos =1;

        int bitMask = 1<<pos;
        if(oper == 1 ) {
            int newnumber =bitMask | n;
            System.out.println(newnumber);
        }
        else
        {
            int NotBitmask = ~(bitMask);
            int newnumber= NotBitmask & n;
            System.out.println(newnumber);
        }



    }
}
