public class B extends A{
    int k;
    B(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void show() {
        System.out.println("value of k is " + k);
        super.show();
    }
}
