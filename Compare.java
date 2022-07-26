// code by savir singh

import java.util.*;

public class Compare {
    public static void main(String[] args) {

        Scanner a1 = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int a = a1.nextInt();
        int b = a1.nextInt();

        if(a > b) {
            System.out.println(String.valueOf(a) + " is larger than " + String.valueOf(b));
        }
        else if (a < b) {
            System.out.println(String.valueOf(b) + " is larger than " + String.valueOf(a));
        }
        else {
            System.out.println(String.valueOf(a) + " is equal to " + String.valueOf(b));
        }

    }
}
