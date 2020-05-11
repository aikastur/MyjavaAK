public class Subinbox extends Inbox{

   double mass;
   Subinbox (Subinbox ob) {
       super(ob);
       mass = ob.mass;
   }
    Subinbox(double l,double h,double w,double m){
        super(l, h, w);
        mass=m;
    }
}
