package jjs.statics;

public class static1 {
    static String message = "Hello Static!";
    static int myStaticMethodReturn = myStaticMethod();

    static {
        System.out.println("Static Block -> " + message);
    }

    public static int myStaticMethod() {
        System.out.println("Static Method -> " + message);
        return 10;
    }


    public static void main(String[] args) {

    }
}
