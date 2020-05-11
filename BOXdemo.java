import java.lang.invoke.VolatileCallSite;

public class BOXdemo {
public static void main(String args[])
    {
        Box mybox = new Box();
        double vol;

        vol = mybox.volume();
        System.out.println(vol);
    }
}
