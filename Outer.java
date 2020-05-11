public class Outer {
    int a = 10;


    class Inner {
        void display() {
            System.out.println(a);
        }
    }
        void test() {
            Inner b = new Inner();
            b.display();
        }
    }



