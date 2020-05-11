public class Turn {
    int a;
    Turn(int i)
    {
        a=i;
    }
    Turn incrbyten() {
        Turn temp = new Turn(a+10);
        return temp;

    }

}
