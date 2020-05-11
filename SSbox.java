public class SSbox {
    public static void main(String args[]){
        Subinbox S1 = new Subinbox(1,2,7,9);

        double a = S1.volume();
        System.out.println("Volme of cboid is" + a + "mass is " + S1.mass);
        Subinbox S2 =  new Subinbox(2,3,5,2);
        double b = S2.volume();

        System.out.println("Volme of cboid is" + b+ "mass is " + S2.mass);
    }
}
