public class Dynamic {
    public static void main(String args[]) {

        DynamicA r;

        r= new DynamicA();
        r.callme();
        r=new DynamicB();
        r.callme();
        r= new DynamicC();
        r.callme();


    }
}
