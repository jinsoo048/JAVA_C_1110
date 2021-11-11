package JJ;

public class MyAdd {
    int a;
    int b;
    int sum;

    void myMethod(){
        a = 100;
        b = 200;
        sum = a + b;

        System.out.println(sum);
    }

    public static void main(String[] args){
        MyAdd myAdd = new MyAdd();
        myAdd.myMethod();
    }

}
