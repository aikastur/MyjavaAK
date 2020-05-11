public class Student {
    int rollnum;
    String name;
    static String colname = "CBIT";
    static void change() {
        colname = "RIT";
    }
    Student(int r ,String n) {
        rollnum= r;
        name = n;
    }
void display() {
    System.out.println(name + rollnum + colname);
}
}
