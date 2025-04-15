package one;

public class stringsbuldire {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("tony");
        System.out.println(sb);

        //char at index  0
        //using print character in any word and sentence which stored in string

        System.out.println(sb.charAt(0));

        //set character at index
        //replace characters
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        //character iserting in strin
        //write index which u want to store it and give that particular character or word to  insert in the stringu
        //using insert function u will insert at any location of sentence or word
        sb.insert(0,'s');
        System.out.println(sb);

        //deleting any word or chararcter using string bulider delete function
        sb.delete(0,1);
        System.out.println(sb);

        //append function use in string bulider for add word or char or sentence in last of string

        StringBuilder sp = new StringBuilder("h");
        sp.append("e");
        sp.append("l");
        sp.append("l");
        sp.append("o");
        System.out.println(sp);
        //use for claculate string bulider lentgth
        System.out.println(sp.length());

        //reverse string
     StringBuilder sc = new StringBuilder("hello");
     for(int  i=0; i<sc.length()/2;i++) {
      int  front =i;
      int back =sb.length() -1 -i; //6-1-0 = 5
      char frontchar = sc.charAt(front);
      char backchar = sc.charAt(back);
      sc.setCharAt(front, backchar);
      sc.setCharAt(back , frontchar);

     }
     System.out.println(sc);
    }
}
