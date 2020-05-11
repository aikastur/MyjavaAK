public class Overload {

    void test() {
        System.out.println("no paramaters");
    }

    void test(double a) {
        System.out.println(a);
    }

    void test(int a, int b) {
        System.out.println(a + b);
    }
}
