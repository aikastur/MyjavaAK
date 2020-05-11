public class Supersub{
public static void main(String args[]) {
    Super sup = new Super();
    Sub s1 = new Sub();
    sup.i = 10;
    sup.j = 20;
    sup.showij();
    s1.i=1;
    s1.j=2;
    s1.k= 3;
    s1.showk();
    s1.sum();
}

}
