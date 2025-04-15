package one;
class shape {
    public void area() {
        System.out.println("displays area");
    }
}
class triangle extends shape {
    public void area(int l,int h) {
        System.out.println(1/2*l*h);
    }
}
public class singleLevelInhertance {
    public static void main(String[] args) {
triangle t1 = new triangle();
       t1.area();

    }
}
