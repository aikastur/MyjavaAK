public class Overtest {
    public static  void main(String args[]) {
        Overload my = new Overload();
        int i =19;
        my.test();
        my.test(123.8);
        my.test(25,50);
        my.test(i);
    }
}
