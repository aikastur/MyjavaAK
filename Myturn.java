public class Myturn {
    public static void main(String args[]) {
        Turn ab = new Turn(30);
        Turn ac;
        ac = ab.incrbyten();
        System.out.println(ab.a);
        System.out.println(ac.a);
        ac= ac.incrbyten();
        System.out.println(ac.a);

    }
}
