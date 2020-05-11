public class Figmain {
    public static void main(String args[]) {
        Fig k;
        k = new Fig(2, 5);
        System.out.println(k.area());
        k= new Rectangle(2,3);
        System.out.println(k.area());
        k = new Triangle(6,8);
        System.out.println(k.area());
    }

}
