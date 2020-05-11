public class Absmain {
    public static void main(String args[]) {
        AbsA j;
        j = new AbsB(2,6);
        System.out.println(j.area());
        j = new AbsC(4,8);
        System.out.println(j.area());



    }
}
