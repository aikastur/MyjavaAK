public class Inbox {
    private double height;
    private double length;
    private double width;
    Inbox(Inbox ob) {
        width = ob.width;
        length = ob.length;
                height= ob.height;

    }
    Inbox(){
        width =1;
        length = 1;
        width =1;

    }
    Inbox(double l,double  h, double w) {
       length =l;
      height =h;
         width=w;

    }
    Inbox(double a){
        length=width=height=a;
    }
double volume() {
        return width*length*height;
}
}
