package one;

public class baktrackingquction1 {
    //find permutation of "abc" string
    //permutation mens multiple ways but not repted
    public static void printPermutation(String str, String perm, int idx) {
        if(str.length() ==0){ //base case
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++) {
            char currChar = str.charAt(i);
            String newStr =str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr,perm+currChar,idx);
        }
    }
    public static void main(String[] args) {
        String str ="abc";
        printPermutation(str,"",0);
    }
}
