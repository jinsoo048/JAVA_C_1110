package jjs.control.loop;

public class ForClass {

    public static void main(String[] args){
        int sum = 0;

        for(int i=0 ; i<10 ; i++){
            sum += i;
            System.out.println("i = "+i+"   "+"sum = "+sum);
        }
    }
}
