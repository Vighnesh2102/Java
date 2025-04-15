package one;

public class bit {
    //get bit example
    public static void main(String[] args) {
        int n=5;
        int pos =3;
        int bitMask =pos; //bitmask is use for shift bits

        if((bitMask & n)== pos>>1) {
            System.out.println("Bit is zero");

        }
        else {
            System.out.println("bit is one");
        }
    }

    }
