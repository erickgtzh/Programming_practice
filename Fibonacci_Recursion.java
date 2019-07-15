import java.util.*;

import static java.lang.Thread.onSpinWait;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        fibo(0);
    }

    static int num1 = 0;
    static int num2 = 1;
    private static void fibo(int num) {
        if(num<500){
            num = num1+num2;
            num1 = num2;
            num2 = num;
            System.out.println(num);
            fibo(num);
        }
    }
}
