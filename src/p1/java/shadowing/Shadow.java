package p1.java.shadowing;

public class Shadow {
    static int x = 90;

    public static void main(String[] args) {
        System.out.println("Variable X Before Shadowing: " + x);
        int x = 50; // This x shadows the class-level x which is at line 4
        System.out.println("Variable X After Shadowing: " + x);
        beforeShadow();
    }

    public static void beforeShadow() {
        System.out.println("Variable X In Before Shadow Method: " + x);
    }
}
