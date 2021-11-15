package jjs.control;

public class TotalLab {

    public static void main(String[] args) {
        int age = 53;
        String gender = "male";

        //if-else
        if (age < 20) {
            System.out.println("go home");
        } else {
            System.out.println("go to the bar");
        }

        //switch
        switch (gender) {
            case "male":
                System.out.println("male bathroom");
                break;
            case "female":
                System.out.println("female bathroom");
                break;
            case "others":
                System.out.println("both ok");
                break;
        }

        //loop
        System.out.println("Let's get some money");
        int sum = 0;
        int money = 0;

        for (int i=0; i < age; i++) {
            sum += i;
        }
        money = sum * 1000;

        System.out.println("your gamble money = " + money);

    }
}

