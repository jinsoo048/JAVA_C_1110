package jjs.decision;

public class SwitchClass {

    public static void main(String[] args) {

        String mySwitch = "off";

        switch (mySwitch) {
            case "on":
                System.out.println("turn on the light");
                break;
            case "off":
                System.out.println("turn off the light");
                break;
        }
    }
}
